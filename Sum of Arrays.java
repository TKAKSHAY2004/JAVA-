// Online Java Compiler
// Use this editor to write, compile and run your Java code online
/*
class HelloWorld {
    public static void main(String[] args) {
        int[] marks = new int[] {10,20,30,40,50};
        for(int values : marks){
            System.out.print(values + " ");
        }
    }
}
*/

class HelloWorld {
    public static void main(String[] args) {
        int[] marks = new int[] {10,20,30,40,50};
        for(int i = 0 ; i<marks.length ; i++){
            System.out.print(marks[i] + " ");
        }
    
        int sum = 0;
        for(int i=0 ; i<marks.length ; i++){
            sum = sum + marks[i];
        }
        System.out.println("\nsum:" + sum);
    }
}
