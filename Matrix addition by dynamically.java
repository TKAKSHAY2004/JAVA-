import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter no.of rows and columns : ");
        int m = input.nextInt();
        int n = input.nextInt();
        int[][] a = new int[m][n];
        System.out.println("Elements of Matrix a: ");
        for(int i = 0 ; i<m ; i++){
            for(int j = 0 ; j<n ; j++){
                a[i][j] = input.nextInt();
            }
        }
        int[][] b = new int[m][n];
        System.out.println("Elements of Matrix b: ");
        for(int i = 0 ; i<m ; i++){
            for(int j = 0 ; j<n ; j++){
                b[i][j] = input.nextInt();
            }
        }
        System.out.println("\nSum of Matrix: ");
        for(int i = 0 ; i<m ; i++){
            for(int j = 0 ; j<n ; j++){
                int sum = a[i][j] + b[i][j];
                System.out.print(sum + "\t");
            }
            System.out.print("\n");
        }
    }
}
