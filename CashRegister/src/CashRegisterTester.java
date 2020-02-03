import java.util.Scanner;

public class CashRegisterTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double purchase;
		double payment;
		final double Sentinel = -1;
		
		Scanner in = new Scanner(System.in);
		CashRegister transation = new CashRegister();
		
		System.out.print("Enter a purchase amount, or -1 to stop: ");
		while(in.hasNextDouble()) {
			double payment1 = in.nextDouble();
		if(payment1 == Sentinel) {
			break;
		}
		
		System.out.println("Enter a purchase amount or -1 to stop: ");
		transation.recordPurchase(payment1);
		}
		 
		 System.out.println("Enter a payment amount: ");
		 double paymentAmount = in.nextDouble();
		 transation.recievePayment(paymentAmount);
		 transation.giveChange();
		 transation.printChange();
		 }
	}

