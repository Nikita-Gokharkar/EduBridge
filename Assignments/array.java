import java.util.*;
class array
{
public static void main(String agrs[])
{
int arr[] =new int[5];
int i,sum=0;
Scanner sc=new Scanner(System.in);
System.out.print("Enter array element ");
for(i=0;i<5;i++)
{
arr[i]=sc.nextInt();
}
System.out.print("Array Element ");
for(i=0;i<5;i++)
{
System.out.print(arr[i]);
}
for(i=0;i<5;i++)
{
sum=sum+arr[i];
}
System.out.println("sum of Array elements " +sum);
}}