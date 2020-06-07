public class CH08_Book {
	public static int no=1;
	public int id=no;
	private String name= new String();
	public String toString() {
		return "Id: "+id+"\nBook Name: "+name;
	}
	public void print() {
		System.out.println("<<<BOOK>>>\n"+toString());
	}
	public CH08_Book(String n) {
		name=n;
		no++;
	}
	public String getname() {
		return name;
	}
	
}
