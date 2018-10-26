package Steuerung;

import java.io.IOException;

import Daten.Register;
import UserInterface.GUI_Simulation;

public class Control {
	GUI_Simulation gui;
	Register register = new Register();
	Parser myParser = new Parser();
	Befehlsdecoder myDec = new Befehlsdecoder(register);
	// = myParser.readFile("testfiles/TPicSim1.LST");
	String[] fileContent;
	String path = "testfiles/TPicSim1.LST";
	int [] ai = null;
	
	
	
	

	public Control(GUI_Simulation myGUI) {
		gui=myGUI;
	}
	
	public void putFileContentInString() throws IOException {
		fileContent = myParser.readFile(path);
	}
	


	public void decodeNextLine() throws IOException {
		
		for(int i = 0; (i<fileContent.length)&&fileContent[i]!=null; i++) {
			gui.setTableRow(fileContent[i], i);
			//System.out.println(myStr[i]);
		}
		
		for(int i = 0; i<register.getPc(); i++) {
			gui.setTableRow(fileContent[i], i);
			//System.out.println(myStr[i]);
		}
		
		ai = myParser.parseCode(fileContent);
		if((register.getPc()<ai.length)&&ai[register.getPc()]!=0) {
			//System.out.println(ai[register.getPc()]);
			myDec.decode(ai[register.getPc()]);
			register.setPc(register.getPc()+1);
			gui.setC(register.getC());
			gui.setDC(register.getDc());
			gui.setPC(register.getPc());
			gui.setW(register.getW());
			gui.setZ(register.getZ());
		}
	}
	
	
	public void decodeAll() throws IOException {
		while((register.getPc()<ai.length)&&ai[register.getPc()]!=0) {
			decodeNextLine();
		}
	}
	
	
	public void setPath(String pPath) {
		path=pPath;
	}

}
