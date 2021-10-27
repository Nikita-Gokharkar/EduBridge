import java.util.*;
class TransposeMat
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of rows");
int r=sc.nextInt();

System.out.println("Enter the number of columns");
int c=sc.nextInt();

int[] []A=new int[r] [c];

for(int i=0;i<r;i++)
{
	for(int j=0;j<c;j++)
	   A[i][j]=sc.nextInt();
}

System.out.println("Original Matrix ");
for(int i=0;i<r;i++)
{
	for(int j=0;j<c;j++)
		{
	System.out.print(A[i][j]);

System.out.println();
}
System.out.println("Transpose Matrix ");
for(int i=0;i<c;i++)
{
	for(int j=0;j<r;j++)
		{
	System.out.print(A[i][j]);
}
