
import java.util.*;
import java.text.DecimalFormat;
public class AccountInfo
{

	private int customerNo;
	private int pinNo;
	private int checkingBalance = 1500;
	private int savingBalance = 0;
	
	Scanner sc= new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'Rs' ###,##0.00");
	
	public int setCustomerNo(int customerNumber)
	{
		this.customerNo = customerNumber;                        
		return customerNo;	                                    
	}
	
	public int getCustomerNo()
	{
		return customerNo;	
	}
	
	public int setPinNo(int pinNo)
	{
		this.pinNo=pinNo;
		return pinNo;
	}
	
	public int getPinNo()
	{
		return pinNo;
	}
	
	public int getSavingBalance()
	{
		return savingBalance;
	}
	
	public int getCheckingBalance()                        //search in video
	{
		return checkingBalance;
	}
	
	public double calCheckingWithdraw(int amount)
	{
		checkingBalance = (checkingBalance - amount);
		return checkingBalance;
	}

	public double calSavingWithdraw(int amount)
	{
		savingBalance = (savingBalance - amount);
		return savingBalance;
	}
	
	public double calcheckingDeposite(int amount)
	{
		checkingBalance = (checkingBalance + amount);
		return checkingBalance;
	}
	
	public double calsavingDeposite(int amount)
	{
		savingBalance = (savingBalance + amount);
		return savingBalance;
	}
	public void getCheckingWithdraw()
	{
		System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
		System.out.println("Enter the amount you want to withdraw from Checking account");
		int amount = sc.nextInt();                     
		
		if ((checkingBalance - amount)>= 0 )
		{
			calCheckingWithdraw(amount);
			System.out.println("New Checking Account Balance: " +moneyFormat.format(checkingBalance));
		}
		else
		{
			System.out.println("Balance cannot be Negative ");
		}
	}
	
	public void getSavingWithdraw()
	{
		System.out.println("Saving Account Balance: " +moneyFormat.format(savingBalance));
		System.out.println("Enter the amount you want to withdraw from Saving account");
		int amount = sc.nextInt();
		
		if ((savingBalance - amount)>= 0 )
		{
			calSavingWithdraw(amount);
			System.out.println("New Saving Account Balance: " +moneyFormat.format(savingBalance));
		}
		else
		{
			System.out.println("Balance cannot be Negative ");
		}
	}
	
	public void getCheckingDeposite()
	{
		System.out.println("Checking Account Balance: " +moneyFormat.format(checkingBalance));
		System.out.println("Enter the amount you want to deposite to Checking account");
		int amount = sc.nextInt();
		
		if ((checkingBalance + amount)>= 0 )
		{
			calcheckingDeposite(amount);
			System.out.println("New Checking Account Balance: " +moneyFormat.format(checkingBalance));
		}
		else
		{
			System.out.println("Balance cannot be Negative ");
		}
	}
	
	public void getSavingDeposite()
	{
		System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
		System.out.println("Enter the amount you want to deposite to Saving account");
		int amount = sc.nextInt();
		
		if ((savingBalance + amount)>= 0 )
		{
			calsavingDeposite(amount);
			System.out.println("New Saving Account Balance: " +moneyFormat.format(savingBalance));
		}
		else
		{
			System.out.println("Balance cannot be Negative ");
		}
	}
}

