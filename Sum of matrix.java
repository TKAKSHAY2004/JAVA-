class HelloWorld {
    public static void main(String[] args) {
        int[][] a = {
            {10,20,30},
            {40,50,60},
            {70,80,90}
        };
        System.out.println("Elements of Matrix a: ");
        for(int i = 0 ; i<3 ; i++){
            for(int j = 0 ; j<3 ; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n");
        }
        int[][] b = {
            {90,40,70},
            {80,10,30},
            {60,20,50}
        };
        System.out.println("Elements of Matrix B: ");
        for(int i = 0 ; i<3 ; i++){
            for(int j = 0 ; j<3 ; j++){
                System.out.print(b[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.println("\nSum of Matrix: ");
        for(int i = 0 ; i<3 ; i++){
            for(int j = 0 ; j<3 ; j++){
                int sum = a[i][j] + b[i][j];
                System.out.print(sum + " ");
            }
            System.out.print("\n");
        }
    }
}
