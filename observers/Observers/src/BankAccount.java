//the observable
import java.util.Observable;

public class BankAccount extends Observable
{

	private int balance = 0;

	public BankAccount(int balance)
	{
		this.balance = balance;
	}

	public int getBalance()
	{
		return balance;
	}

	public void setBalance(int balance)
	{
		this.balance = balance;
		setChanged();//set the flag to indicate that this observable has changed
	    notifyObservers();//notify everyone
	}
}
