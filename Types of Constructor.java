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
    public Student(String stdn , int sId , int sage){
        studentname = stdn;
        studentId = sId;
        studentage = sage;
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
Student Name: akshay
Student Id: 100
Student Age: 20
Student Name: Nethra
Student Id: 102
Student Age: 18
  */
