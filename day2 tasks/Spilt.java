import java.util.*;
class Spilt {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String;");
        String word = s.nextLine();
        String[] words = word.split(" ");
        for(String w : words){
            System.out.println(w);
        }
            
        }
       
    }
