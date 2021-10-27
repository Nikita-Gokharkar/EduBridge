import java.util.*;
class objectprog
{
void sum()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
int x=sc.nextInt();
int y=sc.nextInt();
int z=x+y;
System.out.println("sum"+z);
}

public static void main(String s[])
{
objectprog m = new objectprog();
m.sum();
}}