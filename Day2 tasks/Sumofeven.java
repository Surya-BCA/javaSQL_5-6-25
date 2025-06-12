class Sumofeven {
    public static void main(String[] args) {
        int [] number = {1,2,3,4,5};
        int sum=0;
        System.out.println(number.length);
        for(int i=number.length-1;i>=0;i--){
            sum = sum+number[i];
        }
            System.out.println(sum);
            
    }
}