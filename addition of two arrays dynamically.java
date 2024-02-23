import java.io.*;
import java.util.Scanner;
public class Class211042010057 {
	 public static void main(String[] args) { 
	    Scanner input = new Scanner(System.in);
	    int n = input.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
		    a[i] = input.nextInt();
		}
		int[] b=new int[n];
		for(int i=0;i<n;i++){
		    b[i] = input.nextInt();
		}
		System.out.println("Sum of two arrays: ");
		for(int i=0;i<n;i++){
		    System.out.print(a[i]+b[i] + " ");
		}
	}
}

/*
4
1 2 3 4
5 6 7 8
Sum of two arrays: 
6 8 10 12 
  */
