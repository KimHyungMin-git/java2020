import java.util.Scanner;
public class CH11_RecursionCountOnes {
	public static void main(String arg[]) {
		System.out.println("Enter a nonnegative number:");
		Scanner key= new Scanner(System.in);
		int number = key.nextInt();
		System.out.println(number + " contains "+ numberOfOnes(number)+ " ones.");
		key.close();
	}
	public static int numberOfOnes(int n) {
		if(n==1)
			return 1;
		else if(n<10)
			return 0;
		else if(n%10==1)
			return numberOfOnes(n/10)+1;
		else {
			return numberOfOnes(n/10);
		}
	}
}
