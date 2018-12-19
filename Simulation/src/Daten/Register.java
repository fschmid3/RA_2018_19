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
	private int portA = 0;					//Port A
	private int portB = 0;					//Port B
	private int pcLatch = 0;
	private int indirect = 0;
	private int timer0 = 0;
	private int intcon = 0;
	private int trisA = 0x1F;
	private int trisB = 0xFF;
	private int option = 0xFF;
	private int vorteiler = 0;
	
	
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
				returnValue = portA;
				break;
			case 6:
				returnValue = portB;
				break;
			case 10:
				returnValue = pcLatch;
				break;
				default:
					System.out.println("In register method setRamContent() register setting not already implemented");
			}
		}else {
			returnValue = ram[adress-0x0C];
		}
		return returnValue;
	}
	
	
	public void setRamContent(int adress, int value) {
		if(adress<0x0C) {
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
				portA = value;
				break;
			case 6:
				portB = value;
				break;
			case 10:
				pcLatch = value;
				break;
				default:
					System.out.println("In register method setRamContent() register setting not already implemented");
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
	}
	public int getGernalPurpReg() {
		return gernalPurpReg;
	}
	public void setGernalPurpReg(int gernalPurpReg) {
		this.gernalPurpReg = gernalPurpReg;
	}
	public int getPortA() {
		return portA;
	}
	public void setPortA(int portA) {
		this.portA = portA;
	}
	public int getPortB() {
		return portB;
	}
	public void setPortB(int portB) {
		this.portB = portB;
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
	
	
	
	
	
	
}
