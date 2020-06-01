import java.io.*;
public class CH10_TimesTable {
	public static void main(String arg[]) {
		PrintWriter table=null;
		int i;
		try {
		table= new PrintWriter("ThreeTimesTable.txt");
		System.out.println("I am writing the 3 times table...");
		table.println("3 times table\n");
		for(i=1; i<=9; i++) {
			table.println(i+" * 3 = "+i*3);
		}
		System.out.print("3 times table was created in the ThreeTimesTable.txt");
		}
		catch(FileNotFoundException e){
			System.out.println("Error: There is no file");
		}
		finally {
			table.close();
		}
	}
}

