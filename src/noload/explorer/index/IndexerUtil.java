package noload.explorer.index;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.AbstractMap.SimpleEntry;

import javax.swing.filechooser.FileSystemView;

import noload.explorer.bo.AllFilesDirectories;
import noload.explorer.bo.EFile;
import noload.explorer.exception.ExplorerException;

/**
 * @author Ankit
 *
 */
public class IndexerUtil {
	public static final List<SimpleEntry<String, String>> DRIVE_NAME;
	static{
		DRIVE_NAME = getDriveNames();
	}
	public IndexerUtil() {
	}
	private static List<SimpleEntry<String, String>> getDriveNames(){
		List<SimpleEntry<String, String>> list = new ArrayList<>();
		File[] paths;
		FileSystemView fsv = FileSystemView.getFileSystemView();
		paths = File.listRoots();
		for(File path:paths)
		{
			list.add(new SimpleEntry<>(path.getAbsolutePath(), 
					fsv.getSystemTypeDescription(path)));
		}
		return list;
	}
	/**
	 * @param path
	 * @return : all files recursively from said path
	 * @throws ExplorerException
	 */
	public static AllFilesDirectories getAllFiles(String path) throws ExplorerException{
		AllFilesDirectories allFilesDirectories = new AllFilesDirectories();
		List<EFile> fileList = allFilesDirectories.getFiles();
		File folder = new File(path);
		
		if( ! folder.isDirectory()){
			throw new ExplorerException("This "+path+" is not a directory");
		}
		
		File[] fileArr = folder.listFiles();
		//fileList = Arrays.asList(listOfFiles);
		if(fileArr != null)
		for(File f : fileArr){
			String s = f.getAbsolutePath();
			if(doesStartsWithRestricted(f.getAbsolutePath())) continue;
			//if(!doesStartsWithAllowed(s)) continue;
			if(f.isFile()){
				allFilesDirectories.addFile(f);
			} else if(f.isDirectory()){
				//fileList.addAll(getAllFiles(s));
			}
		}
		return allFilesDirectories;
	}
	
	private static boolean doesStartsWithRestricted(String s){
		return s.startsWith("D:\\zin\\Softwares\\") ||
				s.startsWith("$") ||
				s.startsWith(".") ||
				s.startsWith("D:\\Fit Somewhere\\");
	}
}
