package banking;
import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;
import exceptions.InSufficientBalance;
import exceptions.InvalidDeposit;
import exceptions.InvalidWithdraw;
public class  Services
{
	double bal;
	Scanner s = new Scanner(in);
	public Services()
	{
		bal = 500;
	}
	public void withDraw() throws NumberFormatException,InSufficientBalance,InvalidWithdraw
	{
		out.print("\n\tEnter the Amount you want to withdraw :  ");
		int wdamt = Integer.parseInt(s.nextLine());
		if (wdamt>bal)
		{
			InSufficientBalance isb = new InSufficientBalance();
			throw isb;
		}
		else
		{
			if(wdamt <= 0)
			{
				InvalidWithdraw iwd = new InvalidWithdraw();
				throw iwd;
			}
			else
			{
				out.println("\n\tRs : "+wdamt+" withdrawn from your account "); 
				bal = bal - wdamt;
				out.println("\n\tBalance = "+bal);

			}
		}
	}
	public void deopsit() throws NumberFormatException,InvalidDeposit 
	{
		out.print("\n\tEnter the Amount you want to deposit :  ");
		int dpamt = Integer.parseInt(s.nextLine());
		if (dpamt <= 0)
		{
			InvalidDeposit idp = new InvalidDeposit();
			throw idp;
		}
		else
		{
			bal = bal + dpamt;
			out.println("\n\tYour Account Balance = "+bal);
		}
	}
	public void balanceEnqirey()
	{
		out.println("\n\tYour Account Balance = "+bal);
	}
}
