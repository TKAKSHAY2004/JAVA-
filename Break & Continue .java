
class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String a = "";
        while (!a.equals("quit")) {
            System.out.print("Enter Message: ");
            a = input.nextLine().toLowerCase();
            if (a.equals("quit"))
                break;
            if (a.equals("pass"))
                continue;
            System.out.println("Message: " + a);
        }
    }
}

/*
Enter Message: Hello
Message: hello
Enter Message: World
Message: world
Enter Message: pass
Enter Message: quit
  */

