import java.util.*;
class  student{
    String Studentname;
    int StudentId;
    int Studentage;
    Scanner input = new Scanner(System.in);
    
    void Studentacceptdetails(){
        System.out.println("Student Name: ");
        Studentname = input.nextLine();
        System.out.println("Student Id: ");
        StudentId = input.nextInt();
        System.out.println("Student Age: ");
        Studentage = input.nextInt();
    }
    void Studentdisplaydetails(){
        System.out.println("Student Name: " + Studentname);
        System.out.println("Student Id: " + StudentId);
        System.out.println("Student Age: " + Studentage);
    }
}
public class main{
    public static void main(String[] args){
        student a = new student();
        a.Studentacceptdetails();
        a.Studentdisplaydetails();
    }
}

/*
Student Name: 
Akshay khanna
Student Id: 
9834
Student Age: 
20
Student Name: Akshay khanna
Student Id: 9834
Student Age: 20
  */
