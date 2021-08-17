package InsertElement;
import java.util.*;
public class InsertElement {

	public static void main(String[] args)
	{
	
	int n,i,pos=0,x;
	
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the number of elements");
	n=sc.nextInt();
	
	int arr[]=new int[n+1];
	System.out.println("Enter the elements");

	for(i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	System.out.println("Insert the position you want to enter the element");
	pos=sc.nextInt();
	
	System.out.println("Enter the element you want to insert");
	x=sc.nextInt();
	
	for(i=(n-1); i>=(pos-1); i--)
	{
		arr[i+1]=arr[i];
	}	
	arr[pos-1]=x;	
	System.out.println("After Inserting");
		for(i=0;i<n;i++)
		{
			System.out.println(arr[i]);	
		}
		
		System.out.print(arr[n]);
		}

}

