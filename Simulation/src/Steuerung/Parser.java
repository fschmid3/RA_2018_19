package Steuerung;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Parser {


	public String [] readFile(String path) throws IOException{	
		FileReader fReader = null;

		//String path = "testfiles/TPicSim1.LST";

		fReader = new FileReader(path);

		char [] acBuffer = new char [9];
		BufferedReader bReader = new BufferedReader(fReader);

		String [] fileContent = new String[256];
		String lineBuffer = " ";

		lineBuffer = bReader.readLine();

		for (int indexContent = 0; lineBuffer != null; indexContent++) {
			fileContent[indexContent] = lineBuffer;
			lineBuffer = bReader.readLine();
		}
		return fileContent;
	}

	public int[] parseCode(String[] fileContent) throws IOException{	

		//String path = "testfiles/TPicSim1.LST";

		int [] aiBuffer = new int [50];
		String codeBuffer = null;
		int indexContent;
		int i= 0;
		for(indexContent = 0; (!fileContent[indexContent].contains("start")) && (!fileContent[indexContent].contains("loop")); indexContent++) {}
		indexContent++;
		for(;!fileContent[indexContent].contains("ende"); indexContent++) {
			
			codeBuffer= fileContent[indexContent].substring(5, 10);
			if(!codeBuffer.contains(" ")) {
				aiBuffer[i] = Integer.parseInt(codeBuffer,16);
			}
		}
		return aiBuffer;
	}
}



