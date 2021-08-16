import java.util.*;
class calculateSal
{
public static void main(String args[])
{

int salary,shifts;
double n=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Salary");
salary=sc.nextInt();
System.out.println("Enter the Shifts");
shifts=sc.nextInt();



if (salary>8000)
{ 
System.out.println("Salary too large "+salary);
}

else if(shifts<0)
{
System.out.println("Shift is too small "+shifts);
}

else if(salary<0)
{
System.out.println("Salary is too small "+salary);
}

else
{
n=(salary*0.5)+(salary*0.02*shifts);
System.out.println(n);
}
}}