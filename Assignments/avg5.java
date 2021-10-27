import java.util.*;
class avg5
{
public static void main(String args[])
{
int a,b,c,d,e;
System.out.println("Enter the marks of five subjects");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
d=sc.nextInt();
e=sc.nextInt();

int sum=a+b+c+d+e;

double avg=sum/5.0;
System.out.println("Average of five subjects "  +avg);
}
}