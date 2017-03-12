package noload.explorer.bo;

import java.math.BigInteger;
import java.util.List;

/**
 * @author Anurag Awasthi
 *
 */
public class Char {
	
	private char c;
	
	List<BigInteger> fileId;

	public Char(char c, List<BigInteger> fileId) {
		this.c = c;
		this.fileId = fileId;
	}

	public char getC() {
		return c;
	}

	public void setC(char c) {
		this.c = c;
	}
}
