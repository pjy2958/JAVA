package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertMain03 {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@192.168.119.119:1521:dink";
			String user = "scott";
			String password = "tiger";
			conn = DriverManager.getConnection(url, user, password);
			
			String id = "Lee";
			String name = "이길동";
			String sql = "insert into tab_test(id, name) values(?, ?)";
			
			// 이런 객체를 가지고 있는 statement를 준비해라.
			pstmt = conn.prepareStatement(sql);
			// 1번 물음표와 2번 물음표에 데이터 삽입 => DB는 인덱스가 0부터 시작하지 않기 때문에 1부터 시작
			// prepareStatement의 경우 like가 안됌 -> 이럴때만 statement 객체 사용
			pstmt.setString(1, id);
			pstmt.setString(2, name);
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 행이 삽입되었습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if(conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}