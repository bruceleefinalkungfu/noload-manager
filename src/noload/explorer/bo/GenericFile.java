package noload.explorer.bo;

import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import noload.explorer.constant.FileConstant;
import noload.explorer.constant.FileNameDelimeters;
import noload.file.FileReaderUtil;
import noload.util.StringUtil;

public abstract class GenericFile {
	
	private File file;
	
	private BigInteger fileId;

	private List<Word> wordsList;
	
	public List<Word> getWordsList() {
		return wordsList;
	}

	public void setWordsList(List<Word> wordsList) {
		this.wordsList = wordsList;
	}


	public GenericFile(File f) throws IOException{
		this.file = f;
		instanceCounter = loadLastInstanceCounter();
		fileId = instanceCounter;
		this.wordsList = getWordsList(f.getAbsolutePath());
	}
	
	public List<Word> getWordsList(String s){
		// ArrayList cuz they aren't gonna be more than 15 or 20
		List<Word> words = new ArrayList<Word>();
		String [] arr = s.split(FileNameDelimeters.getSplitString());
		for(String str : arr){
			words.add(new Word(str, this));
		}
		return words;
	}
	
	public File getFile() {
		return file;
	}

	public void setFile(File f) {
		this.file = f;
	}

	public BigInteger getFileId() {
		return fileId;
	}

	public void setFileId(BigInteger fileId) {
		this.fileId = fileId;
	}
	
	private BigInteger loadLastInstanceCounter()
		throws IOException{
		String str = 
		FileReaderUtil.read(FileConstant.LAST_FILE_ID_FILE_NAME);
		if(isNumeric(str))
			return new BigInteger(str);
		else
			return BigInteger.ZERO;
	}
	private boolean isNumeric(String s){
		return StringUtil.isNumeric(s);
	}
}
