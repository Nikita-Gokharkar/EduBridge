import java.util.*;
class prime
{
public static void main(String args[])
{
int i,n,r;
boolean isprime=true;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number ");
n=sc.nextInt();
r=n/2;
for(i=2;i<=n-1;i++)
{
if(n%i==0)
{
isprime=false;
break;
}
} 
if(!isprime)
{
System.out.print("is not prime number");
}
else
{
System.out.print(" prime number");
}}}