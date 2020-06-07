public class CH08_ClassFriend extends CH08_SchoolFriend {
	private String cl=new String();
	public CH08_ClassFriend (String s,String c) {
		super(s);
		cl=c;
	}
	public void whatfriend() {
		System.out.println("We are frineds.");
		System.out.println("in "+getschool());
		System.out.println("in "+cl);
		
	}
}