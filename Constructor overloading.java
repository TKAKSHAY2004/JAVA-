
class  Student{      //constructor overloading
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
    public Student(int studentId , int studentage , String studentname){
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
        
        Student student2 = new Student(102 , 20 , "arjun");
        student2.Studentdisplaydetails();
        
        Student student3 = new Student("Nethra" , 102 , 18);
        student3.Studentdisplaydetails();
    
        
    }
}

