package noload.util;

public class StringUtil {
	public static boolean isNumeric(String s){
		return s.matches("-?\\d+(\\.\\d+)?");
	}
}
