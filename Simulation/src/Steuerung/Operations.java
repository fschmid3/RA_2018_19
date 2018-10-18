package Steuerung;

import Daten.Register;

public class Operations {

	Register register = new Register();

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
		setZ(result);
		System.out.println(register.getW());
	}

	//adds value on w register
	public void addLW(int code) {
		int value = code & 0x00FF;
		int result = value+register.getW();
		register.setW(result);
		setZ(result);
		System.out.println(register.getW());
	}

	//does xor on value and w register
	public void xorLW(int code) {
		int value = code & 0x00FF;
		int result = register.getW()^value;
		register.setW(result);
		setZ(result);
		System.out.println(register.getW());
	}
	
	
	
	private void setZ(int result) {
		if (result == 0) {
			register.setZ(1);
		}else {
			register.setZ(0);
		}
	}

}
