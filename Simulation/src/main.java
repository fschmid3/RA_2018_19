import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fReader = null;
		
		String path = "C:/Users/student/git/RA_2018_19/Simulation/testfiles/TPicSim1.LST";
		
		fReader = new FileReader(path);

		char [] acBuffer = new char [9];
		BufferedReader bReader = new BufferedReader(fReader);
		
		String [] fileContent = new String[256];
		String lineBuffer = " ";
		int indexContent;

		for(indexContent = 0; (!lineBuffer.contains("start")) && (!lineBuffer.contains("loop")); indexContent++) {
			
			lineBuffer = bReader.readLine();
			fileContent[indexContent] = lineBuffer;
			;
		}
		
		for(;!lineBuffer.contains("ende"); indexContent++) {
			
			if(bReader.read(acBuffer, 0, 9)!= -1) {
				System.out.println(Arrays.toString(acBuffer));
			}
			lineBuffer = bReader.readLine();

			fileContent[indexContent] = lineBuffer;
		}
	}
}
