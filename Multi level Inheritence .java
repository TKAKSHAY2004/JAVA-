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
class weep extends dog{
    void weep(){
        System.out.println("weeping");
    }
}

public class main{
    public static void main(String[] args){
        weep d = new weep();
        d.bark();
        d.food();
        d.weep();
    }
}

/*
barking
eating
weeping
*/
