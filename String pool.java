/*
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        
        if(s1==s2){
            System.out.println("Equal");
        }else{
            System.out.println("Not equals");
        }
    }
}

output: Equal 


import java.util.Scanner;
class Main{
    public static void main(String[] args){
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        
        if(s1==s3){
            System.out.println("Equal");
        }else{
            System.out.println("Not equals");
        }
    }
}

output: not equal
*/

import java.util.Scanner;
class Main{
    public static void main(String[] args){
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        
        if(s1==s3){
            System.out.println("Equal");
        }else{
            System.out.println("Not equals");
        }
    }
}

//output:equals

// s1.equals(s3) results true because it don't check refernce of the object rather than it check the content of the object so it print equals
