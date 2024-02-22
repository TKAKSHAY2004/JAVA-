import java.io.*;
import java.util.Scanner;
public class Class211042010057 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i=0;
        while ( i < n) {
            int A,B,C,D;
             A = input.nextInt();
             B = input.nextInt();
             C = input.nextInt();
             D = input.nextInt();

            if ((A+B+C+D) == 360) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            i++;
        }
    }
}

/*
2
78 98 20 45
NO
45 45 90 90
NO
56 45 86 45
  */
