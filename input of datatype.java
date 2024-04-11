import java.util.Scanner;
class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        System.out.println(a);
        float b = sc.nextFloat();
        System.out.println(b);
        
        /*String str1 = sc.next();
         System.out.println(str1);
         input:hello world
         output: hello*/
        
        String str2 = sc.nextLine();
        System.out.println(str2);
        
        char c = sc.next().charAt(0);
        System.out.println(c);

        boolean d = sc.nextBoolean();
        System.out.println(d);
        
        
    }
}
