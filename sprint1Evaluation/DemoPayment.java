package sprint1Evaluation;

import java.util.ArrayList;
import java.util.List;

public class DemoPayment {
 
	
	public void doTransaction (List<? extends Payment> list) {
		
		for(int i=0; i<list.size() ; i++) {
			list.get(i).doPayment();
		}
		
	}
	
	public static void main(String[] args) {
		DemoPayment dp = new DemoPayment();
		List<CardPayment> l1 = new ArrayList<>();
		List<CashPayment> l2 = new ArrayList<>();
		l1.add(new CardPayment(8000));
		l1.add(new CardPayment(7000));
        l2.add(new CashPayment(6000));
        l2.add(new CashPayment(9000));
		dp.doTransaction(l1);
		dp.doTransaction(l2);
	}
}
