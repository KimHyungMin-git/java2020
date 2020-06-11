import java.util.ArrayList;
import java.util.Scanner;
public class CH12_ClassList_main {
	public static void main(String[] args) {
		CH12_ClassList myclasses= new CH12_ClassList();
		Scanner kb= new Scanner(System.in);
		String s= "";
		System.out.println("Enter the list of classes.");
		boolean isActive= true;
		while(isActive){
			System.out.print("Class name: ");
			s= kb.nextLine();
			if(s.equalsIgnoreCase("exit")){
				myclasses.Print();
				isActive= false;}
			else myclasses.add(s);}kb.close();}}
