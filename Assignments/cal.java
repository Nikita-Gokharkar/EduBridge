import java.util.*;
class cal
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter the first number");
int a=sc.nextInt();

System.out.println("Enter the second number");
int b=sc.nextInt();

int sum=a+b;
System.out.println("The sum="+sum);

int sub=a-b;
System.out.println("Subtraction =" +sub);

int mul=a*b;
System.out.println("Multiplication =" +mul);

int div=a/b;
System.out.println("Division =" +div);

int mod=a%b;
System.out.println("Reminder="+mod);
}
}