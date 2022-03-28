package kr.ac.kopo.day13;

import java.io.File;

public class FileMain {

	public static void main(String[] args) {
		// 2번방법
		File dirObj = new File("iotest");
		// iotest디렉토리 아래에 있는 모든파일 / 디렉토리 출력
		if(dirObj.exists()) {
			File[] list = dirObj.listFiles();
			for(File f : list) {
				System.out.print(f.getName() + " ");
				System.out.println(f.isDirectory() ? "디렉토리" : "파일");
				System.out.println(f.length());
			}
			
//		1번방법
//			String[] list = dirObj.list();
//			for(String data : list) {
//				System.out.println(data);
//				File fileObj = new File(dirObj.getName() + "/" + data);
//				System.out.println(fileObj.isDirectory() ? "디렉토리" : "파일");
//			}
		}
		
		
		
	/*
		File dirObj = new File("iotest/강아지/리트리버");
		System.out.println("존재여부 : " + dirObj.exists());
		System.out.println("디렉토리여부 : " + dirObj.isDirectory());
		System.out.println("파일여부 : " + dirObj.isFile());
		
		if(!dirObj.exists())
			dirObj.mkdirs();	// 디렉토리 여러개생성(중간 parent 폴더까지 다 만듬)
//			dirObj.mkdir();		// 디렉토리 하나생성(경로의 맨마지막 폴더)
	*/	
		
	/*
		File fileObj = new File("iotest/a.txt");
		String fileName = fileObj.getName();
		String parent = fileObj.getParent();
		
		System.out.println("파일명 : " + fileName);	// 파일명 확인
		System.out.println("부모 : " + parent);	// 상위 디렉토리 확인
		
		System.out.println(fileObj.exists());	// 파일 존재여부 확인 : true or false
		
		long fileSize = fileObj.length();		// 파일 크기 확인
		System.out.println("파일 크기 : " + fileSize + "byte(s)");
		
		System.out.println(fileObj.canRead() ? "읽기가능" : "읽기불가능");
		System.out.println(fileObj.canWrite() ? "쓰기가능" : "쓰기불가능");
		
		long lastTime = fileObj.lastModified();	// 마지막 수정 날짜 => 밀리초로 나옴 => simpledateFormat이용
		String pattern = "yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println("마지막 수정시간 : " + sdf.format(new Date(lastTime)));
	*/
	}
}
