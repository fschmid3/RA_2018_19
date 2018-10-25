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
	
	
	
	

	public Control(GUI_Simulation myGUI) {
		gui=myGUI;
	}


	public void decodeFile(String path) throws IOException {
		fileContent = myParser.readFile(path);
		for(int i = 0; (i<fileContent.length)&&fileContent[i]!=null; i++) {
			//System.out.println(myStr[i]);
		}
		
		int [] ai = myParser.parseCode(fileContent);
		for(int i = 0; (i<ai.length)&&ai[i]!=0; i++) {
			//System.out.println(ai[i]);
			myDec.decode(ai[i]);
			register.setPc(register.getPc()+1);
			gui.setC(register.getC());
			gui.setDC(register.getDc());
			gui.setPC(register.getPc());
			gui.setW(register.getW());
			gui.setZ(register.getZ());
		}
	}
	
	

}
