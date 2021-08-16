import java.util.*;
 class Admission
{
void rule()
{
System.out.println("College criteria");
}
}

class Student extends Admission
{
void data()
{
Scanner sc=new Scanner(System.in);
System.out.println("Students name");
int a=sc.nextInt();
sc.nextInt();
System.out.println("Students Roll no");
int b=sc.nextInt();
System.out.println("Students age");
int c=sc.nextInt();
}

static class Branch extends Student
{
void data()
{
Scanner sc1=new Scanner(System.in);
System.out.println("Enter the branch");
int d=sc1.nextInt();
System.out.println("Enter branch is: ");
int e=sc1.nextInt();
}

public static void main(String args[])
{
Branch br=new Branch();
br.rule();
br.data();
br.data();
}}
}