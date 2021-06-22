
public class BankingModel 
{
	private String name;
	private long accountId;
	private double credit;
	private double debit;
	
	public BankingModel(String name, long accountId) {
		
		this.name = name;
		this.accountId = accountId;
	}
	
	public String getName() {
		return name;
	}

	public long getAccountId() {
		return accountId;
	}

	public double getCredit() {
		return credit;
	}
	
	public double getDebit() {
		return debit;
	}
	
}
