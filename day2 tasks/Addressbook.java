import java.util.*;
import java.lang.*;
class Addressbook {
    public static void main(String[] args) {
        int SIZE = 1;
        String[] name = new String[SIZE];
        String[] number = new String[SIZE];
        String[] email = new String[SIZE];
        Scanner s = new Scanner(System.in);
        for(int i =0;i<SIZE;i++){
        System.out.println("Enter the Name;");
         name[i] = s.nextLine();
        System.out.println("Enter the Phone number:");
         number[i] = s.nextLine();
        System.out.println("Enter the Email_id:");
         email[i] = s.nextLine();
        
        }    
        System.out.println("-------Address Book----------");
        for(int i=0;i<SIZE;i++){
            System.out.println("Name:" +name[i]);
            System.out.println("Phone number:" +number[i]);
            System.out.println("Email_id:" +email[i]);
        }
        }
       
    }
