package School;
import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;


/**
 * BluePrint
 */
interface BluePrint {
    void newStudent();
    void getAllStudent();
    void searchStudent(int roll);
    void searchStudent(String nameReg);
    double calcPercent(List<Double> marks);
    
}
public class StudentManagementSystem implements BluePrint{
    static List<Student> studentList; 
    @Override
    public void searchStudent(String nameReg)
    {
        int flag = 0;
        Iterator<Student> students = studentList.iterator();
        while(students.hasNext())
        {
            Student stu = students.next();
            if (stu.getName().contains(nameReg)) {
                flag = 1;
                System.out.print(stu.getName()+"-------"+stu.getRoll()+"-------"+stu.getPercent());
                System.out.println();   
            }
        }
        if (flag == 0) {
            System.out.println("No such student");
        }
    }
    @Override
    public void searchStudent(int roll)
    {
        
        int flag = 0;
        Iterator<Student> students = studentList.iterator();
        while(students.hasNext())
        {
            Student stu = students.next();
            if (stu.getRoll() == roll) {
                flag = 1;
                System.out.print(stu.getName()+"-------"+stu.getRoll()+"-------"+stu.getPercent());
                System.out.println();   
            }
        }
        if (flag == 0) {
            System.out.println("No such student");
        }
    }  
    @Override
    public void newStudent()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Name: ");
        String name = in.nextLine();
        System.out.print("Roll: ");
        int roll = in.nextInt();
        List<Double> marks = new ArrayList<>();
        System.out.print("Maths: ");
        double math = in.nextDouble();
        marks.add(math);
        System.out.print("English: ");
        math = in.nextDouble();
        marks.add(math);
        System.out.print("Science: ");
        math = in.nextDouble();
        marks.add(math);
        double percent = calcPercent(marks);
        Student obj = new Student(name,roll,marks,percent);
        studentList.add(obj);
    }
    @Override 
    public double calcPercent(List<Double> marks)
    {
        double sum = 0;
        Iterator<Double> itr = marks.iterator();
        while(itr.hasNext())
        {
            sum+=itr.next();
        }
        return sum;
    }
    @Override
    public void getAllStudent()
    {
        Iterator<Student> students = studentList.iterator();
        while(students.hasNext())
        {
            Student stu = students.next();
            System.out.print(stu.getName()+"-------"+stu.getRoll()+"-------"+stu.getPercent());
            System.out.println();
        }
        
    }
     static int ch = 0;
    public static void main(String[] args) {
        studentList = new ArrayList<>();
        StudentManagementSystem obj = new StudentManagementSystem();
        
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Enter your option: 1) new student 2) all students 3) Search student by roll 4) Search student by name 5) exit");
            ch = in.nextInt();
            if (ch == 1) {
                obj.newStudent();
                
            } else if(ch == 2){
                obj.getAllStudent();
                
            }
            else if(ch == 3)
            {
                System.out.println("Enter the roll");
                int rol = in.nextInt();
                obj.searchStudent(rol);

            }
            else if(ch == 4)
            {
                System.out.println("Enter the Name pattern");
                String name = in.next();
                obj.searchStudent(name);

            }
        }while (ch!=5);
    }
}
