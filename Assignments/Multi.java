class Multi extends Thread
{
public void run()
{
for(int i=0;i<5;i++)
{
	System.out.println("This Is Ecxeption handling");
try {
	
	Thread.sleep(600);
}
catch(Exception e)
{
	System.out.println(e);
}
}
}
}

class Threading extends Thread
{
public void run()
{
for(int i=0;i<5;i++)
{
	System.out.println("This Is Multithreading");
try {
	
	Thread.sleep(600);
}
catch(Exception e)
{
	System.out.println(e);

}
}
}
}

public static void main(String[] args) {
	Multi m= new Multi();
	m.start();
	Threading t= new Threading();
	t.start();
}


