import java.util.Scanner;

class Input {
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
    	
        System.out.print("Enter an integer A: ");
        int a = input.nextInt();
        System.out.println("Enter an integer B: ");
        Float b = input.nextFloat();
        
        Float sum = a + b;
        System.out.println("Sum: " + sum);

        // closing the scanner object
        input.close();
    }
}

/*output
Enter an integer A: 5
Enter an integer B: 6
Sum: 11.0 */

