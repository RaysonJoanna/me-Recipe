package meRecipe.member;

import java.util.HashMap;

public class Member {
	HashMap<Integer,Member> members = new HashMap<Integer,Member>();
	
	private String ID;
	private String password;
	private int custNum;
	public static int createNum = 0;
	
	public Member() {}
	
	public Member(String ID, String password) {
		this.ID = ID;
		this.password = password;
		this.custNum = createCustNum();
	}
	
	public int createCustNum() {
		createNum++;
		return createNum;
	}
	
	public void addMem(Member member) {
		members.put(member.custNum, member);
	}
	
	public boolean searchID(String user_ID) {
		boolean existence = false;
		for(int num : members.keySet()) {
			if(user_ID.equals(members.get(num).ID)) {
				existence = true;
			} 
		}
		return existence;
	}
	
	public boolean searchPW(String user_pw) {
		boolean existence = false;
		for(int num : members.keySet()) {
			if(user_pw.equals(members.get(num).password)) {
				existence = true;
			} 
		}
		return existence;
	}
	
	public Member findMem(String user_ID) {
		Member member = new Member();
		for(int num : members.keySet()) {
			if(user_ID.equals(members.get(num).ID)) {
				member = members.get(num);
			}
		} return member;
	}
	
	public String getID() {
		return ID;
	}

	public String getPassword() {
		return password;
	}

	public int getCustNum() {
		return custNum;
	}

	@Override
	public int hashCode() {
		return custNum;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(this.custNum == member.custNum) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

}
