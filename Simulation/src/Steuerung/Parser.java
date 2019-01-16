package Steuerung;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Parser {
	private int startRow;
	private int endRow;

	public String [] readFile(String path) throws IOException{	
		FileReader fReader = null;

		//String path = "testfiles/TPicSim1.LST";

		fReader = new FileReader(path);

		BufferedReader bReader = new BufferedReader(fReader);

		String [] fileContent = new String[350];
		String lineBuffer = " ";

		lineBuffer = bReader.readLine();

		for (int indexContent = 0; lineBuffer != null; indexContent++) {
			fileContent[indexContent] = lineBuffer;
			lineBuffer = bReader.readLine();
		}
		bReader.close();
		
		return fileContent;
	}

	public int[] parseCode(String[] fileContent) throws IOException{	

		//String path = "testfiles/TPicSim1.LST";

		int [] aiBuffer = new int [256];
		String codeBuffer = null;
		int indexContent;
		int length = 0;
		boolean isFilled=true;
		for (int i = 0; i<fileContent.length && isFilled==true; i++) {
			if(fileContent[i]==null) {
				isFilled=false;
				length = i-1;
			}
		}
		
		for(indexContent = 0; (!fileContent[indexContent].substring(0, 4).contains("0000")); indexContent++) {}
		startRow=indexContent;
		//for(int i= 0;!fileContent[indexContent].contains("ende") && i < aiBuffer.length; indexContent++,i++) {
		//for(int i= 0;(indexContent<fileContent.length) && i < aiBuffer.length; indexContent++,i++) {
		for(int i= 0; indexContent < length && i < aiBuffer.length; indexContent++,i++) {	
		//System.out.println(fileContent.length + " substring "+ fileContent[indexContent].substring(20, 25));
			codeBuffer = fileContent[indexContent].substring(5, 9);
			//System.out.println("_"+codeBuffer+"_"+i);
			if(!codeBuffer.contains("    ")) {
				aiBuffer[i] = Integer.parseInt(codeBuffer,16);
				//System.out.println(aiBuffer[i]+" "+i);
			}else {
				i--;
			}
		}
		endRow = indexContent-1;
		
		return aiBuffer;
	}
	
	public int getStartRow() {
		return startRow;
	}
	
	public int getEndRow() {
		return endRow;
	}
	
	
}



