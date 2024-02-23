import java.io.*;
import java.util.Scanner;
public class Class211042010057 {
	 public static void main(String[] args) { 
	     Scanner input = new Scanner(System.in);
	     char ch = input.next().charAt(0);
	     if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' 
             || ch=='o' || ch=='u'){
                System.out.println("Vowel");
        }else {
                System.out.println("Consonant"); 
        }
	}
}

/*
I
Vowel
  */
