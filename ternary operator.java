import java.util.Scanner;
class even{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        System.out.println((n % 2 == 0) ? "Even" : "Odd");
    }
}

or
/*
import java.util.Scanner;
class even{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        String ans;
        ans = (n % 2 == 0) ? "Even" : "Odd";
        
        System.out.println(ans);
    }
}
*/
