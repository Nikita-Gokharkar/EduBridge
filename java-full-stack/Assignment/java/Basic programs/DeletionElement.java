
import java.util.*;
 class DeletionElement
 {
	 
	public static void main(String[] args) {
	int n,pos=0;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of element you want to enter ");
	n=sc.nextInt();
	
	int arr[]=new int[n];
	System.out.println("Enter the elements ");		
	
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	
	System.out.println("Enter the position you want to enter the element ");
	pos=sc.nextInt();
	
	System.out.println("Enter the element you want to delete ");
	int x=sc.nextInt();
	
	for(int i=0;i<n;i++)
	{
		if(x==arr[i])
		{
			for(int i=j;j<n;j++)
				
			arr[j]=arr[j+1];	
				
		}
			
	}
		
 }	
	
}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	