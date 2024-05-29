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
class cat extends dog{
    void meow(){
        System.out.println("Meowing");
    }
}

public class main{
    public static void main(String[] args){
        cat d = new cat();
        d.bark();
        d.food();
        d.meow();
    }
}

/*
barking
Eating
Meowing
  */
