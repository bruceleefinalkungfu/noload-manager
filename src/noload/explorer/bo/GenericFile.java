package noload.explorer.bo;

import java.io.File;
import java.math.BigInteger;
import java.util.List;

public abstract class GenericFile {
	
	private static BigInteger instanceCounter
							= BigInteger.ZERO;
	
	private File f;
	
	private BigInteger fileId;

	private List<Word> words;
	
	public GenericFile(File f){
		this.f = f;
		//
		instanceCounter = instanceCounter.add(BigInteger.ONE);
	}
	
	public File getF() {
		return f;
	}

	public void setF(File f) {
		this.f = f;
	}

	public BigInteger getFileId() {
		return fileId;
	}

	public void setFileId(BigInteger fileId) {
		this.fileId = fileId;
	}

	public List<Word> getWords() {
		return words;
	}

	public void setWords(List<Word> words) {
		this.words = words;
	}
	
}
