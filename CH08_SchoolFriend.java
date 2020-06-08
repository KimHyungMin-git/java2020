public class CH08_SchoolFriend extends CH08_Friend{
	private String school=new String();
	public CH08_SchoolFriend(String s) {
		super();
		school=s;
	}
	public void whatfriend() {
		System.out.println("We are frineds.");
		System.out.println("in "+school);
	}
	public String getschool() {
		return school;
	}
}

