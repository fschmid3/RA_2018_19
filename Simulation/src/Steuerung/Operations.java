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
		int value = code & 0xFF;
		register.setW(value);
		//System.out.println(register.getW());
	}

	//does and on value and w register
	public void andLW(int code) {
		int value = code & 0x00FF;
		int result = register.getW()&value;
		register.setW(result);
		setZ(result);
		//System.out.println(register.getW());
	}

	//does or on value and w register
	public void iorLW(int code) {
		int value = code & 0x00FF;
		int result = register.getW()|value;
		register.setW(result);
		setZ(result);
		//System.out.println(register.getW());
	}

	//subtracts w register from value
	public void subLW(int code) {
		int value = code & 0x00FF;
		int result = (value+(((~register.getW())&255)+1));
		int oldW = register.getW();
		register.setW(result);
		setC(result);
		setZ(result);
		setDC(oldW, value);
		//System.out.println(register.getW());
	}

	//adds value on w register
	public void addLW(int code) {
		int oldW = register.getW();
		int value = code & 0x00FF;
		int result = (value+register.getW());
		register.setW(result);
		setC(result);
		setZ(result);
		setDC(oldW, value);
		//System.out.println(register.getW());
	}

	//does xor on value and w register
	public void xorLW(int code) {
		int value = code & 0x00FF;
		int result = (register.getW()^value);
		register.setW(result);
		setZ(result);
		//System.out.println(register.getW());
	}


	//sets w on value and puts latest stackadress in PC
	public void retLW(int code) {
		int value = code & 0x03FF;
		register.setW(value);
		register.setPc(myStack.pop());		//loads pc with saved adress on top of stack
		//System.out.println(register.getW());
	}

	

	//sets PC on new value
	public void goTo(int code) {
		int adress = code & 0x07FF;
		register.setPc(adress-1);
		incrementTimer0();
		incrementRuntime();
		System.out.println("GOTO: "+adress);
	}
	
	public void saveAdressOnStack() {
		myStack.push(register.getPc());
	}


	
	//moves w in f
	public void movWF(int code) {
		register.setRamContent(code&0x7F, register.getW());
	}
	
	//clears F
	public void clrF(int code) {
		if((code&0x7F)==3) {
			register.setRamContent(code&0x7F, register.getStatus()&0x1F);
		}else {
			register.setRamContent(code&0x7F, 0);
		}
		register.setZ(1);
		
	}

	//clears W
	public void clrW() {
		register.setW(0);
		setZ(0);
	}

	//Subtracts W from F
	public void subWF(int code) {
		int oldW = register.getW();
		int oldF = register.getRamContent(code&0x7F);
		int value =  oldF+(((~oldW)+1)&255);
		setDCMinus(oldF, oldW);
		setZ(value);
		setC(value);
		System.out.println("wert:" + register.getRamContent(code&0x7F) + ",");
		saveInFOrWBasedOnD(code, value);
	}

	//decrements F
	public void decF(int code) {
		int value =  register.getRamContent(code&0x7F)-1;
		if(value<0) {
			value = 255;
		}
		setZ(value);
		saveInFOrWBasedOnD(code, value);
	}

	//inclusive or w with f
	public void iorWF(int code) {
		int value =  register.getRamContent(code&0x7F)|register.getW();
		setZ(value);
		saveInFOrWBasedOnD(code, value);
	}

	//and or w with f
	public void andWF(int code) {
		int value = register.getRamContent(code&0x7F)&register.getW();
		setZ(value);
		saveInFOrWBasedOnD(code, value);
	}

	//exclusive or w with f
	public void xorWF(int code) {
		int value =  register.getRamContent(code&0x7F)^register.getW();
		setZ(value);
		saveInFOrWBasedOnD(code, value);
	}
	
	//adds w and f
	public void addWF(int code) {
		int oldW = register.getW();
		int value =  register.getRamContent(code&0x7F)+register.getW();
		setDC(oldW, register.getRamContent(code&0x7F));
		setZ(value);
		setC(value);
		saveInFOrWBasedOnD(code, value&0xFF);
	}
	
	//moves f
	public void movF(int code) {
		int value =  register.getRamContent(code&0x7F);
		setZ(value);
		saveInFOrWBasedOnD(code, value);
	}
	
	//complements f
	public void comF(int code) {
		int value =  (~(register.getRamContent(code&0x7F)))&255;
		setZ(value);
		saveInFOrWBasedOnD(code, value);
	}
	
	//increments f
	public void incF(int code) {
		int value =  register.getRamContent(code&0x7F)+1;
		setZ(value);
		saveInFOrWBasedOnD(code, value);
	}
	
	//decrements f if not 0
	public void decFSZ(int code) {
		int value =  register.getRamContent(code&0x7F)-1;
		if(register.getRamContent(code&0x7F)!=0) {
			setZ(value);
			saveInFOrWBasedOnD(code, value);
		}
		if(value==0) {
			register.setPc(register.getPc()+1);
		}
	}
	
	//rotates f right
	public void rrF(int code) {
		int f = register.getRamContent(code&0x7F);
		int value =  Integer.rotateRight(f, 1);
		value = value&0x007F;
		if (register.getC()==1) {
			value+=0x80;
			register.setC(0);
		}
		if ((f&0x0001)==0x0001) {
			register.setC(1);
		}
		saveInFOrWBasedOnD(code, value);
	}
	
	//rotates f left
	public void rlF(int code) {
		//System.out.println("code: "+code);
		int f = register.getRamContent(code&0x7F);
		int value =  Integer.rotateLeft(f, 1);
		value = value&0x00FF;
		if (register.getC()==1) {
			value++;
			register.setC(0);
		}
		if ((f&0x0080)==0x0080) {
			register.setC(1);
		}
		saveInFOrWBasedOnD(code, value); 
	}
	
	//swaps high and low nibble of f
	public void swapF(int code) {
		int contentF = register.getRamContent(code&0x7F);
		int tempHighNibble = contentF & 0x00F0;
		int tempLowNibble = contentF & 0x000F;
		contentF = Integer.rotateRight(tempHighNibble, 4) + Integer.rotateLeft(tempLowNibble, 4);
		setZ(contentF);
		saveInFOrWBasedOnD(code, contentF);
	}
	
	//increments f if not 0
	public void incFSZ(int code) {
		if(register.getRamContent(code&0x7F)!=0) {
			saveInFOrWBasedOnD(code, register.getRamContent(code&0x7F)+1);
		}

		if(register.getRamContent(code&0x7F)==0) {
			register.setPc(register.getPc()+1);
		}
	}
	
	
	

	
	
	// returns and takes adress from stack
	public void returnCommand() {
		register.setPc(myStack.pop());
		incrementTimer0();
		
	}
	
	
	// sleeps
	public void sleepCommand() {
		// not already impelemented 
		System.out.println("sleep method in operations not already impelmented");
	}
	
	
	
	
	
	
	
	
	
	//Bit oriented file register operations
	//clears one bit in F
	public void bcf(int code) {
		int mask = getMaskForSlectingOneBit(code);
		mask =  ~mask;
		register.setRamContent(code&0x007F, register.getRamContent(code&0x007F)&mask);
	}
	
	
	//sets one bit in F
	public void bsf(int code) {
		int mask = getMaskForSlectingOneBit(code);
		register.setRamContent(code&0x007F, register.getRamContent(code&0x007F)|mask);
	}
	
	
	
	//skip if bit in F is not set
	public void btfsc(int code) {
		int mask = getMaskForSlectingOneBit(code);
		if((register.getRamContent(code&0x007F)&mask)==0) {
			register.setPc(register.getPc()+1);
		}
	}

	
	//skip if bit in F is set
	public void btfss(int code) {
		int mask = getMaskForSlectingOneBit(code);
		if((register.getRamContent(code&0x007F)&mask)>0) {
			register.setPc(register.getPc()+1);
		}
	}
	
	
	
	private int getMaskForSlectingOneBit(int code) {
		int whichBit = code & 0x0380;
		whichBit = Integer.rotateRight(whichBit, 7);
		int shift = 0x0001;
		int mask = shift<<whichBit;
		
		return mask;
	}
	//End Bit oriented file register operations
	
	
	// increments Timer0 
	public void incrementTimer0() {
		if((register.getOption()&0x20) == 0) {
			if((register.getOption()&0x08) == 0) {
				register.setVorteiler(register.getVorteiler()+1);
				if(register.getVorteiler() == Math.pow(2, (register.getOption()&0x07)+1)) {
					incrementOrOverflowTimer0();
					register.setVorteiler(0);
				}
			}else {
				incrementOrOverflowTimer0();
			}
			
		}
		
	}
	
	
	// increments Runtime 
	public void incrementRuntime() {
		register.setRuntime(register.getRuntime()+1);
	}

	
	
	
	// increments timer0 in case of overflow, sets Timer0 back to 0
	private void incrementOrOverflowTimer0() {
		if(register.getTimer0()+1 > 255) {
			register.setTimer0(0);
			register.setIntcon(0x04);
			register.setZ(1);
		}else {
			register.setTimer0(register.getTimer0()+1);
		}
	}
	
	
	
	//decides depending on d, whether to save in W or F
	private void saveInFOrWBasedOnD(int code, int value) {
		int masked = code & 0x0080;
		value = value&255;
		
		if(masked==0) {
			register.setW(value);
		}else {
			register.setRamContent(code&0x7F, value);
			System.out.println("value: "+value+" code: "+(code&0x7F));
		}
	}
	
	
	
	
	
	private void setZ(int result) {
		if (result == 0) {
			register.setZ(1);
		}else {
			register.setZ(0);
		}
	}

	private void setC(int result) {
		if (result > 255) {
			register.setC(1);
			register.setW(result-256);
		}else {
			register.setC(0);
		}
	}


	private void setDC(int value, int oldF) {
		int maskedValue = value & 0x0F;
		int maskedF = oldF & 0x0F;
		if (maskedValue+maskedF > 15) {
			register.setDc(1);
		}else {
			register.setDc(0);
		}
	}
	
	

	private void setDCMinus(int oldF, int oldW) {
		int maskedW = oldW & 0x0F;
		int maskedF = oldF & 0x0F;
		if (maskedF+(((((~maskedW)))+1)&15) > 15) {
			register.setDc(1);
		}else {
			register.setDc(0);
		}
	}
	
}
