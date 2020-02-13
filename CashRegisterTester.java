import java.util.Scanner;

public class CashRegisterTester {

	public static void main(String[] args) {
		// TODO Auto-generated method string
		
		CashRegister transcation = new CashRegister();
		
		double discount = 0.10;
		double minimumpurchase = 50;
		final double Sentinel = -1;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a purchase amount or -1 to stop: ");
		while(in.hasNextDouble()) {
			double item = in.nextDouble();
			
			if(item != Sentinel) {
				System.out.println("Enter a purchase amount or -1 to stop; ");
				transcation.recordPurchase(item);
			}
			else if (item == Sentinel) {
				transcation.calcdiscount();
				transcation.recordpurchasediscount();
				transcation.printcalcpurchase();
				break;
			}
		}
		System.out.println("Enter a payment amount: ");
		double amountrecieved = in.nextDouble();
		transcation.recievePayment(amountrecieved);
		transcation.giveChange();
		transcation.printChange();
	}
}


