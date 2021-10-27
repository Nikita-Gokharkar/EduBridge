import java.util.*;
class swap
{
public static void main(String args[])
{
int a,b,temp;
System.out.print("Enter the numbers");

Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();

System.out.println("Before swapping " +a+" "+b);

a=a+b;
b=a-b;
a=a-b;


System.out.println("After swapping " +a+" "+b);
}
}