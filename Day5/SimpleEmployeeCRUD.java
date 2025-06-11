import java.io.*;
import java.util.Scanner;

public class SimpleEmployeeCRUD {
    static final String FILE_NAME = "employees.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       static void addEmployee(Scanner sc) {
        try (FileWriter fw = new FileWriter(FILE_NAME, true)) {
            System.out.print("Enter ID: ");
            String id = sc.nextLine();
   System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Department: ");
            String dept = sc.nextLine();
catch (IOException e) {
            System.out.println("Error writing to file.");
        }