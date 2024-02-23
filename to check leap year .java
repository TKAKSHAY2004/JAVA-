import java.io.*;
import java.util.Scanner;
class year {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int year = input.nextInt();

    if (year % 400 == 0) {
        System.out.println(year + " is a leap year.");
   }
   
   else if (year % 100 == 0) {
      System.out.println(year + " is not a leap year.");
   }
 
   else if (year % 4 == 0) {
        System.out.println(year + " is a leap year.");
   }
   else {
      System.out.println(year + " is not a leap year.");
   }
  }
}

/*
1996
1996 is a leap year. */

