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
	String[] filePath;
	
	
	
	

	public Control(GUI_Simulation myGUI) {
		gui=myGUI;
	}


	public void decodeFile(String[] path) throws IOException {
		filePath = path;
		for(int i = 0; (i<filePath.length)&&filePath[i]!=null; i++) {
			//System.out.println(myStr[i]);
		}
		
		int [] ai = myParser.parseCode(filePath);
		for(int i = 0; (i<ai.length)&&ai[i]!=0; i++) {
			//System.out.println(ai[i]);
			myDec.decode(ai[i]);
			gui.setC(register.getC());
			gui.setDC(register.getDc());
			gui.setPC(register.getPc());
			gui.setDC(register.getDc());
			gui.setDC(register.getDc());
			gui.setDC(register.getDc());
		}
	}
	
	

}
