

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Driver {
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException   {
		String sCurrentLine ;
		Map<String, Integer> processMap = new HashMap<String, Integer>();
		if (args.length > 1){
			System.out.println("Error: Can read only one file");
			System.err.println("Program can handle only one file at a time");
		}
		else{
			BufferedReader br = null;
			try {
				br = new BufferedReader(new FileReader(args[0]));
			} catch (FileNotFoundException e) {
				//
				e.printStackTrace();
			}
			FileProcessor fp = new FileProcessor();
			StringOperations op = new StringOperations();
			while((sCurrentLine = fp.readLineFromFile(args[0], br))!=null){
				processMap = op.processString(sCurrentLine);
			}
			op.findResult(processMap);
		}

	}
}

