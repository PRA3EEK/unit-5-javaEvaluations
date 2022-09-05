package sprint1Evaluation;

public class CashPayment implements Payment{
	private int amount;

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public CashPayment(int amount) {
		super();
		this.amount = amount;
	}
public CashPayment() {
	// TODO Auto-generated constructor stub
}
public void doPayment() {

	System.out.println("Payment done using Cash "+amount);
}
}
