import java.util.Scanner;
class PalindromeDemo1
{
	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to check Palindrome:");
        int num = sc.nextInt();
        if (isPalindrome(num))
	{
	System.out.println(num + " is Palindrome.");
        }
	else
	{
	System.out.println(num + " is not Palindrome.");
	}
	}
	static boolean isPalindrome(int num)
	{
        int originalNum = num;
        int reversedNum = 0, remainder;
        while (num != 0)
	{
	remainder = num % 10;
        reversedNum = reversedNum * 10 + remainder;
        num /= 10;
	}
	return originalNum == reversedNum;
	}
}
