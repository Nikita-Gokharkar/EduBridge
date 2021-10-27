
public class DownCasting {
	void show()
	 {
		System.out.println("Learning java");	
	 }
}
class DownC extends DownCasting
	{
	  void show()
	  	{
		  System.out.println("Java is fun to learn");	
	  	}
	
	public static void main(String[] args) {
		DownCasting obj1= new DownC();
		DownC obj2= (DownC)obj1;
		obj2.show();
	}

}
