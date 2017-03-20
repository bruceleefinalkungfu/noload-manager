package noload.explorer.bo;

import java.math.BigInteger;
import java.util.List;

/**
 * @author Anurag Awasthi
 *
 */
public class Char {

	private char c;
	
	private BigInteger fileId;
	
	private Word wordReference;

	public Char(char c, BigInteger fileId, Word w) {
		this.c = c;
		this.fileId = fileId;
		wordReference = w;
	}

	public char getC() {
		return c;
	}

	public void setC(char c) {
		this.c = c;
	}
	
	public BigInteger getFileId() {
		return fileId;
	}

	public void setFileId(BigInteger fileId) {
		this.fileId = fileId;
	}
	
	

}
