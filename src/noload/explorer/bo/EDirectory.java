package noload.explorer.bo;

import java.io.File;
import java.math.BigInteger;
import java.util.List;

public class EDirectory extends GenericFile{
	/**
	 * Reference to the list of files, directories this directory contains 
	 */
	List<AllFilesDirectories> allFilesDirectories;
	
	public EDirectory(File f){
		super(f);
	}

	public List<AllFilesDirectories> getAllFilesDirectories() {
		return allFilesDirectories;
	}

	public void setAllFilesDirectories(List<AllFilesDirectories> allFilesDirectories) {
		this.allFilesDirectories = allFilesDirectories;
	}
	
}
