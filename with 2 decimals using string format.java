import java.io.*;
import java.util.Scanner;
public class Class211042010057{
	 public static void main(String[] args) { 
	     Scanner input = new Scanner(System.in);
	     int billwt;
	     billwt = input.nextInt();
	     System.out.println("The Tax is "+ (String.format("%.2f",billwt*(0.18f))));
	     System.out.println("The Tip is "+ (String.format("%.2f",billwt*(0.05f))));
	     System.out.println("Total Bill with Tax and Tip is "+ (String.format("%.2f",billwt + billwt*(0.18f) + billwt*(0.05f))));
		
	}
}

/*
521
The Tax is 93.78
The Tip is 26.05
Total Bill with Tax and Tip is 640.83 */
