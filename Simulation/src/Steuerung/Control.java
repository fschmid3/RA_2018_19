package Steuerung;

import java.io.IOException;

import Daten.Register;
import UserInterface.GUI_Simulation;

public class Control{
	GUI_Simulation gui;
	Register register = new Register();
	Parser myParser;
	Befehlsdecoder myDec = new Befehlsdecoder(register);
	String[] fileContent;
	String path;
	int [] ai = null;

	public Control(GUI_Simulation myGUI) {
		gui=myGUI;
	}

	//calls all methods that are required for first initialition after file has been selected
	public void fileOpened(String pPath) throws IOException {
		myParser = new Parser();
		setPath(pPath);
		putFileContentInString();
		setFileInTable();
		gui.setPortA(register.getPortA());
		gui.setPortB(register.getPortB());
	}



	//decodes ONE line -> next one, of assembler code
	public boolean decodeNextLine() throws IOException {
		if(!(myParser == null)) {
			ai = myParser.parseCode(fileContent);
			if((register.getPc()<ai.length) && ( register.getPc() < myParser.getEndRow())) {
				System.out.println("hier "+ register.getPc() + " & "+myParser.getStartRow());
				
				int pc = register.getPc();
				
				myDec.decode(ai[pc]);
				register.setPc(register.getPc()+1);
				updateGUI();

				System.out.println("wert1: "+register.getRamContent(0x0C));
				System.out.println("wert2: "+register.getRamContent(0x0D));

				return true;
			}
		}
		return false;
	}


	private void updateGUI() {
		register.setPortA(gui.getPortA());
		register.setPortB(gui.getPortB());
		gui.isBreakPointSet(myParser.getStartRow() + register.getPc());
		gui.setSelection(myParser.getStartRow(),myParser.getEndRow(), register.getPc());
		gui.setRuntime(register.getRuntime());
		gui.setC(register.getC());
		gui.setDC(register.getDc());
		gui.setPC(register.getPc());
		gui.setW(register.getW());
		gui.setZ(register.getZ());
		gui.setFSR(register.getFsr());
		gui.setPCL(register.getPcl());
		gui.setPCLATCH(register.getPcLatch());
		gui.setPD(register.getPdBar());		
		gui.setTO(register.getToBar());		
		gui.setRP0(register.getRp0());		
		gui.setRP1(register.getRp1());		
		gui.setIRP(register.getIrp());		
		gui.setOption(register.getOption());
		gui.setINTCON(register.getIntcon());
		gui.setTimer0(register.getTimer0());

	}


	//decodes ALL lines of assembler code
	public void decodeAll() throws IOException {
		while((register.getPc()<ai.length) ) {
			decodeNextLine();
		}
	}

	//sets path of new selected file
	private void setPath(String pPath) {
		path=pPath;
	}


	//saves filecontent in String
	private void putFileContentInString() throws IOException {
		fileContent = myParser.readFile(path);
	}

	//puts filecode in table on gui
	private void setFileInTable() {
		for(int i = 0; (i<fileContent.length)&&fileContent[i]!=null; i++) {
			gui.setTableRow(fileContent[i], i);
			//System.out.println(myStr[i]);
		}

		for(int i = 0; i<register.getPc(); i++) {
			gui.setTableRow(fileContent[i], i);
			//System.out.println(myStr[i]);
		}

	}
}
