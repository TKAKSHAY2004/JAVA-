class eat{
    void food(){
        System.out.println("eating");
    }
}
class dog extends eat{
    void bark(){
        System.out.println("barking");
    }
}
class cat extends eat{
    void meow(){
        System.out.println("meowing");
    }
}

public class main{
    public static void main(String[] args){
        dog d = new dog();
        d.bark();
        d.food();
        
        System.out.println("*************");
        
        cat c = new cat();
        c.meow();
        c.food();
    }
}
/*
barking
eating
*************
meowing
eating
*/
