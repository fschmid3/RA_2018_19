package Daten;

public class Register {
	private int fsr = 0; 
	private int pcl = 0;
	private int w = 0;
	private int status = 0;
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
	
	private int[] ram = new int[70];
	
	

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
				returnValue = ram[indirect];
				System.out.println("Indirect adressing!");
				break;
			case 2:
				returnValue = pcl;
				break;
			case 3:
				returnValue = status;
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
				indirect = value;
				break;
			case 2:
				pcl = value;
				break;
			case 3:
				status = value;
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
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
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
	
	
	
	
	
	
}
