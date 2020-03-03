import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		final int first = 10;
		final int second = 20;
		final int third = 30;
		boolean isDone = false;
		String stringticks;
		int ticks;
		Combolock lock = new Combolock(first, second, third);
		System.out.println("First Attempt");
		System.out.println("Enter number of ticks to turn to the right 0-39. Enter an invalid number to quit.");
		stringticks = in.next();

		while (isDone == false) {
			if (!(((Integer.parseInt(stringticks)) < 40) && ((Integer.parseInt(stringticks)) > 0))) {
				System.out.println("Thank you, have a good day!");
				isDone = true;
			} else if (((Integer.parseInt(stringticks)) < 40) && ((Integer.parseInt(stringticks)) > 0)) {
				ticks = Integer.parseInt(stringticks);
				lock.turnRight(ticks);
			}
			if (isDone == false) {
				System.out.println("Enter number of ticks to turn to the left 0-39. Enter an invalid number to quit.");
				stringticks = in.next();
				if (!(((Integer.parseInt(stringticks)) < 40) && ((Integer.parseInt(stringticks)) > 0))) {
					System.out.println("Thank you, have a good day!");
					isDone = true;
				} else if (((Integer.parseInt(stringticks)) < 40) && ((Integer.parseInt(stringticks)) > 0)) {
					ticks = Integer.parseInt(stringticks);
					lock.turnLeft(ticks);
				}
			}
			if (isDone == false) {
				System.out.println("Enter number of ticks to turn to the right 0-39. Enter an invalid number to quit.");
				stringticks = in.next();
				if (!(((Integer.parseInt(stringticks)) < 40) && ((Integer.parseInt(stringticks)) > 0))) {
					System.out.println("Thank you, have a good day!");
					isDone = true;
				} else if (((Integer.parseInt(stringticks)) < 40) && ((Integer.parseInt(stringticks)) > 0)) {
					ticks = Integer.parseInt(stringticks);
					lock.turnRight(ticks);
				}
			}
			if (isDone == false) {
				if (lock.open()) {
					System.out.println("You opened the lock!");
					isDone = true;
				} else {
					System.out.println("You did not open the lock!");
					isDone = true;
				}
			}
		} 
		isDone = false;
		System.out.println();
		lock.reset();
		System.out.println("Second Attempt");
		while (isDone == false) {
			System.out.println("Enter number of ticks to turn to the right 0-39. Enter an invalid number to quit.");
			stringticks = in.next();
			if (!(((Integer.parseInt(stringticks)) < 40) && ((Integer.parseInt(stringticks)) > 0))) {
				System.out.println("Thank you, have a good day!");
				isDone = true;
			} else if (((Integer.parseInt(stringticks)) < 40) && ((Integer.parseInt(stringticks)) > 0)) {
				ticks = Integer.parseInt(stringticks);
				lock.turnRight(ticks);
			}
			if (isDone == false) {
				System.out.println("Enter number of ticks to turn to the left 0-39. Enter an invalid number to quit.");
				stringticks = in.next();
				if (!(((Integer.parseInt(stringticks)) < 40) && ((Integer.parseInt(stringticks)) > 0))) {
					System.out.println("Thank you, have a good day!");
					isDone = true;
				} else if (((Integer.parseInt(stringticks)) < 40) && ((Integer.parseInt(stringticks)) > 0)) {
					ticks = Integer.parseInt(stringticks);
					lock.turnLeft(ticks);
				}
			}
			if (isDone == false) {
				System.out.println("Enter number of ticks to turn to the right 0-39. Enter an invalid number to quit.");
				stringticks = in.next();
				if (!(((Integer.parseInt(stringticks)) < 40) && ((Integer.parseInt(stringticks)) > 0))) {
					System.out.println("Thank you, have a good day!");
					isDone = true;
				} else if (((Integer.parseInt(stringticks)) < 40) && ((Integer.parseInt(stringticks)) > 0)) {
					ticks = Integer.parseInt(stringticks);
					lock.turnRight(ticks);
				}
			}
			if (isDone == false) {
				if (lock.open()) {
					System.out.println("You opened the lock!");
					isDone = true;
				} else {
					System.out.println("You did not open the lock!");
					isDone = true;
				}
			}
		} 
	}
}// class
