package noload.explorer.bo;

import java.io.File;
import java.math.BigInteger;
import java.util.List;

/**
 * @author Anurag Awasthi
 *
 */
public class EFile extends GenericFile{
	
	private String extension = "";
	
	public EFile(File f){
		super(f);
		String fileName = f.getName();
		extension = fileName.substring(fileName.lastIndexOf('.'));
	}
	
	public String getExtension() {
		return extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}
}
