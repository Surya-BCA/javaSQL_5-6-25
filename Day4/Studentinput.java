import java.util.Scanner;

public class Studentinput {
    private String name;
    private int marks;
    private String result;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
        if (marks >= 300) {
            this.result = "Pass";
        } else {
            this.result = "Fail";
        }

        
        displayStudentInfo();
    }

    private void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Result: " + result);

        if (result.equals("Pass")) {
            System.out.println("You Passed!");
        } else {
            System.out.println("You failed!!!!!!!! " + name);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Marks: ");
        int marks = scanner.nextInt();


        Student stu = new Student(name, marks);

    
    }
}
