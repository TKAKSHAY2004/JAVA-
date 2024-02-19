import java.util.Scanner;
public class Class2211042010057 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testnum1 = input.nextInt();
        int testnum2 = input.nextInt();
        System.out.println("Addition : " + (testnum1 + testnum2));
        System.out.println("Subtraction : " + (testnum1 - testnum2));
        System.out.println("Multiplication : " + (testnum1 * testnum2) );
        System.out.printf("Division : %.3f",((float)testnum1 / testnum2));
        System.out.println("\nModulus : " + (testnum1 % testnum2));
    }
}

/*
17
13
Addition : 30
Subtraction : 4
Multiplication : 221
Division : 1.308
Modulus : 4   */   
