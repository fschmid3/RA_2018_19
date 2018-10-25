package Steuerung;

import Daten.Register;
import Daten.Stack;
import UserInterface.GUI_Simulation;

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
		register.setPc(adress);
		System.out.println("GOTO: "+adress);
	}
	
	public void saveAdressOnStack() {
		myStack.push(register.getPc());
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
