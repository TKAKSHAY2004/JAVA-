import java.io.*;
import java.util.Scanner;
public class Class211042010057 {
	 public static void main(String[] args) { 
	     Scanner input = new Scanner(System.in);
	     int a=input.nextInt();
	     int b=input.nextInt();
	     int c=input.nextInt();
	     float s = (a+b+c)/2;
	     System.out.println((String.format("%.2f",Math.sqrt(s*(s-a)*(s-b)*(s-c)))));
		
	}
}

/*
5
5
4
9.17
*/
