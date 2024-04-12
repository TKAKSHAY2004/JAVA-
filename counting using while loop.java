import java.util.Scanner;
class even{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        long a = input.nextInt();
        int i=0;
        while(a>0){
            a /= 10;
            i++;
        }
        System.out.println(i);
    }
}
