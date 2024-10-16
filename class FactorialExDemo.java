import java.util.Scanner;
class Addition
{
	int a[][] = new int[3][3];
    	int b[][] = new int[3][3];
    	int c[][] = new int[3][3];
    	Scanner sc = new Scanner(System.in);
    	
	void getdata()
	{
	int i, j;
        i = j = 0;
        System.out.println("Enter values for matrix A:");
        for (i = 0; i < 3; i++)
	for (j = 0; j < 3; j++)
	a[i][j] = sc.nextInt();
	
	System.out.println("Enter values for matrix B:");
	for (i = 0; i < 3; i++)
	for (j = 0; j < 3; j++)
	b[i][j] = sc.nextInt();
	}
	
	void add()
	{
	int i, j;
        i = j = 0;
        for (i = 0; i < 3; i++)
	for (j = 0; j < 3; j++)
	c[i][j] = a[i][j] + b[i][j];
	}
	void putdata()
	{
	int i, j;
        i = j = 0;
        System.out.println("Resultant Matrix (Sum of the two matrices):");
        for (i = 0; i < 3; i++)
	{
	for (j = 0; j < 3; j++)
	System.out.print(c[i][j] + " ");
	System.out.println();
	}
	}
}

class MatrixDemoA
{
	public static void main(String args[])
	{
        Addition a = new Addition();
        a.getdata();
        a.add();
        a.putdata();
	}
}

