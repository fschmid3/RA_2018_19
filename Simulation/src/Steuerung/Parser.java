package Steuerung;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Parser {


	public String [] readFile(String path) throws IOException{	
		FileReader fReader = null;

		//String path = "testfiles/TPicSim1.LST";

		fReader = new FileReader(path);

		BufferedReader bReader = new BufferedReader(fReader);

		String [] fileContent = new String[256];
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
		
		for(indexContent = 0; (!fileContent[indexContent].contains("start")) && (!fileContent[indexContent].contains("loop")); indexContent++) {}
		indexContent++;
		for(int i= 0;!fileContent[indexContent].contains("ende") && i < aiBuffer.length; indexContent++,i++) {
			
			codeBuffer = fileContent[indexContent].substring(5, 9);
			//System.out.println(codeBuffer);
			if(!codeBuffer.contains(" ")) {
				aiBuffer[i] = Integer.parseInt(codeBuffer,16);
				System.out.println(aiBuffer[i]+" "+i);
			}
		}
		
		return aiBuffer;
	}
	
	
}



