import java.io.IOException;

import Steuerung.Parser;

public class main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Parser myParser = new Parser();
		String[] myStr = myParser.readFile("testfiles/TPicSim1.LST");
		
		for(int i = 0; (i<myStr.length)&&myStr[i]!=null; i++) {
			//System.out.println(myStr[i]);
		}
		
		int [] ai = myParser.parseCode(myStr);
		for(int i = 0; (i<ai.length)&&ai[i]!=0; i++) {
			//System.out.println(ai[i]);
		}
		
	}
}
