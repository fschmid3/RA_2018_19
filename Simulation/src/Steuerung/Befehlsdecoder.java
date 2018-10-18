package Steuerung;

public class Befehlsdecoder {
	private int maskedCode;
	private int code;
	
	public void decode(int pCode) {
		code = pCode;
		maskedCode = code & 0x3000;
		switch(maskedCode) {
		
		case 0x3000: maskFourBit();
			break;
			
		default:
			break;
		}
		
	}
	
	
	private void maskFourBit() {
		int maskedCode = code & 0x0C00;
		switch(maskedCode) {
		case 0x0C00:
			maskedCode = code & 0x0E00;
			if (maskedCode==0x0E00) {
				//ADDLW
			}else if  (maskedCode==0x0C00){
				//SUBLW
			}else {
				System.out.println("invalid code in maskFourBit");
			}
			break;
		case 0x0800:
			maskedCode = code & 0x0F00;
			if (maskedCode==0x0900) {
				//ANDLW
			}else if  (maskedCode==0x0800){
				//IORLW
			}else if  (maskedCode==0x0A00){
				//XORLW
			}else {
				System.out.println("invalid code in maskFourBit");
			}
			break;
		case 0x0400:
			//RETLW
			break;
		case 0x0000:
			//MOVLW
			break;
			default:
				System.out.println("invalid code in maskFourBit");
				break;
		}
		
	}
}
