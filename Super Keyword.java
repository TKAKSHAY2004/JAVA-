class eat{
    void food(){
        System.out.println("Eating");
    }
}
class dog extends eat{
    void bark(){
        super.food();
        System.out.println("barking");
    }
}

public class main{
    public static void main(String[] args){
        dog d = new dog();
        d.bark();
    }
}

/*
Eating
barking
  */

// super keyword is  used in child class to avoid using parent method in main function
