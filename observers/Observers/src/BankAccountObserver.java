import java.util.Observable;
import java.util.Observer;

public class BankAccountObserver implements Observer
{

	private BankAccount bankAccount = null;

	public BankAccountObserver(BankAccount bankAccount)
	{
		this.bankAccount = bankAccount;
	}
	@Override
	public void update(Observable o, Object arg)
	{
		if (o == bankAccount)
	      {
			System.out.println("New balance: " + bankAccount.getBalance());
	      }

	}

}
