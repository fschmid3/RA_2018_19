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
		
		case 0x0000: 
		break;
			
		default:
			break; 
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
			myOperations.retLW(code); 	//fehlt noch PC mit höchster Stackadresse laden
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
			myOperations.goTo(code);
			myOperations.saveAdressOnStack();
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
}
