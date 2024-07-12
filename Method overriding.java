class Parent{
    void show(){
        System.out.println("Parent class");
    }
}
class Child extends Parent{
    @Override void show(){
        System.out.println("Child class");
    }
}
public class main{
    public static void main(String[] args){
        Child obj1 = new Child();
        obj1.show();
        
        Parent obj2 = new Parent();
        obj2.show();
    }
}

/*
Child class
Parent class
  */
