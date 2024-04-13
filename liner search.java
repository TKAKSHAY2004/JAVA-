import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
        int key = input.nextInt();
        int ans = -1;
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                ans = i+1;
            }
        }
        System.out.println("The position of key is " + ans);
    }
}
