import java.util.Random;
class Main {
    static int OTP(){
        Random ran = new Random();
        return 100 + ran.nextInt(500);
    }
    public static void main(String[] args){
        int opt = OTP();
        System.out.println("One time password is" +opt);
    }
}