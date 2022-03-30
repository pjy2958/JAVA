package kr.ac.kopo.project01;

public class Member {
	private String id;			// 아이디(필수)
	private int passward;		// 패스워드(필수)
	private String name;		// 회원이름(필수)
	private int phoneNumber;	// 전화번호(선택)
	private int memberNumber;	// 회원번호(필수)
	
	public Member() {
	}
	
	public Member(String id, int passward, String name, int memberNumber) {
		this(id, passward, name, 00000000000, memberNumber);
	}


	public Member(String id, int passward, String name, int phoneNumber, int memberNumber) {
		this.id = id;
		this.passward = passward;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.memberNumber = memberNumber;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


	public int getPassward() {
		return passward;
	}

	public void setPassward(int passward) {
		this.passward = passward;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", passward=" + passward + ", name=" + name + ", phoneNumber=" + phoneNumber
				+ ", memberNumber=" + memberNumber + "]";
	}
} 
