package noload.explorer.constant;

public enum FileNameDelimeters {
	
	DASH ("-"),
	DOT ("\\."),
	UNDERSCORE("_"),
	COMMA (","),

	// People will search using apostrophe. No need to split the string using it.
	//SINGLE_QUOTE ("'"),
	
	EXCLAMATION_MARK ("!"),
	SPACE (" "),
	LEFT_SQUARE_BRACKET ("\\["),
	RIGHT_SQUARE_BRACKET ("\\]"),
	LEFT_PARENTHESIS_BRACKET ("\\("),
	RIGHT_PARENTHESIS_BRACKET ("\\)"),
	LEFT_BRACES ("\\{"),
	RIGHT_BRACES ("\\}"),
	PLUS("\\+");
	
	private final String value;
	
	FileNameDelimeters(String z){
		value = z;
	}
	public String getValue(){
		return value;
	}
	public static String getSplitString(){
		StringBuilder sb = new StringBuilder();
		for(FileNameDelimeters f : FileNameDelimeters.values()){
			sb.append(f.getValue() + "|");
		}
		sb.deleteCharAt(sb.length()-1);
		return new String(sb);
	}
}
