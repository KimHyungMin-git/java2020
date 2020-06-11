import java.util.ArrayList;
public class CH12_ClassList {
ArrayList<String> listclass=new ArrayList<String>();
	public void add(String s) {
		listclass.add(s);
	}
	public void Print() {
		System.out.println("\nList of classes.");
		for(int i=0; i<listclass.size(); i++) {
			System.out.println("Class "+(i+1)+": "+listclass.get(i));
		}
	}
}
