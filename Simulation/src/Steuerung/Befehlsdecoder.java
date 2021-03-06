package Steuerung;

import Daten.Register;

public class Befehlsdecoder {
	private int maskedCode;
	private int code;
	private Operations myOperations;
	
	
	public Befehlsdecoder(Register pRegister) {
		myOperations = new Operations(pRegister);
	}
	
	//decides of which sort the statement is -> how many bits encode statement
	//and calls relevant methods
	public void decode(int pCode) {
		code = pCode;
		maskedCode = code & 0x3000;
		switch(maskedCode) {
		
		case 0x3000: maskFourBit();		//0x3000 -> four bit statement
			break;
			
		case 0x2000: maskOneBit();		//0x2000 -> one bit statement
		break;

		case 0x1000: maskTwoBit();
		break;
		
		case 0x0000: maskFourOrFiveBit();
		break;

		default:
			break; 
		}
		if(pCode!=0) {
			myOperations.incrementTimer0();
			myOperations.incrementRuntime();
		}
	}
	

	//decides, which fourBit coded statement and calls relevant methods
	private void maskFourBit() {
		int maskedCode = code & 0x0C00;
		switch(maskedCode) {
		case 0x0C00:
			maskedCode = code & 0x0E00;
			if (maskedCode==0x0E00) {
				//ADDLW
				myOperations.addLW(code);
			}else if  (maskedCode==0x0C00){
				//SUBLW
				myOperations.subLW(code);
			}else {
				System.out.println("invalid code in maskFourBit");
			}
			break;
		case 0x0800:
			maskedCode = code & 0x0F00;
			if (maskedCode==0x0900) {
				//ANDLW
				myOperations.andLW(code);
			}else if  (maskedCode==0x0800){
				//IORLW
				myOperations.iorLW(code);
			}else if  (maskedCode==0x0A00){
				//XORLW
				myOperations.xorLW(code);
			}else {
				System.out.println("invalid code in maskFourBit");
			}
			break;
		case 0x0400:
			//RETLW
			myOperations.retLW(code); 	//fehlt noch PC mit h�chster Stackadresse laden
			break;
		case 0x0000:
			//MOVLW
			myOperations.movLW(code);
			break;
			default:
				System.out.println("invalid code in maskFourBit");
				break;
		}
		
	}
	
	// decides, whether code is for CALL or GOTO statement and calls relevant methods
	private void maskOneBit() {
		int maskedCode = code & 0x0800;
		switch(maskedCode) {
		case 0x0000:
			//CALL
			myOperations.saveAdressOnStack();
			myOperations.goTo(code);
			break;
		case 0x0800:
			//GOTO
			myOperations.goTo(code);
			break;
			default:
				System.out.println("invalid code in maskOneBit");
				break;
		}
		
	}
	
	
	// decides, whether code is for CALL or GOTO statement and calls relevant methods
	private void maskFourOrFiveBit() {
		int maskedCode = code & 0x0F00;
		switch(maskedCode) {
		case 0x0000:
			//decide which twelfe bit statement
			maskAllBitsCode();
			
			break;
		case 0x0100:
			if((code&0x0080)==0x0000) {
				//CLRF
				myOperations.clrW();
			}else {
				//CLRW
				myOperations.clrF(code);
			}
			break;
		case 0x0200:
			//SUBWF
			myOperations.subWF(code);
			break;
		case 0x0300:
			//DECF
			myOperations.decF(code);
			break;
		case 0x0400:
			//IORWF
			myOperations.iorWF(code);
			
			break;
		case 0x0500:
			//ANDWF
			myOperations.andWF(code);
			break;
		case 0x0600:
			//XORWF
			myOperations.xorWF(code);
			break;
		case 0x0700:
			//ADDWF
			myOperations.addWF(code);
			break;
		case 0x0800:
			//MOVF
			myOperations.movF(code);
			break;
		case 0x0900:
			//COMF
			myOperations.comF(code);
			break;
		case 0x0A00:
			//INCF
			myOperations.incF(code);
			break;
		case 0x0B00:
			//DECFSZ
			myOperations.decFSZ(code);
			break;
		case 0x0C00:
			//RRF
			myOperations.rrF(code);
			break;
		case 0x0D00:
			//RLF
			myOperations.rlF(code);
			break;
		case 0x0E00:
			//SWAPF
			myOperations.swapF(code);
			break;
		case 0x0F00:
			//INCFSZ
			myOperations.incFSZ(code);
			break;
			default:
				System.out.println("invalid code in maskForOrFiveBit");
				break;
		}
		
	}
	
	
	private void maskAllBitsCode() {
		int maskedCode = code & 0x0080;
		if(maskedCode == 0x0080) {
			//MOVWF
			myOperations.movWF(code);
		}else {
			
			maskedCode = code & 0x000F;
			if(maskedCode==0x0000) {
				//NOP
			}else {
				maskedCode = code & 0x007F;
				switch(maskedCode) {
				case 0x0008:
					//Return
					myOperations.returnCommand();
					break;
				case 0x0009:
					//RETFIE
					System.out.println("Gibt doch Interrupts! In Befehlsdecoder maskAllBitsCode()");
					break;
				case 0x0063:
					//SLEEP
					myOperations.sleepCommand();
					break;
				case 0x0064:
					//CLRWDT
					System.out.println("Gibt doch CLRWDT! In Befehlsdecoder maskAllBitsCode()");
					break;
					default:
						System.out.println("invalid code in maskForOrFiveBit");
						break;
				}
			}
		}
	}
	
	
	
	// decides, which Bit-Oriented Operation is to be called
	private void maskTwoBit() {
		int maskedCode = code & 0x0C00;
		switch(maskedCode) {
		case 0x0000:
			//BCF
			myOperations.bcf(code);
			break;
		case 0x0400:
			//BSF
			myOperations.bsf(code);
			break;
		case 0x0800:
			//BTFSC
			myOperations.btfsc(code);
			break;
		case 0x0C00:
			//BTFSS
			myOperations.btfss(code);
			break;
			default:
				System.out.println("invalid code in maskTwoBit");
				break;
		}
		
	}
	
}
