package Steuerung;

import Daten.Register;

public class Operations {

	Register register = new Register();

	//saves value in w register
	public void movLW(int code) {
		int value = code & 0x00FF;
		register.setW(value);
	}

	//does and on value and w register
	public void andLW(int code) {
		int value = code & 0x00FF;
		register.setW(register.getW()&value);
	}

	//does or on value and w register
	public void iorLW(int code) {
		int value = code & 0x00FF;
		register.setW(register.getW()|value);
	}

	//subtracts w register from value
	public void subLW(int code) {
		int value = code & 0x00FF;
		register.setW(value-register.getW());
	}

	//adds value on w register
	public void addLW(int code) {
		int value = code & 0x00FF;
		register.setW(value+register.getW());
	}

	//does xor on value and w register
	public void xorLW(int code) {
		int value = code & 0x00FF;
		register.setW(register.getW()^value);
	}

}
