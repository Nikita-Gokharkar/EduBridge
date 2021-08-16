import java.util.*;
class reverse
{
public static void main(String args[])
{
int rem,rev=0,num;
System.out.println("Enter the number");
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
while(num!=0)
{
rem=num%10;
rev=rev*10+rem;
num=num/10;
}
System.out.println("Reversed number is " +rev);
}}