

import java.io.BufferedReader;
import java.io.IOException;

public class FileProcessor {
	/**
	 * @param args
	 * @param reader
	 * @return
	 * @throws IOException
	 */
	@SuppressWarnings("resource")
	public String readLineFromFile(String args, BufferedReader reader)
			throws IOException {
		String line = reader.readLine();
		if (line != null) {
			return line;
		}
		return null;
	}
}

