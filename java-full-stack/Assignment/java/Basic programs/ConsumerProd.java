package ConsumerProd;

public class ConsumerProd
{
	int n;
	public void put(int n)
	{
		System.out.println("put"+n);
		this.n=n;
	}
	
	public void get()
	{
		System.out.println("get"+n);
	}
}

class P implements Runnable
{
ConsumerProd a;
public P( ConsumerProd a)
{
this.a = a;
Thread t=new Thread(this,"Producer");
t.start();
}
public void run()
{
int i=0;
while(true)
{
a.put(i++);
try
{
Thread.sleep(1000);
}
catch(Exception e){
	System.out.println(e);
}
}
}
}
class C implements Runnable
{
 ConsumerProd a;
public C(ConsumerProd a)
{
this.a=a;
Thread t= new Thread(this,"Consumer");
t.start();
}
public void run()
{
	while(true)
	{
		a.get();
		try {
			
			Thread.sleep(1000);
		     }
		catch(Exception e) 
		{
			System.out.println(e);
		}
	}
}

class Inter
{
public static void main(String[] args) 
	{
		ConsumerProd a=new  ConsumerProd();
			new P(a);
			new C(a);
	}	
}
}

