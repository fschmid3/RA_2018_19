package Daten;

public class Register {
	private int fsr = 0; 
	private int w = 0;
	private int status = 0;
	private int instruction = 0;
	private int pc = 0;
	private int gernalPurpReg = 0;
	
	
	// getter and setter for all registers
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
	
	
	
	
	
	
}
