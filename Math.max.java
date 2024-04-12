import java.util.Scanner;
class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int maxvalue = Integer.MIN_VALUE;
        for(int i=1;i<=n;i++){
            int a = input.nextInt();
            maxvalue =  Math.max(maxvalue,a);
        }
        System.out.println(maxvalue);
    }
}
