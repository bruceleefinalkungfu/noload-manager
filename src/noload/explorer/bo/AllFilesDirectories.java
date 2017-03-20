package noload.explorer.bo;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class AllFilesDirectories {
	private List<EFile> files;
	private List<EDirectory> directories;
	
	/**
	 * Used LinkedList cuz list can be huge
	 */
	public AllFilesDirectories() {
		files = new LinkedList<EFile>();
		directories = new LinkedList<EDirectory>();
	}
	
	public List<EFile> getFiles() {
		return files;
	}
	public void setFiles(List<EFile> files) {
		this.files = files;
	}
	public List<EDirectory> getDirectories() {
		return directories;
	}
	public void setDirectories(List<EDirectory> directories) {
		this.directories = directories;
	}

	public void addFile(File f){
		EFile eFile = new EFile(f);
		addFile(eFile);
	}

	public void addFile(EFile f){
		files.add(f);
	}
	
}
