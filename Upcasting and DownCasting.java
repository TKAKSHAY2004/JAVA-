class Eat{
    void food(){
        System.out.println("eating");
    }
}
class Animal extends Eat{
    void dog(){
        System.out.println("barking");
    }
    void cat(){
        System.out.println("meowing");
    }
}
public class main{
    public static void main(String[] args){
        
        //upcasting is  child object to parent object
        Eat eat1 = new Animal();
        eat1.food();
        // parent p = new child();
        
        System.out.println("");
        
        //downcasting
        Eat eat = new Animal();
        Animal animal = (Animal) eat;
        animal.dog();
        animal.cat();
        //child c = (child)p;
        
    }
}

/*
eating

barking
meowing
*/
