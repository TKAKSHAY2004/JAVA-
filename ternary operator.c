import java.io.*;
import java.util.Scanner;
class ternary {
	 public static void main(String[] args) { 
	     Scanner input = new Scanner(System.in);
	     
	     System.out.println("Enter age: ");
	     int age = input.nextInt();
	     
	    String vote = (age>=18) ? "eligible to vote" : "not eligible to vote";
	     
	     System.out.println(vote);
	 }
}
