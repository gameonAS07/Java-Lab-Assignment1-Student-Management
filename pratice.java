import java.util.*;

// base class:
class Person{
    protected String name;
    //default constructor:
    public Person() {}
    // parametrised constructor:
    public Person(String name){
        this.name = name;
    }
}
// derived class:
class Student extends Person{
    private int rollno;
    private String course;
    private double marks;
    private char grade;
    // default constructor:
    public Student(){
        super();
    }
    // parametrised constructor:
    public Student(int rollno, String name, String course, double marks){
        super(name);
        this.rollno = rollno;
        this.course = course;
        this.marks = marks;
        calculateGrade();
    }
    // method to take input:
    public void inputDetails(Scanner sc){
        System.out.print("Enter roll no: ");
        rollno = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter name: ");
        name = sc.nextLine();

        System.out.print("Enter course: ");
        course = sc.nextLine();

        while(true){
            System.out.print("Enter marks (0-100): ");
            marks = sc.nextDouble();
            if(marks>=0 && marks<=100) break;
            System.out.println("Invalid marks! Please enter a value between 0 and 100.");
        }
        calculateGrade();
    }
    // method to calculate grade:
    public void calculateGrade(){
        if (marks >= 90) grade = 'A';
        else if (marks >= 80) grade = 'B';
        else if (marks >= 70) grade = 'C';
        else if (marks >= 60) grade = 'D';
        else grade = 'F';
    }
    // method to display details:
    public void displatDetails(){
        System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
        System.out.println("-----------------------");
    }
}
//Main class:
public class pratice{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        int choice;
        do{
            System.out.println("\n===== Student Management Menu =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                    Student s = new Student();
                    s.inputDetails(sc);
                    students.add(s);
                    break;
                case 2:
                    if(students.isEmpty()){
                        System.out.println("No students to display.");
                    }else{
                        for(Student student : students){
                            student.displatDetails();
                        }
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }while(choice != 3);
        sc.close();
    }
}