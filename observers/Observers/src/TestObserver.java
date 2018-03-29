import java.util.ArrayList;
import java.util.Observer;

public class TestObserver
{

	public static void main(String[] args)
	{
		ArrayList<Observer> users = new ArrayList<>();
		BankAccount bankAccount = new BankAccount(1);
		System.out.println("Initial balance: " + bankAccount.getBalance());

		int observerNum = 7;
		for(int i = 0; i < observerNum; i++){
			BankAccountObserver bankAccountObserver = new BankAccountObserver(bankAccount);
			users.add(bankAccountObserver);
		}
		for(Observer user : users){
			bankAccount.addObserver(user);
		}
		System.out.println("Num of observers: " + bankAccount.countObservers());//to check how many observers we have registered
		bankAccount.setBalance(22);
		/*bankAccount.deleteObserver(users.get(5)); //removes the status of observer from the selected element
		System.out.println("Num of observers: " + bankAccount.countObservers());*/
		bankAccount.setBalance(99);
	}

}
