import java.util.*;
class Vowelconsonants {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String;");
        String word = s.nextLine();
        word = word.toLowerCase();
        int vowels = 0;
        int consonants = 0;
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(Character.isLetter(ch)){
               if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Number of vowels:" + vowels);
         System.out.println("Number of consonants:" + consonants);
    }
}