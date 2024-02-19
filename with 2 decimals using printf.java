import java.util.Scanner;

public class Class211042010057 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double basic,sal;
        basic=input.nextDouble();
        sal = basic +(basic * 0.8) + (basic * 0.4);
        System.out.printf("%.2f", sal);
        System.out.println();
    }
}

/*
521
1146.20*/
