class eat{
    void food(){
        System.out.println("Eating");
    }
}
class dog extends eat{
    void bark(){
        System.out.println("barking");
    }
}

public class main{
    public static void main(String[] args){
        dog d = new dog();
        d.bark();
        d.food();
    }
}

/*
barking
Eating
*/
