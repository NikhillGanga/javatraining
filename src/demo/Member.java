package demo;

public class Member {

	
	private String memberName;
	long number;
	
	
	
	public Member( String memberName, long number) {
		super();
		
		this.memberName = memberName;
		this.number = number;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
}
