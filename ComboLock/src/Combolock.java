
public class Combolock {
	int first;
	int second;
	int third;
	int currentposition= 0;
	boolean firstcheck = false;
	boolean secondcheck = false;
	boolean thirdcheck = false;
	boolean isOpen= false;
	public Combolock(int inSecret1, int inSecret2, int inSecret3) {
		first = inSecret1;
		second = inSecret2;
		third = inSecret3;
	}
	public void reset() {
		currentposition = 0;
		firstcheck = false;
		secondcheck = false;
		thirdcheck = false;
		isOpen= false;
	}
	public void turnLeft(int inTicks) {
	for(int a = 1; a <= inTicks; a++) {
		if (currentposition == 40) {
		currentposition = 0;
			}
		currentposition++;
			}
	if (firstcheck == true) {
		if (currentposition == first) {
		secondcheck = true;
				}
		}
	}
	public void turnRight( int inTicks) {
	for(int b = 1; b <= inTicks; b++) {
	if (currentposition == 0) {
		currentposition = 40;
			}
		currentposition--;
	
		}
	if (firstcheck == false) {
		if (currentposition == first) {
			firstcheck = true;
			}
		}
		else if (firstcheck == true) {
	if (currentposition == third) {
			thirdcheck = true;
				}
			}
		}
	public boolean open() {
		if (firstcheck && secondcheck && thirdcheck) {
				isOpen = true;
			}
		return isOpen;
		}
	}//class

