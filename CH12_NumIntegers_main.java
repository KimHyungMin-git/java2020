public class CH12_NumIntegers_main {
	public static void main(String[] args) {
		String fileName = "CH12_numbers.txt";
		CH12_NumIntegers NI = new CH12_NumIntegers();
		System.out.println("Reading integers from the file.");
		NI.readdata(fileName);
		System.out.println("Reading Done!");
		System.out.print("\nThe file contains ");
		System.out.println(NI.getNumIntegers() + " different integers.\n");
		NI.printIntegers();}
}
