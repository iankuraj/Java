class SumOfNatureNumberDemo {
    public static void main(String[] args) {
        int n =5;
        int sum =calculateSum(n);
        System.out.println("sum of First"+n+"Natural Numbers:"+sum);
    }
    public static int calculateSum(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else
        {
            return n + calculateSum(n-1);
        }
    }
}
