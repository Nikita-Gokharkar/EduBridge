public class Meth
{
public static void main(String args[])
{
Runnable r  = new Runnable()
{
public void run()
{
for(int i=0;i<=5;i++)
{
System.out.println("java ");
try
{
Thread.sleep(600);
}
catch(Exception e)
{
System.out.println(e);
}
}
}
};

Runnable r1  = new Runnable()
{
public void run()
{
for(int i=0;i<=5;i++)
{
System.out.println("java ");
try
{
Thread.sleep(600);
}
catch(Exception e)
{
System.out.println(e);
}
}
}
};
Thread t=new Thread();
t.start();
Thread t1=new Thread();
t1.start();
}
}