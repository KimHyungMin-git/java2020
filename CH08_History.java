public class CH08_History extends CH08_Book {
	private String au= new String();
	public String toString() {
		return "Id: "+super.id+"\nBook Name: "+super.getname()+"\nAuthor: "+au;
	}
	public void print() {
		System.out.println("<<<History>>>\n"+toString());
	}
	public CH08_History(String n, String a) {
		super(n);
		au=a;
	}
}
