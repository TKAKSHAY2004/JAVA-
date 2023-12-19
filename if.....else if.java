import java.util.Scanner;

class Input {
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
    	
    	System.out.print("Enter value on n: ");
        int n = input.nextInt();
        for (int i=0;i<n;i++){
            System.out.print("Enter an integer A: ");
            int a = input.nextInt();
            System.out.println("Enter an integer B: ");
            int b = input.nextInt();
            System.out.print("Enter the operator : ");
            String op = input.next();
            
            if(op.equals("+")) {
                int sum = a + b;
                System.out.println("Sum: " + sum+"\n");
            }else if(op.equals("-")){
                int sub = a - b;
                System.out.println("Subtraction: " + sub+"\n");
            }else if(op.equals("*")){
                int mul = a * b;
                System.out.println("Multiplication: " + mul+"\n");
            }else{
                System.out.println("Invalid operator");
            }
        }
        
        input.close();
    }
}
