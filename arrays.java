class Main{
    public static void main(String[] args){
        int arr[] = new int[5];
        
        arr[0]=12;
        arr[4]=34;
        
        System.out.println(arr[0]);
        System.out.println(arr[3]);
        
        float[] a = { 1.0f , 4.0f , 5.0f , 3.0f };
        System.out.println(a[0]);
        System.out.println(a[3]);
        
        String[] b  = {"Bastin","Adithya","Lohith"};
        System.out.println(b[2]);
        System.out.println(b.length);
        
        char c[] = {'a','c','b'};
        System.out.println(c[2]);
        for(int i = 0 ; i<c.length ; i++){
            System.out.print(c[i] + " ");
        }
    }
}

/*
12
0
1.0
3.0
Lohith
3
b
a c b 
  */
