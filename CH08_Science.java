public class CH08_Science extends CH08_Book {
	private String pu= new String();
	public String toString() {
		return "Id: "+super.id+"\nBook Name: "+super.getname()+"\nPublisher: "+pu;
	}
	public void print() {
		System.out.println("<<<Science>>>\n"+toString());
	}
	public CH08_Science(String n, String p) {
		super(n);
		pu=p;
	}
}
