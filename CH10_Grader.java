import java.io.*;
import java.util.Scanner;
public class CH10_Grader {
	public static void run(String in, String out) {
		String name;
		String id;
		int i=0;
		float java_ave=0;
		float data_ave=0;
		float open_ave=0;
		float cal_ave=0;
		float ave_ave=0;
		float ave=0;
		int java;
		int data;
		int open;
		int cal;
		String line;
		try {
		PrintWriter output= new PrintWriter(out);
		Scanner input= new Scanner(new File(in));
		line=input.nextLine();
		output.println("Name,StudentNum,Java,DataStructure,OpenSource, Cal1, Average");
		while(input.hasNextLine()) {
			i++;
			line=input.nextLine();
			String []ary=line.split(",");
			name=ary[0];
			id=ary[1];
			java=Integer.parseInt(ary[2]);
			data=Integer.parseInt(ary[3]);
			open=Integer.parseInt(ary[4]);
			cal=Integer.parseInt(ary[5]);
			java_ave+=java;
			data_ave+=data;
			open_ave+=open;
			cal_ave+=cal;
			ave_ave=(float)(java+data+open+cal)/4;
			ave+=ave_ave;
			output.println(name+","+id+","+java+","+data+","+open+","+cal+","+ave_ave);
		}
		java_ave/=i;
		data_ave/=i;
		open_ave/=i;
		cal_ave/=i;
		ave/=i;
		output.print("Average,000000,"+java_ave+","+data_ave+","+open_ave+","+cal_ave+","+ave);
		output.close();
		input.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("File is not found");
		}
		
	
	}
}
