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
		List<Word> words = super.getWordsList();
		// extension is the last word of a file name
		extension = words.get(words.size()-1).toString();
	}
	
	public String getExtension() {
		return extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}
}
