import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String rev = "";
        
        for(int i=str.length()-1;i>=0;i--){
            rev += str.charAt(i);
        }
        if(rev.equals(str)){
            System.out.println("palindromic");
        }else{
            System.out.println("Not palindromic");
        }
    }
}
