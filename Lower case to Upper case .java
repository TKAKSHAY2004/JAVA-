import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write a sentence: ");
        String str = input.nextLine();
        
        String str2 = str.toUpperCase();
        
        System.out.println(str2);
    }
}

/*
Write a sentence: 
what a beautiful girl
WHAT A BEAUTIFUL GIRL
  */
