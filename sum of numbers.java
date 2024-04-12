import java.util.Scanner;
class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int num;
        
        do{
            num = input.nextInt();
            sum = sum + num;
        }
        while(num >= 0);
        System.out.println(sum);
    }
}
