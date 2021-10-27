import java.util.Scanner;

public class Salary_of_employee 
{
public static void main(String[] args) 
{
				
int n;
int i,j,count=0;
				
int arr[]=new int[20];
Scanner sc = new Scanner(System.in);
System.out.println("Enter no. of Employees: ") ;
n=sc.nextInt();
				
					
if(n<0)
{
System.out.println("Invalid Input") ; 
System.exit(0);
}
else
{
for(i=0;i<n;i++)
{
arr[i]=sc.nextInt();	
if(arr[i]<0)
{
System.out.println("Invalid Input"); 
System.exit(0);
}
}
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(arr[i]==arr[j])
{
count++;
}
}
}
System.out.println(count+ " employees get same Salary");
}
}
}
