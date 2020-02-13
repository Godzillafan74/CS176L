
public class CashRegister {
	private double purchase;
	private double purchasediscount;
	private double payment;
	private double minpayment;
	private double discount;
	
public CashRegister() {
	purchase = 0;
	purchasediscount = 0;
	payment = 0;
	minpayment = 50;
	discount = 0;
}

public void recordPurchase(double amount) {
	purchase = purchase + amount;
}

public void recievePayment(double amount) {
	payment = payment + amount;
}

public void calcdiscount() {
	if (purchase > minpayment) {
		discount = purchase * 0.10;
	}
}

public void recordpurchasediscount() {
	if(purchase > minpayment) {
		purchasediscount = purchase - discount;
	}
}

public void printcalcpurchase() {
	System.out.println("Your total purchase were $"+ purchase + " and because you spent over $" + minpayment + ", you are entitled to a 10% discount of $" + discount + " reducing the balance to $" + purchasediscount + "");
}

public double giveChange() {
	double change = purchase - payment;
	return change;
}
	
public void printChange() {
	System.out.printf("Your change is : %.2f", giveChange());
}

}


