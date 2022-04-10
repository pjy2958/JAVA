package kr.ac.kopo.project02;

public class Member {
	private String id;			// 아이디(필수)
	private String passward;	// 패스워드(필수)
	private String name;		// 회원이름(필수)
	private int phoneNumber;	// 전화번호(선택)
	private String grade;		// 회원등급(자동)
	private int memberNumber;	// 회원번호(자동)
	
	public Member() {
		this(null, null, null, 00000000000, -1);
	}
	
	public Member(String id, String passward, String name, int memberNumber) {
		this(id, passward, name, 00000000000, memberNumber);
	}

	public Member(String id, String passward, String name, int phoneNumber, int memberNumber) {
		this.id = id;
		this.passward = passward;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.grade = "일반회원";
		this.memberNumber = memberNumber;
	}

	public int getMemberNumber() {
		return memberNumber;
	}

	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


	public String getPassward() {
		return passward;
	}

	public void setPassward(String passward) {
		this.passward = passward;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGrade() {
		return this.grade;
	}
	
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", passward=" + passward + ", name=" + name + ", phoneNumber=" + phoneNumber
				+ ", memberNumber=" + memberNumber + "]";
	}
} 
