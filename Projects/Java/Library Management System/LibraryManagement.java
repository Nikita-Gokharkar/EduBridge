
import java.util.*;

public class LibraryManagement
{
	
	public static void main(String[] args) 
	{
		char r;
		do {
			
		
		System.out.println("************Library Management************");	
		System.out.println("Press 1 to add book");
		System.out.println("Press 2 to issue a book");
		System.out.println("Press 3 to return a book");
		System.out.println("Press 4 to display issue details book");
		System.out.println("Press 5 to exit");
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter any number: ");
		int no=obj.nextInt();
		switch(no)
		{
		
		case 1:
			Library n1=new Library();
			n1.add();
			break;
			
		case 2:
			Library n2=new Library();
			n2.issue();
			break;
			
		case 3:
			Library n3=new Library();
			n3.ret();
			break;
			
		case 4:
			Library n4=new Library();
			n4.detail();
			break;
		
		case 5:
			Library n5=new Library();
			n5.exit();
			break;
			
		default:
			System.out.println("Invalid number");
		}
		System.out.println("You want to select next option Y/N");
		r=obj.next().charAt(0);
		}		
	while(r=='y'||r=='Y');
		
			
		if(r=='n'||r=='N')
		{
			Library z=new Library();
			z.exit();
		}     
		}
	}


class Library
{
	static String str,b,date,name,m,y;
	static int bookno,a,c,book_id,x;
	float price;
	void add()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the book name ");
		 str=sc.nextLine();
		System.out.println("Enter the book price ");
		 price=sc.nextFloat();
		System.out.println("Enter the book_no " );
		 bookno=sc.nextInt();
	}
	
	void issue()
	{
		Scanner sc1 =new Scanner(System.in);
		System.out.println("Enter the book name ");
		 str=sc1.nextLine();
		System.out.println("Enter the book ID " );
		 a=sc1.nextInt();
	        System.out.println("Enter the book issue date ");
		 b=sc1.nextLine();
		 sc1.nextLine();
                System.out.println("Enter the number of books issued ");
		 c=sc1.nextInt();
		System.out.println("Return book date ");
		 date=sc1.nextLine();
		 sc1.nextLine();

	}
	int getid()
	{
		return x;
	}
	
	void ret()
	{
		System.out.println("Enter the Student name & book_id ");
		Scanner sc2=new Scanner(System.in);
		name= sc2.nextLine();
		book_id=sc2.nextInt();
		
		if(x==book_id)
		{
			System.out.println("Details: ");
			System.out.println("Enter the book name: " +Library.str);
			System.out.println("Enter the book id: " +Library.a);
			System.out.println("Enter the issue date: " +Library.b);
			System.out.println("Enter the number of books issued : " +Library.c);
			System.out.println("Enter the book return date: " +Library.date);
		}
		else
		{
			System.out.println("Invalid ID");
		}
		}
	
   void detail()
   {
	    System.out.println("Enter the book name: " +Library.str);
		System.out.println("Enter the book id: " +Library.a);
		System.out.println("Enter the issue date: " +Library.b);
		System.out.println("Enter the book return date: " +Library.date);
   }
	
   
   void exit()
   {
	   System.exit(0);
   }
}
