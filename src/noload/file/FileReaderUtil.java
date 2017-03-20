package noload.file;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Ankit
 *
 */
public class FileReaderUtil {
	/**
	 * return a complete String of the file
	 * @param filename : String
	 * @return
	 * @throws IOException
	 */
	public static String read(String filename) throws IOException{
		if(new File(filename).exists())
			return read(new File(filename));
		throw new IOException("File '"+filename+"' not found");
	}
	
	/**
	 * @param filename : File
	 * @return
	 * @throws IOException
	 */
	public static String read(File filename) throws IOException{
		return new Scanner(filename).useDelimiter("\\Z").next();
	}
}
