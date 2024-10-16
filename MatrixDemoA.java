import java.util.Scanner;
class Addition
{
	int a[][] = new int[2][2];
    	int b[][] = new int[2][2];
    	int c[][] = new int[2][2];
    	Scanner sc = new Scanner(System.in);
    	
	void getdata()
	{
	int i, j;
        i = j = 0;
        System.out.println("Enter values for matrix A:");
        for (i = 0; i < 2; i++)
	for (j = 0; j < 2; j++)
	a[i][j] = sc.nextInt();
	
	System.out.println("Enter values for matrix B:");
	for (i = 0; i < 2; i++)
	for (j = 0; j < 2; j++)
	b[i][j] = sc.nextInt();
	}
	
	void add()
	{
	int i, j;
        i = j = 0;
        for (i = 0; i < 2; i++)
	for (j = 0; j < 2; j++)
	c[i][j] = a[i][j] + b[i][j];
	}
	void putdata()
	{
	int i, j;
        i = j = 0;
        System.out.println("Resultant Matrix (Sum of the two matrices):");
        for (i=0;i<2;i++)
	{
	for (j=0;j<2;j++)
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

