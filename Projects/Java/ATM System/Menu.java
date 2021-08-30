
import java.util.*;
import java.text.DecimalFormat;
import java.io.IOException;
class Menu extends AccountInfo {

	Scanner sc=new Scanner(System.in);
	DecimalFormat money=new DecimalFormat("'Rs' ###,##0.00");
	
	HashMap<Integer,Integer> login= new HashMap<Integer, Integer>();
	
	public void getLogin() throws IOException
	{
		
		int x=1;
		do
		{
			try
			{
			login.put(123456,654321);
			login.put(101112,121110);
			System.out.println(" ___________________________________________________");
			System.out.println("|					            |");
			System.out.println("|       Welcome to the Indian ATM Bank System       |");
			System.out.println("|___________________________________________________|");
			System.out.println(" ");

			System.out.println("Enter your Customer Number");
			setCustomerNo(sc.nextInt());
			
			System.out.println("Enter your PIN Number");
			setPinNo(sc.nextInt());
			}
			catch(Exception e)
			{
				System.out.println("\n" + "Invalid Character(s).Only Numbers." + "\n");
				x=2;
			}
			
			int cn = getCustomerNo();
			int pn = getPinNo();
			if(login.containsKey(cn) && login.get(cn)== pn)
			{
				getAccountType();
			}
			else
				System.out.println("\n" + "Wrong Customer Number or Pin Number" + "\n");
		}
		while(x==1);
		}
	public void getAccountType()
	{
		System.out.println("Select the account you want to access: ");
		System.out.println("|-----------------------|");
		System.out.println("|   1: Checking Account |");
		System.out.println("|   2: Saving Account   |");
		System.out.println("|   3: Exit             |");
		System.out.println("|-----------------------|");

		int selectoptn = sc.nextInt();
		
		switch(selectoptn)
		{
		case 1:
			getChecking();
			break;
			
		case 2:
			getSaving();
			break;
			
		case 3:
			System.out.println("Thank you for using out ATM System");
			break;
			
		default:
			System.out.println("Invalid Choice");		
		}
	}
	
	public  void  getChecking()
	{
		System.out.println(" Checking Account: ");
		System.out.println("1: View Account Balance");
		System.out.println("2: Withdraw Funds ");
		System.out.println("3: Deposite Funds ");
		System.out.println("4: Exit");
		System.out.println(" Choice: ");

		int selection = sc.nextInt();
		
		switch(selection)
		{
		case 1:
		System.out.println("Checking Account Balance: " + moneyFormat.format(getCheckingBalance()));
		getAccountType();
		break;
		
		case 2:
			getCheckingWithdraw();
			getAccountType();
			break;
			
		case 3:
			getCheckingDeposite();
			getAccountType();
			break;
			
		case 4:
			System.out.println("Thank you for using out ATM System");
			break;
			
		default:
			System.out.println(" Invalid Choice ");
			getChecking();
		}
	}
	
	
	public void getSaving()
	{
		System.out.println(" Checking Account: ");
		System.out.println("1: View Account Balance");
		System.out.println("2: Withdraw Funds ");
		System.out.println("3: Deposite Funds ");
		System.out.println("4: Exit");
		System.out.println(" Choice: ");

		int selection = sc.nextInt();
		
		switch(selection)
		{
		case 1:
			System.out.println("Saving Account Balance: " + moneyFormat.format(getSavingBalance()));
			getAccountType();
		break;
		
		case 2:
			getSavingWithdraw();
			getAccountType();
			break;
			
		case 3:
			getSavingDeposite();
			getAccountType();
			break;
			
		case 4:
			System.out.println("Thank you for using out ATM System");
			break;
			
		default:
			System.out.println(" Invalid Choice ");
			getChecking();
		}
	}
}
