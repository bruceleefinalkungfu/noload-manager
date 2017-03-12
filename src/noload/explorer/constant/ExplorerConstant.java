package noload.explorer.constant;

import java.util.ArrayList;
import java.util.List;

public class ExplorerConstant {
	
	public static final List<String> RESTRICTED_DIRECTORY_STARTS_WITH;
	static{
		RESTRICTED_DIRECTORY_STARTS_WITH = new ArrayList<String>();
	}
	
	/**
	 * In Windows the default total path length must not exceed 260 characters
	 * (drive + :\ + 256 characters of filename + null terminator) 
	 */
	public static final int FILE_NAME_MAXIMUM_SIZE = 260;
	
	/**
	 * How many total number of files it can index
	 */
	public static final String MAXIMUM_INDEXED_FILES_POSSIBLE = "1000000000000";
	
	public static final int TOTAL_POSSIBLE_DIGITS_IN_FILE_NO = MAXIMUM_INDEXED_FILES_POSSIBLE.length();
	
	
	
}
