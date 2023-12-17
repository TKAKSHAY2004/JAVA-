import java.util.Scanner;

class input{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter No.of times: ");
        int n=input.nextInt();
        
        for(int i=0;i<n;i++){
            System.out.println("Enter integer A: ");
            int a=input.nextInt();
            System.out.println("Enter integer B: ");
            int b=input.nextInt();
            
            int sum = a + b;
            
            System.out.println("Sum: "+ sum+"\n");
        }
        input.close();
    }
}
