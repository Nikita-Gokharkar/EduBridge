import java.util.*;
class Result
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

byte m,p,s,h,chem;
double avg;

System.out.println("Enter Mathematics marks");
m=sc.nextByte();

System.out.println("Enter Physics marks");
p=sc.nextByte();

System.out.println("Enter Science marks");
s=sc.nextByte();

System.out.println("Enter History marks");
h=sc.nextByte();

System.out.println("Enter Chemistry marks");
chem=sc.nextByte();

avg=m+p+s+h+chem/5.0;

if(avg>=40 && m>=33 && p>=33 && s>=33 && h>=33 && chem>=33)
{
System.out.println("You are promoted");
}
else
{
System.out.println("Sorry,You are failed");
}
}}