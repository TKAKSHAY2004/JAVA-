import java.util.Scanner;
class conditional {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 Numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if(a>b && a>c){
            System.out.println("Maximun number is : " + a);
        }
        if(b>a && b>c){
            System.out.println("Maximun number is : " + b);
        }
        if(c>a && c>b){
            System.out.println("Maximun number is : " + c);
        }
    }
}
