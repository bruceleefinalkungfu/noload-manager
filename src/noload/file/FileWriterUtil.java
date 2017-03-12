package noload.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.List;

/**
 * @author Ankit
 *
 */
public class FileWriterUtil {

	/**
	 * @param o
	 * @param f
	 * @param append
	 * @throws IOException
	 */
	public static void write(Object o, File f, boolean append) throws IOException{
		FileOutputStream fos = new FileOutputStream(f, append);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(o);
		oos.close();
	}
	/**
	 * @param list
	 * @param f
	 * @param append
	 * @throws IOException
	 */
	public static void write(List<File> list, File f, boolean append) 
			throws IOException{
		String str = "";
		for(File file : list){
			System.out.println(file.getAbsolutePath());
			str += file.getName()+":"+file.getAbsolutePath()+"\n";
		}
		write(str, f, append);		
	}

	/**
	 * @param str
	 * @param f
	 * @param append
	 * @throws IOException
	 */
	public static void write(String str, File f, boolean append) throws IOException{
		try(  PrintWriter out = new PrintWriter(new FileOutputStream(f,append)) ){
		    out.println(str);
		}
	}
	/**
	 * @param str
	 * @param f
	 * @throws IOException
	 */
	public static void write(String str, File f) throws IOException{
		try(  PrintWriter out = new PrintWriter(new FileOutputStream(f)) ){
		    out.println(str);
		}
	}
}
