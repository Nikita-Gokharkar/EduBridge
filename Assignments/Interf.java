interface Interf
{
void info();
}
 class Interface_1 implements Interf
{
public void info()
{
System.out.println("Java is running");
}
public static void main(String args[])
{
Interf f=new Interface_1();
System.out.println(f instanceof Interf);
System.out.println(f instanceof Interface_1);
}
}