import java.util.*;

class methodOverding
{
void show()
{
System.out.println("Learning java");	
}
}
class overM extends methodOverding
{
void show()
{
	System.out.println("Java is fun to learn");	
}
}

class Main
{
	public static void main(String[] args)
	{
overM obj = new overM();
obj.show();
	}
}
