import java.util.*;
public class Summer_Vacation 
{

public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
int i,num,n,reverse=0;

System.out.println("Enter the number:") ;
num = sc.nextInt();

for (i=9;i>=0;i--)
{
int temp=num;
while(temp>0)
{
n=temp%10;
if(n==i)
{
reverse*=10;
reverse+=n;
}
temp/=10;
}
}
System.out.println("The Increment order of digit of number is: " +reverse) ;
}
}
