package noload.explorer.bo;

import java.math.BigInteger;
import java.util.List;

/**
 * @author Anurag Awasthi
 *
 */
public class Word {
	
	private List<Char> chars;
	
	BigInteger fileId;

	public List<Char> getChars() {
		return chars;
	}

	public void setChars(List<Char> chars) {
		this.chars = chars;
	}
}
