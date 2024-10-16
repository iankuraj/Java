import java.util.Scanner;
class main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter First Number:");
        a=sc.nextInt();
        System.out.println("Enter the Second Number:");
        b=sc.nextInt();
	c= a + b;
        System.out.println("Sum of Two Numbers:"+c);
	c=sc.nextInt();
    }
}