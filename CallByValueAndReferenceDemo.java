import java.util.Arrays;
class CallByValueAndReferenceDemo
{
	public static void main(String[] args)
	{
        int number = 10;
        System.out.println("Before callByValue:"+number);
        callByValue(number);
        System.out.println("After callByValue:"+number);
        int[] array = {1, 2, 3};
        System.out.println("\nBefore callByReference:"+Arrays.toString(array));
        callByReference(array);
        System.out.println("After callByReference:"+Arrays.toString(array));
	}
	static void callByValue(int x)
	{
        x=x+5;
        System.out.println("Inside callByValue: " + x);
	}
	static void callByReference(int[] arr)
	{
        for(int i=0;i<arr.length;i++)
	{
	arr[i]=arr[i]*2;
	}
	System.out.println("Inside callByReference: " + Arrays.toString(arr));
	}
}
