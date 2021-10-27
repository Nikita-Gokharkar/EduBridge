import java.util.Scanner;
public class Maximum_sum
{

public static void main(String[] args) 
{
		
int n,i;
int sum=0;
int arr[]=new int[10];
int evensum=0,oddsum=0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter size of array: ");
n=sc.nextInt();
		
if(n<0)
{
System.out.println("Invalid array size"); 
System.exit(0);
}
else
{
for(i=0;i<n;i++)
{
arr[i]=sc.nextInt();	
if(arr[i]<0)
{
System.out.println("Invalid Input") ; 
System.exit(0);
}
}

for(int j=0;j<n;j++)
{
if(arr[j]%2==0)
{
evensum=evensum+arr[j];
}
else
{
oddsum=oddsum+arr[j];
}
}
}
System.out.println("The sum of even is: "+evensum); 
System.out.println("The sum of odd is: "+oddsum); 
if(evensum>oddsum)
{
System.out.println("The sum of even numbers is maximum : "+evensum);
}
else
{
System.out.println("The sum of odd numbers is maximum: "+oddsum); 
}
}
}
