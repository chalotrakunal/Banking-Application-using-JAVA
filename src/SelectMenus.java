import java.util.Scanner;

public class SelectMenus
{
	public void showMenus() 
	{
		System.out.println();
		System.out.println("What would you like to do ?");
		System.out.println("Enter Character 'A' to: Check your balance");
	    System.out.println("Enter Character 'B' to. Make a deposit");
	    System.out.println("Enter Character 'C' to. Make a withdrawl");
	    System.out.println("Enter Character 'D' to. View Previous Transactions");
	    System.out.println("Enter Character 'E' to. Calculate Interest");
	    System.out.println("Enter Character 'F'to . Exit From Application"); 
	}
	public void selectDifferentTransactionMode()
	{
		Scanner scanner= new Scanner(System.in);
		BankTransaction bankTrans= new BankTransaction();
		boolean valueToContinue=true;
		while(valueToContinue)
		{
			
			char input=Character.toUpperCase(scanner.next().charAt(0));
			switch (input) {
			  case 65:
			    bankTrans.checkBalance();
			    break;
			  case 66:
				System.out.println("Please enter the amount to deposit.");
				double  amount=0;
				try 
				{
				amount=scanner.nextDouble();
				bankTrans.makeADeposit(amount); 	
				} catch (Exception e) 
				{
					System.out.println("Please enther the value in correct format");
				}
			    break;
			  case 67:
				System.out.println("Enter the Amount to withdraw from account");
				//double  amount1=0;
				try 
				{
				amount=scanner.nextDouble();
				bankTrans.makeAWithdrawl(amount); 	
				}catch (Exception e) 
				{
					System.out.println("Please enther the value in correct format");
				}
			    break;
			  case 68:
				bankTrans.viewPreviousTransactions();
			    break;
			  case 69:
			    bankTrans.calculateInterest();
			    break;
			  case 70:
				valueToContinue=false;
				System.out.println("You are exit from the application run the application again to contiue");
				break;
			  default:
				  System.out.println("Please choose either A,B,C,D,E, from above menus");
			    break;
			    
			}
		}

		scanner.close();
	}
}
			    
		
	
