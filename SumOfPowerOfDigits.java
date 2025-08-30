class sumOfPowerOfDigits {
    public static int SumOfPower(int input1){
        int sum = 0;
        int p = 0;
        while(input1>0){
            int rem = input1%10 ;
            sum += Math.pow(rem, p);
            p = rem;
            input1 = input1/10 ;
        }
        return sum;
    }
    
    public static void main(String args[]){
        int n = 5542635;
        System.out.println(SumOfPower(n));
    }
}
