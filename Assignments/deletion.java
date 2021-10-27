import java.util.*;
class deletion
{
public static void main(String args[])
{
int n,x,flag=1,loc=0;

Scanner sc=new Scanner(System.in);
System.out.println("Enter the element you want in array ");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter all the elements ");
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println("Array before deletion ");
for(int i=0;i<n;i++)
{
System.out.print(a[i]+",");
}
System.out.println();
System.out.println("Enter the elements you want to delete ");
x=sc.nextInt();
for(int i=0;i<n;i++)
{
if(a[i]==x)
{
flag=1;
loc=i;
break;
}
else
{
flag=0;
}}}}