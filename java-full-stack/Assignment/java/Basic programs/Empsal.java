import java.util.*;
class Empsal
{
public static void main(String args[])
{
long sal,bon,totalsal;
String nam;

Scanner sc=new Scanner(System.in);

System.out.print("Enter Employee name ");
nam=sc.nextLine();


System.out.print("Enter Employee Salary ");
sal=sc.nextLong();


System.out.print("Enter Employee Bonus");
bon=sc.nextLong();

totalsal= sal+bon;


System.out.print("Totalsal is" +totalsal);
}}