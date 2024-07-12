class Sum{
    public int sum(int x,int y){
        return x+y;
    }
    public int sum(int x,int y,int z){ 
        return x+y+z;
    }
    public double sum(int x , double y){ //changing in datatypes
        return x+y;
    }
}
public class main{
    public static void main(String[] args){
        Sum s = new Sum();
        //changing order of parameter
        System.out.println(s.sum(5,10));
        System.out.println(s.sum(5,10.86));
        System.out.println(s.sum(5,10,3));
        
    }
}
/*
15
15.86
18
  */
