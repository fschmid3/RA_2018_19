package Daten;

public class Register {
	private int fsr = 0; 
	private int pcl = 0;
	private int w = 0;
	private int status = 0x18;
	private int pdBar = 1;
	private int toBar = 1;
	private int rp0 = 0;
	private int rp1 = 0;
	private int irp = 0;
	private int instruction = 0;
	private int pc = 0;					//Programm counter
	private int gernalPurpReg = 0;
	private int c = 0; 					//carry-Flag
	private int dc = 0; 				//digit-carry-Flag
	private int z = 0;					//zero-Flag
	private int f = 0; 
	private int[] portA = new int[8];					//Port A
	private int[] portB = new int[8];					//Port B
	private int pcLatch = 0;
	private int indirect = 0;
	private int timer0 = 0;
	private int intcon = 0;
	private int trisA = 0x1F;
	private int trisB = 0xFF;
	private int option = 0xFF;
	private int vorteiler = 0;
	private int eedata = 0;
	private int eeadr = 0;
	private int eecon1 = 0;
	private int eecon2 = 0;
	private int runtime = 0;
	
	
	private int[] ram = new int[195];
	
	

	// getter and setter for all registers
	
	public int getF() {
		return f;
	}
	public void setF(int f) {
		this.f = f;
	}
	
	public int getRamContent(int adress) {
		int returnValue = 0;
		if(adress<0x0C) {
			System.out.println("rp0: "+rp0);
			if(rp0==0) {
					switch(adress) {
				case 0:
					System.out.println("in reg indirect: "+indirect);
					System.out.println("Inhalt indirekter Adresse: "+ram[indirect]);
					returnValue = ram[indirect];
					break;
				case 1:
					returnValue = timer0;
					break;
				case 2:
					returnValue = pcl;
					break;
				case 3:
					returnValue = getStatus();
					break;
				case 4:
					returnValue = fsr;
					break;
				case 5:
					returnValue = getPortAByValue();
					break;
				case 6:
					returnValue = getPortAByValue();
					break;
				case 8:
					returnValue = eedata;
					break;
				case 9:
					returnValue = eeadr;
					break;
				case 10:
					returnValue = pcLatch;
					break;
				case 11:
					returnValue = intcon;
					break;
					default:
						System.out.println("In register method setRamContent() register setting not already implemented");
				}
			}else {
					switch(adress) {
				case 0:
					System.out.println("in reg indirect: "+indirect);
					System.out.println("Inhalt indirekter Adresse: "+ram[indirect]);
					returnValue = ram[indirect];
					break;
				case 1:
					returnValue = option;
					break;
				case 2:
					returnValue = pcl;
					break;
				case 3:
					returnValue = getStatus();
					break;
				case 4:
					returnValue = fsr;
					break;
				case 5:
					returnValue = trisA;
					break;
				case 6:
					returnValue = trisB;
					break;
				case 8:
					returnValue = eecon1;
					break;
				case 9:
					returnValue = eecon1;
					break;
				case 10:
					returnValue = pcLatch;
					break;
				case 11:
					returnValue = intcon;
					break;
					default:
						System.out.println("In register method setRamContent() register setting not already implemented");
				}
			}
			
		}else {
			returnValue = ram[adress-0x0C];
		}
		return returnValue;
	}
	
	
	public void setRamContent(int adress, int value) {
		if(adress<0x0C) {

			if(rp0==0) {
					switch(adress) {
				case 0:
					ram[indirect] = value-0x0C; 
					break;
				case 1:
					timer0 = value;
					break;
				case 2:
					pcl = value;
					break;
				case 3:
					setStatus(value);
					break;
				case 4:
					fsr = value;
					break;
				case 5:
					setPortAByValue(value);
					break;
				case 6:
					setPortBByValue(value);
					break;
				case 8:
					eedata = value;
					break;
				case 9:
					eeadr = value;
					break;
				case 10:
					pcLatch = value;
					break;
				case 11:
					intcon = value;
					break;
					default:
						System.out.println("In register method setRamContent() register setting not already implemented");
				}
			}else {
				switch(adress) {
				case 0:
					ram[indirect] = value-0x0C; 
					break;
				case 1:
					option = value;
					break;
				case 2:
					pcl = value;
					break;
				case 3:
					setStatus(value);
					break;
				case 4:
					fsr = value;
					break;
				case 5:
					trisA = value;
					break;
				case 6:
					trisB = value;
					break;
				case 8:
					eecon1 = value;
					break;
				case 9:
					eecon2 = value;
					break;
				case 10:
					pcLatch = value;
					break;
				case 11:
					intcon = value;
					break;
					default:
						System.out.println("In register method setRamContent() register setting not already implemented");
				}
			}
			
		}else {
			ram[adress-0x0C] = value;
		}
	}
	
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
		System.out.println(c);
	}
	public int getDc() {
		return dc;
	}
	public void setDc(int dc) {
		this.dc = dc;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	
	
	public int getFsr() {
		return fsr;
	}
	public void setFsr(int fsr) {
		this.fsr = fsr;
	}
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}
	public int getStatus() {
		return c+dc*2+z*4+pdBar*8+toBar*16+rp0*32+rp1*64+irp*128;
	}
	
	public void setStatus(int status) {
		this.status = status;
		this.setC(status&0x01);
		this.setDc((status&0x02)/2);
		this.setZ((status&0x04)/4);
		this.setPdBar((status&0x08)/8);
		this.setToBar((status&0x10)/16);
		this.setRp0((status&0x20)/32);
		this.setRp1((status&0x40)/64);
		this.setIrp((status&0x80)/128);
	}
	
	
	public int[] getPortA() {
		return portA;
	}
	

	public int getPortAByValue() {
		return portA[0]+portA[1]*2+portA[2]*4+portA[3]*8+portA[4]*16+portA[5]*32+portA[6]*64+portA[7]*128;
	}
	

	public int getPortBByValue() {
		return portB[0]+portB[1]*2+portB[2]*4+portB[3]*8+portB[4]*16+portB[5]*32+portB[6]*64+portB[7]*128;
	}
	
	public int[] getPortB() {
		return portB;
	}
	
	
	public void setPortA(int pin7, int pin6, int pin5, int pin4, int pin3, int pin2, int pin1, int pin0) {
		this.portA[7] = pin0;
		this.portA[6] = pin1;
		this.portA[5] = pin2;
		this.portA[4] = pin3;
		this.portA[3] = pin4;
		this.portA[2] = pin5;
		this.portA[1] = pin6;
		this.portA[0] = pin7;
	}
	
	public void setPortAByValue(int number) {
		portA[0] = (number&0x01);
		portA[1] = (number&0x02)/2;
		portA[2] = (number&0x04)/4;
		portA[3] = (number&0x08)/8;
		portA[4] = (number&0x10)/16;
		portA[5] = (number&0x20)/32;
		portA[6] = (number&0x40)/64;
		portA[7] = (number&0x80)/128;
	}
	

	public void setPortBByValue(int number) {
		portB[0] = (number&0x01);
		portB[1] = (number&0x02)/2;
		portB[2] = (number&0x04)/4;
		portB[3] = (number&0x08)/8;
		portB[4] = (number&0x10)/16;
		portB[5] = (number&0x20)/32;
		portB[6] = (number&0x40)/64;
		portB[7] = (number&0x80)/128;
	}
	

	public void setPortB(int pin7, int pin6, int pin5, int pin4, int pin3, int pin2, int pin1, int pin0) {
		this.portA[7] = pin0;
		this.portA[6] = pin1;
		this.portA[5] = pin2;
		this.portA[4] = pin3;
		this.portA[3] = pin4;
		this.portA[2] = pin5;
		this.portA[1] = pin6;
		this.portA[0] = pin7;
	}
	
	public int getInstruction() {
		return instruction;
	}
	public void setInstruction(int instruction) {
		this.instruction = instruction;
	}
	public int getPc() {
		return pc;
	}
	public void setPc(int pc) {
		this.pc = pc;
		pcl = pc&0xFF;
	}
	public int getGernalPurpReg() {
		return gernalPurpReg;
	}
	public void setGernalPurpReg(int gernalPurpReg) {
		this.gernalPurpReg = gernalPurpReg;
	}
	public int getPcl() {
		return pcl;
	}
	public void setPcl(int pcl) {
		this.pcl = pcl;
	}
	public int getPcLatch() {
		return pcLatch;
	}
	public void setPcLatch(int pcLatch) {
		this.pcLatch = pcLatch;
	}
	public int getTimer0() {
		return timer0;
	}
	public void setTimer0(int timer0) {
		this.timer0 = timer0;
	}
	public int getIntcon() {
		return intcon;
	}
	public void setIntcon(int intcon) {
		this.intcon = intcon;
	}
	public int getTrisA() {
		return trisA;
	}
	public void setTrisA(int trisA) {
		this.trisA = trisA;
	}
	public int getTrisB() {
		return trisB;
	}
	public void setTrisB(int trisB) {
		this.trisB = trisB;
	}
	public int getPdBar() {
		return pdBar;
	}
	public void setPdBar(int pdBar) {
		this.pdBar = pdBar;
	}
	public int getToBar() {
		return toBar;
	}
	public void setToBar(int toBar) {
		this.toBar = toBar;
	}
	public int getRp0() {
		return rp0;
	}
	public void setRp0(int rp0) {
		this.rp0 = rp0;
	}
	public int getRp1() {
		return rp1;
	}
	public void setRp1(int rp1) {
		this.rp1 = rp1;
	}
	public int getIrp() {
		return irp;
	}
	public void setIrp(int irp) {
		this.irp = irp;
	}
	public int getOption() {
		return option;
	}
	public void setOption(int option) {
		this.option = option;
	}
	public int getVorteiler() {
		return vorteiler;
	}
	public void setVorteiler(int vorteiler) {
		this.vorteiler = vorteiler;
	}
	
	
	public int getRuntime() {
		return runtime;
	}
	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
	
	
	
	
	
	
}
