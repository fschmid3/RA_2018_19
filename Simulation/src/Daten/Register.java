package Daten;

public class Register {
	private int fsr = 0; 
	private int w = 0;
	private int status = 0;
	private int instruction = 0;
	private int pc = 0;					//Programm counter
	private int gernalPurpReg = 0;
	private int c = 0; 					//carry-Flag
	private int dc = 0; 				//digit-carry-Flag
	private int z = 0;					//zero-Flag
	private int f = 0; 
	private int portA;					//Port A
	private int portB;					//Port B
	
	

	// getter and setter for all registers
	
	public int getF() {
		return f;
	}
	public void setF(int f) {
		this.f = f;
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
	
	
	
	
	
	
}
