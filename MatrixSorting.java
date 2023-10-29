 
import java.util.*;
class MatrixSorting
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter the number of rows and columns(>2and <20 ");
int m=scan.nextInt();
int n=scan.nextInt();
int i,j,x,t,c;
int a[][]=new int[m][n];
if(m<2 || n<2 || m>20 || n>20)
System.out.println("Rows and columns should be more than 2 and less than 20.");
else
{
System.out.println("Enter "+m*n+" elements for the matrix : ");
for(i=0;i< m;i++)
{
    for(j=0;j< n;j++)
    a[i][j]=scan.nextInt();
}
System.out.println("\nOriginal Matrix : ");
for(i=0;i< m;i++)
{
    for(j=0;j< n;j++)
    System.out.print(a[i][j]+" ");

    System.out.println();
}
int b[]=new int[2*m+2*n-4];
x=0;
for(i=0;i< m;i++)
{
    for(j=0;j< n;j++)
     if(i==0 || j==0 || i==m-1 || j==n-1)
        b[x++]=a[i][j];
}
for(i=0;i< x;i++)
{
    for(j=i+1;j< x;j++)
    {
        if(b[i]>b[j])
        {
        t=b[i];
        b[i]=b[j];
        b[j]=t;
        }
    }
}
c=0;
for(i=0;i<n;i++)
a[0][i]=b[c++];

for(i=1;i<m;i++)
 a[i][n-1]=b[c++];

 for(i=n-2;i>=0;i--)
 a[m-1][i]=b[c++];

for(i=m-2;i> 0;i--)
 a[i][0]=b[c++];

System.out.println("REARRANGED MATRIX");
for(i=0;i< m;i++)
{
    for(j=0;j< n;j++)
    System.out.print(a[i][j]+" ");

    System.out.println();
}
System.out.println("BOUNDARY ELEMENT");
for(i=0;i< m;i++)
{
    for(j=0;j< n;j++)
    if(i==0 || j==0 || i==m-1 || j==n-1)
    System.out.print(a[i][j]+" ");
    else
    System.out.print("  ");
    System.out.println();
}
}
}
}