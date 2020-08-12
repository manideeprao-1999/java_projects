import bank.ATMservices;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;
import banking.Services;
import exceptions.InSufficientBalance;
import exceptions.InvalidWithdraw;
import exceptions.InvalidDeposit;
class ATM 
{
	public static void main(String sri[]) 
	{
		Services sr = new Services();
		while(true)
		{
			try
			{
				Scanner s = new Scanner(in);
				ATMservices.atmOptions();
				out.print("\n\tEnter the option from the above Menu :  ");
				int op = Integer.parseInt(s.nextLine());
				switch (op)
				{
				case 1: try
						{
							sr.withDraw();
						}
						catch (NumberFormatException nfe)
						{
							out.println("\n\tInvalid Type of Currency , please try again");
						}
						catch (InSufficientBalance isb)
						{
							out.println("\n\tInsufficient Balance , please try again");
						}
						catch (InvalidWithdraw iwd)
						{
							out.println("\n\tInvalid Type of Currency , please try again");
						}
						break;

				case 2: try
						{
							sr.deopsit();
						}
						catch (NumberFormatException nfe)
						{
							out.println("\n\tInvalid Type of Amount , Please deposit valid Currency ");
						}
						catch (InvalidDeposit idp)
						{
							out.println("\n\tInvalid Type of Amount , Please deposit valid Currency.");
						}
						break;

				case 3: sr.balanceEnqirey();
						break;

				case 4: out.println("****************************************************************");
						out.println("\n\tThank You For Using Union Bank ATM Services ");
						out.println("\n\t\t Please Visit Again");
						out.println("****************************************************************");
						System.exit(0);
				default : out.println("\n\tInvalid Option..! , Please Try Again. ");
				}
			}catch (NumberFormatException nfe)
				{
				out.println("\n\tInvalid Option..! , Please Try Again. ");
				}
		}
	}
}
