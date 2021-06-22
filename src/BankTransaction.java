
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class BankTransaction
{
	LinkedHashMap<String,Double> lhmap =  new LinkedHashMap<String, Double>();
	static double amountBalance=0;
	
	public void checkBalance()
	{
		System.out.print("Your accouunt balance is :" +amountBalance);
	}
	
	public void makeADeposit(double amount)
	{
		amountBalance+=amount;
		System.out.println("Amount is deposited");
		lhmap.put("Amount credited in account", amountBalance);
	}
	
	public void makeAWithdrawl(double  amount)
	{
		amountBalance=amountBalance-amount;
		System.out.println("Amount is wihdrawn");
		lhmap.put("Amount debited from account :", amountBalance);		
	}
	
	@SuppressWarnings("rawtypes")
	public void viewPreviousTransactions()
	{
		 Set set = lhmap.entrySet();
		 Iterator iterator = set.iterator();
		 if(lhmap.values().isEmpty())
		 {
			 System.out.println("No Transations found");
		 }
		 else
		 {
			 while(iterator.hasNext())
	         {
				Map.Entry me = (Map.Entry)iterator.next();
	            System.out.print(me.getKey() + 
	                    " & amount value is: "+me.getValue()+"\n");
	         }
		 }
	}
	
	public void calculateInterest()
	{
		System.out.println(amountBalance+0.05*amountBalance);
	}
}
