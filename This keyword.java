
class  Student{
    String studentname;
    int studentId;
    int studentage;
    
    //default constructor
    public Student(){
        studentname = "akshay";
        studentId = 100;
        studentage = 20;
    }
    //paramized constructor
    public Student(String studentname , int studentId , int studentage){
        this.studentname = studentname;
        this.studentId = studentId;
        this.studentage = studentage;
    }
    void Studentdisplaydetails(){
        System.out.println("Student Name: " + studentname);
        System.out.println("Student Id: " + studentId);
        System.out.println("Student Age: " + studentage);
    }
}
public class main{
    public static void main(String[] args){
        Student student1 = new Student();
        student1.Studentdisplaydetails();
        
        Student student2 = new Student("Nethra" , 102 , 18);
        student2.Studentdisplaydetails();
    
        
    }
}

/*
In the Student class, the this keyword is used to refer to the instance variables of the class. 
It helps to distinguish between instance variables and parameters when they have the same name. Here’s a detailed explanation:

this Usage
Differentiating Instance Variables from Parameters:
When a method or constructor has parameters with the same name as the instance variables, 
this is used to refer to the instance variables. Without this, the parameter would shadow the instance variable, 
and you wouldn't be able to assign the parameter's value to the instance variable correctly.
