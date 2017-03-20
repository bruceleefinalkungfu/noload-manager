package noload.explorer.bo;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Anurag Awasthi
 *
 */
public class Word {
	
	private List<Char> chars;
	
	BigInteger fileId;
	
	public Word(String s, GenericFile g){
		this.chars = getChars(s, g);
		fileId = g.getFileId();
	}

	public BigInteger getFileId() {
		return fileId;
	}

	public void setFileId(BigInteger fileId) {
		this.fileId = fileId;
	}

	public List<Char> getChars() {
		return chars;
	}
	
	public List<Char> getChars(String s, GenericFile g){
		List<Char> chars = new ArrayList<Char>();
		for(char c : s.toCharArray()){
			chars.add(new Char(c, g.getFileId(), this));
		}
		return chars;
	}

	public void setChars(List<Char> chars) {
		this.chars = chars;
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		for(Char c : chars)
			sb.append(c.getC());
		return new String(sb);
	}
}
