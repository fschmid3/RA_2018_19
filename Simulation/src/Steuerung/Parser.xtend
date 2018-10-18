package Steuerung

import java.io.BufferedReader
import java.io.FileReader
import java.io.IOException
import java.util.Arrays

class Parser {
	def String[] readFile(String path) throws IOException {
		var FileReader fReader = null
		// String path = "testfiles/TPicSim1.LST";
		fReader = new FileReader(path)
		var char[] acBuffer = newCharArrayOfSize(9)
		var BufferedReader bReader = new BufferedReader(fReader)
		var String[] fileContent = newArrayOfSize(256)
		var String lineBuffer = " "
		lineBuffer = bReader.readLine()
		for (var int indexContent = 0; lineBuffer !== null; indexContent++) {
			{
				val _wrVal_fileContent = fileContent
				val _wrIndx_fileContent = indexContent
				_wrVal_fileContent.set(_wrIndx_fileContent, lineBuffer)
			}
			lineBuffer = bReader.readLine()
		}
		return fileContent
	}

	def int[] parseCode(String[] fileContent) throws IOException {
		// String path = "testfiles/TPicSim1.LST";
		var int[] aiBuffer = newIntArrayOfSize(50)
		var String codeBuffer = null
		var int indexContent
		var int i = 0
		for (indexContent = 0; (!{
			val _rdIndx_fileContent = indexContent
			fileContent.get(_rdIndx_fileContent)
		}.contains("start")) && (!{
			val _rdIndx_fileContent = indexContent
			fileContent.get(_rdIndx_fileContent)
		}.contains("loop")); indexContent++) {
		}
		indexContent++
		for (; !{
			val _rdIndx_fileContent = indexContent
			fileContent.get(_rdIndx_fileContent)
		}.contains("ende"); indexContent++) {
			codeBuffer = {
				val _rdIndx_fileContent = indexContent
				fileContent.get(_rdIndx_fileContent)
			}.substring(5, 10)
			if (!codeBuffer.contains(" ")) {
				{
					val _wrVal_aiBuffer = aiBuffer
					val _wrIndx_aiBuffer = i
					_wrVal_aiBuffer.set(_wrIndx_aiBuffer, Integer::parseInt(codeBuffer, 16))
				}
			}
		}
		return aiBuffer
	}
}
