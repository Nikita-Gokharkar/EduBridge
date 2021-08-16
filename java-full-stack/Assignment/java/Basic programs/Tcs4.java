import java.util.*;
class convertToCentigrade
{
public static void main(String args[])
{
float f,c;
Scanner sc=new Scanner(String args[])
System.out.println("Enter the numbers");
f=sc.nextfloat();


if(f<0)
{
System.out.println("Invalid input");
}

else
{
c=((f-32)*5)/9;
System.out.println("%.2f",c);
}
}}
