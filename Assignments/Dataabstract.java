abstract class Dataabstract
{
abstarct void sum();
void show()
{
System.out.println("Crrating Abstract class");
}
}
 public class Abst extends Data
{
void sum()
{
int a=10;
int b=23;
int c=a+b;
System.out.println("Sum"+c);
}

public static void main (String args[])
{
Abst a=new Abst();
a.show();
a.sum();

}
}