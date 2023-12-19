public class Main{
    static void myMethod(){
        int[] a = {1,2,3,4,5};
        System.out.print("Elements in array A:\n");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
        int[] b = {6,7,8,9,10};
        System.out.print("\nElements in array B:\n");
        for(int j=0; j<b.length;j++){
            System.out.print(b[j] +  " ");
        }
        
        int[] sum = new int[b.length];
        for (int k = 0; k < sum.length; k++) {
            sum[k] = a[k] + b[k];
        }

        System.out.print("\nSum of array A and B :\n");
        for(int k=0;k<sum.length;k++){
            System.out.print(sum[k] + " ");
        }
    }
    public static void main(String[] args){
        myMethod();
        System.out.print("\n\n\n");
        myMethod();
        System.out.print("\n\n\n");
        myMethod();
        System.out.print("\n\n\n");
        myMethod();
    }
}
