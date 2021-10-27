import java.util.*;
class Menu
{
public static void main(String args[])
{
int n,r=0,h=0,b=0,l1,b1,side;
double area;

Scanner sc=new Scanner(System.in);
System.out.println("1 - Area of a Triangle");
System.out.println("2 - Area of a Square");
System.out.println("3 - Area of a Rectangle");
System.out.println("4 - Area of a Circle");
System.out.println("Enter your choice");

n=sc.nextInt();


if(n==1){
System.out.print("Enter the Height and Breadth ");
h=sc.nextInt();
b=sc.nextInt();
area=(h*b)/2;
System.out.print("Area of a Triangle " +area);
}

else if(n==2)
{
System.out.print("Enter length and width ");
b1=sc.nextInt();
l1=sc.nextInt();
area=l1*b1;
System.out.print("Area of a Rectangle " +area);
}

else if(n==3)
{
System.out.print("Enter the radius ");
r=sc.nextInt();
area=3.17*r*r;
System.out.print("Area of a Circle " +area);
}

else
{
System.out.print("Enter the side ");
side=sc.nextInt();
area=side*side;
System.out.print("Area of a Square " +area);
}
}}
