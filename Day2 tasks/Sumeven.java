class Sumeven {
    public static void main(String[] args) {
        int [] number = {1,2,3,4,5};
        int sum=0;
        int a=0;
        for(int i=0;i<=number.length-1;i++){
            sum = number[i]%2;
            if(sum==0){
                a=number[i]+a;
            }
        
        }     
         System.out.println("even " +a);
    }
}