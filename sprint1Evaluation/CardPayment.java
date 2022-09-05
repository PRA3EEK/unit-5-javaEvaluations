package sprint1Evaluation;

public class CardPayment implements Payment{
 private int amount;

public int getAmount() {
	return amount;
}

public void setAmount(int amount) {
	this.amount = amount;
}

public CardPayment(int amount) {
	super();
	this.amount = amount;
}
 public CardPayment() {
	// TODO Auto-generated constructor stub
}
 @Override
 public void doPayment() {

		System.out.println("Payment done using Card "+amount);
	}
}
