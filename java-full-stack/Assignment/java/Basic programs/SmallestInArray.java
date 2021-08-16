import java.util.*;
 class SmallestInArray
{
public static void main(String args[])
{  
int arr[]=new int[10];
int min=0,i,j;
Scanner sc=new Scanner(System.in);  
System.out.println("Enter the elements"); 
for(i=0;i<10;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("Elements of Array");
for(i=0;i<10;i++)
{
System.out.println(" "+arr[i]);
} 
min=arr[0];
for(i=0;i<10;i++)
{
if(min>arr[i])
{
min=arr[i];
}}  
System.out.println("Smallest Elment "+min);
}}