import java.util.*;
class SimpleInt
{
public static void main(String args[])
{
double SI,P,R,N;
Scanner sc=new Scanner(System.in);

System.out.print("P= ");
P=sc.nextInt();

System.out.print("N= ");
N=sc.nextInt();

System.out.print("R= ");
R=sc.nextInt();

SI=(P*N*R)/100;

System.out.print(SI);
}}