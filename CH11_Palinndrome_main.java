import java.util.Scanner;
public class CH11_Palindrome_main {
	public static boolean pail(char a[], int start, int end) {
		if(start>=end) {
			return true;
		}
		if(a[start]!=a[end]) {
			return false;
		}
		else {
			return pail(a,start+1,end-1);
		}
	}
	public static void main(String []arg) {
	Scanner key= new Scanner(System.in);
	System.out.print("Enter a string: ");
	String line=key.nextLine();
	String newline=line.toUpperCase();
	char newarray[]=newline.toCharArray();
	boolean cheak=pail(newarray,0,line.length()-1);
	if(cheak) {
		System.out.print(line+" is a palindrom.");
	}
	else {
		System.out.print(line+" is not a palindrom.");
	}
	key.close();
	}
	
}
