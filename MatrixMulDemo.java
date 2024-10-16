import java.util.Scanner;
class multiply {
    int a[][]=new int[3][3];
    int b[][]=new int[3][3];
    int c[][]=new int[3][3];
    int i,j;
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Element for Matrix A");
        for(i=0;i<3;i++)
        for(j=0;j<3;j++)
        {
            System.out.println("Enter No:");
            a[i][j]=sc.nextInt();
        }
        for(i=0;i<3;i++)
        for(j=0;j<3;j++)
        {
            System.out.println("Enter No:");
            b[i][j]=sc.nextInt();
        }
    }
    void putdata()
    {
        System.out.println("First Matrix is:");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            System.out.print(a[i][j]+"....");
            System.out.println();
        }
        System.out.println("Second Matrix is:");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            System.out.print(b[i][j]+"....");
            System.out.println();
        }
    }
    void multiply()
    {
        int k;
        for(i=0;i<3;i++)
        for(j=0;j<3;j++)
        {
            c[i][j]=0;
            for(k=0;k<3;k++)
            c[i][j]=c[i][j]+a[i][k]*b[k][j];
        }
        System.out.println("Multiplication is:");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            System.out.print(c[i][j]+"....");
            System.out.println();
        }   
    }
}
class MatrixMulDemo {
    public static void main(String[] args) {
        multiply a=new multiply();
        a.getdata();
        a.putdata();
        a.multiply();
    }   
}