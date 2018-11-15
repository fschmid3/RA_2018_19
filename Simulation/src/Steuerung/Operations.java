package Steuerung;

import Daten.Register;
import Daten.Stack;

public class Operations {

	private Register register;
	private Stack myStack = new Stack();
	
	public Operations(Register pRegister) {
		register=pRegister;
	}

	//saves value in w register
	public void movLW(int code) {
		int value = code & 0x00FF;
		register.setW(value);
		System.out.println(register.getW());
	}

	//does and on value and w register
	public void andLW(int code) {
		int value = code & 0x00FF;
		int result = register.getW()&value;
		register.setW(result);
		setZ(result);
		System.out.println(register.getW());
	}

	//does or on value and w register
	public void iorLW(int code) {
		int value = code & 0x00FF;
		int result = register.getW()|value;
		register.setW(result);
		setZ(result);
		System.out.println(register.getW());
	}

	//subtracts w register from value
	public void subLW(int code) {
		int value = code & 0x00FF;
		int result = value-register.getW();
		register.setW(result);
		setC(result);
		setZ(result);
		setDC(value, result);
		System.out.println(register.getW());
	}

	//adds value on w register
	public void addLW(int code) {
		System.out.println("I'm here");
		int value = code & 0x00FF;
		int result = value+register.getW();
		register.setW(result);
		setC(result);
		setZ(result);
		setDC(value, result);
		System.out.println(register.getW());
	}

	//does xor on value and w register
	public void xorLW(int code) {
		int value = code & 0x00FF;
		int result = register.getW()^value;
		register.setW(result);
		setC(result);
		setZ(result);
		setDC(value, result);
		System.out.println(register.getW());
	}


	//sets w on value and puts latest stackadress in PC
	public void retLW(int code) {
		int value = code & 0x03FF;
		register.setW(value);
		register.setPc(myStack.pop());		//loads pc with saved adress on top of stack
		System.out.println(register.getW());
	}

	

	//sets PC on new value
	public void goTo(int code) {
		int adress = code & 0x07FF;
		register.setPc(adress-1);
		System.out.println("GOTO: "+adress);
	}
	
	public void saveAdressOnStack() {
		myStack.push(register.getPc());
	}


	
	//moves w in f
	public void movWF() {
		register.setF(register.getW());
	}
	
	//clears F
	public void clrF() {
		register.setF(0);
		setZ(0);
	}

	//clears W
	public void clrW() {
		register.setW(0);
		setZ(0);
	}

	//Subtracts W from F
	public void subWF(int code) {
		int value =  register.getF()-register.getW();
		saveInFOrWBasedOnD(code, value);
		setZ(value);
		setC(value);
		setDC(code&0x007F, value);
	}

	//decrements F
	public void decF(int code) {
		int value =  register.getF()-1;
		saveInFOrWBasedOnD(code, value);
		setZ(value);
	}

	//inclusive or w with f
	public void iorWF(int code) {
		int value =  register.getF()|register.getW();
		saveInFOrWBasedOnD(code, value);
		setZ(value);
	}

	//and or w with f
	public void andWF(int code) {
		int value = register.getF()&register.getW();
		saveInFOrWBasedOnD(code, value);
		setZ(value);
	}

	//exclusive or w with f
	public void xorWF(int code) {
		int value =  register.getF()^register.getW();
		saveInFOrWBasedOnD(code, value);
		setZ(value);
	}
	
	//adds w and f
	public void addWF(int code) {
		int value =  register.getF()+register.getW();
		saveInFOrWBasedOnD(code, value);
		setZ(value);
		setC(value);
		setDC(code&0x007F, value);
	}
	
	//moves f
	public void movF(int code) {
		int value =  register.getF();
		saveInFOrWBasedOnD(code, value);
		setZ(value);
	}
	
	//complements f
	public void comF(int code) {
		int value =  ~register.getF();
		saveInFOrWBasedOnD(code, value);
		setZ(value);
	}
	
	//increments f
	public void incF(int code) {
		int value =  register.getF()+1;
		saveInFOrWBasedOnD(code, value);
		setZ(value);
	}
	
	//decrements f if not 0
	public void decFSZ(int code) {
		int value =  register.getF()-1;
		if(register.getF()!=0) {
			saveInFOrWBasedOnD(code, value);
			setZ(value);
		}
	}
	
	//rotates f right
	public void rrF(int code) {
		int value =  Integer.rotateRight(register.getF(), 1);
		saveInFOrWBasedOnD(code, value);
		setC(value);
	}
	
	//rotates f left
	public void rlF(int code) {
		int value =  Integer.rotateLeft(register.getF(), 1);
		saveInFOrWBasedOnD(code, value);
		setC(value);
	}
	
	//swaps high and low nibble of f
	public void swapF(int code) {
		int contentF = register.getF();
		int tempHighNibble = contentF & 0x00F0;
		int tempLowNibble = contentF & 0x000F;
		contentF = Integer.rotateRight(tempHighNibble, 4) + Integer.rotateLeft(tempLowNibble, 4);
		saveInFOrWBasedOnD(code, contentF);
		setZ(contentF);
	}
	
	//increments f if not 0
	public void incFSZ(int code) {
		if(register.getF()!=0) {
			saveInFOrWBasedOnD(code, register.getF()+1);
		}
	}
	
	
	
	
	//decides depending on d, whether to save in W or F
	private void saveInFOrWBasedOnD(int code, int value) {
		int masked = code & 0x0080;
		if(masked==0) {
			register.setW(value);
		}else {
			register.setF(value);
		}
	}
	
	
	// returns and takes adress from stack
	public void returnCommand() {
		register.setPc(myStack.pop()-1);
		
	}
	
	
	// sleeps
	public void sleepCommand() {
		// not already impelemented 
		System.out.println("sleep method in operations not already impelmented");
	}
	
	
	
	
	
	
	
	private void setZ(int result) {
		if (result == 0) {
			register.setZ(1);
		}else {
			register.setZ(0);
		}
	}

	private void setC(int result) {
		if (result > 256) {
			register.setC(1);
		}else {
			register.setC(0);
		}
	}


	private void setDC(int value, int result) {
		int maskedValue = value & 0x0010;
		int maskedResult = result & 0x0010;
		if (maskedValue != maskedResult) {
			register.setDc(1);
		}else {
			register.setC(0);
		}
	}
	
}
