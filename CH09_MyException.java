public class CH09_MyException extends Exception{
	char index;
	public CH09_MyException(char message){
		index=message;}
	public String toString() {
		return "String should not include\nspecial character "+index+".";
	}
}

