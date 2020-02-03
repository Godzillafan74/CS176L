
public class CashRegister {
	private double purchase;
	private double payment;
	
public CashRegister() {
	purchase = 0;
	payment = 0;
}

public void recordPurchase(double amount) {
	purchase = purchase + amount;
}

public void recievePayment(double amount) {
	payment = payment + amount ;
}

public double giveChange() {
	double change = purchase - payment;
	return change;
}
	
public void printChange() {
	System.out.printf("Your change is : %.2f", giveChange());
}

}


