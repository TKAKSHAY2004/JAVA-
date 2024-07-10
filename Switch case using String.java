import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String user = input.nextLine();
        
        switch(user){
            case "admin" :
                System.out.println("user request");
                break;
            case "subadmin":
                System.out.println("user request admin");
                break;
            default :
                System.out.println("Invalid choice");
                break;
        }
    }
}
