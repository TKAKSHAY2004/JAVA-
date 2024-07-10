import java.util.*;
class conditional {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Sp and Cp");
        int sp  = input.nextInt();
        int cp = input.nextInt();
        if(sp>cp){
            System.out.println("profit");
        }
        else{
            if(sp<cp){
                System.out.println("loss");
            }
            else{
                System.out.println("no profit no loss");
            }
        }
        if(sp>cp){
            System.out.println("profit");
        }
        else if(sp<cp){
            System.out.println("loss");
        }
        else{
            System.out.println("no profit no loss");

        }
    }
}
