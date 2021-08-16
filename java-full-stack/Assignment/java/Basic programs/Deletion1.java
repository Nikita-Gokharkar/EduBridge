import java.util.Scanner;

 class Deletion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[5] ;
		int p;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 5 elements");
		for (int i =0; i<5; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("the elements are :");
		for (int i =0; i<5; i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Enter the position  want to delete :");
		p=sc.nextInt();
		for (int i =p; i<4; i++)//2
		{
		 arr[i]=arr[i+1];	//arr[2]=arr[3]
			
		}
	
		System.out.println(" new array:");
		for (int i =0; i<4; i++)
		{
			System.out.println(arr[i]);
		}
		
		}
	}