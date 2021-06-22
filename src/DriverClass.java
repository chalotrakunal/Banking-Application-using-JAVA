import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class DriverClass 
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));    
		System.out.println("Please Enter name and account number");
		String enterData=null;
		try
		{
		  enterData= br.readLine();	
		  String[] arrayNameAccountId = enterData.split(",");
		  BankingModel bank= new BankingModel(arrayNameAccountId[0],Integer.parseInt(arrayNameAccountId[1]));
		  System.out.println("Welcome user: "+bank.getName()+" " +"with account number :" +bank.getAccountId());
		} catch (Exception e)
		{
			System.out.println("Please enter correct details in the format of name,account number");
		}
		SelectMenus selectMenu= new SelectMenus();
		selectMenu.showMenus();
		selectMenu.selectDifferentTransactionMode();
	}
}
