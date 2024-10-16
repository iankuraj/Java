import java.util.Scanner;
class CalculatorDemo
{
    public static void main(String[] args)
    {
    int a,b,c;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter First Number:");
    a=sc.nextInt();
    System.out.println("Enter Second Number:");
    b=sc.nextInt();
    System.out.println("Enter Your Choice 1->Addition,2->Substraction,3->Multiplication,4->Division\nEnter Your Choice:");
    c=sc.nextInt();
    if(c==1)
    System.out.println("Addition="+(a+b));
    else if(c==2)
    System.out.println("Substraction="+(a-b));
    else if(c==3)
    System.out.println("Multiplication="+(a*b));
    else if(c==4)
    System.out.println("Division="+(a/b));
    else
    System.out.println("Invalid Choice:");
    }    
}
