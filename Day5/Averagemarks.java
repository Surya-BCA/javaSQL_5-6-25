import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Averagemarks {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int total = 0;

        try {
            System.out.print("Enter number of subjects: ");
            int subjects = s.nextInt();

            for (int i = 1; i <= subjects; i++) {
                System.out.print("Enter marks for subject " + i + ": ");
                int marks = s.nextInt();
                total += marks;
            }

            double average = (double) total / subjects;

            System.out.println("Total Marks: " + total);
            System.out.println("Average Marks: " + average);

            FileWriter writer = new FileWriter("result.txt");
            writer.write("Total Marks: " + total + "\n");
            writer.write("Average Marks: " + average + "\n");
            writer.close();

            System.out.println("Updated Successfully!!!!");

        } catch (IOException e) {
            System.out.println("Error writing to file: ");
        } 
    }
}
