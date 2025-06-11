import java.util.Scanner;

public class MarksCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;

        try {
            System.out.print("Enter number of subjects: ");
            int subjects = scanner.nextInt();
            for (int i = 1; i <= subjects; i++) {
                System.out.print("Enter marks for subject " + i + ": ");
                int marks = scanner.nextInt();
                total += marks;
            }
             double average = (double) total / subjects;
             System.out.println("Total Marks: " + total);
            System.out.println("Average Marks: " + average);
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter numeric values only.");
        } 
    }
}