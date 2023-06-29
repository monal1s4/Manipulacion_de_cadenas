package stringManipulator;

public class StringManipulator {
	public String trimAndConcat(String str1, String str2) {
		String trimmedStr1 = str1.trim();
		String trimmedStr2 = str2.trim();
		return trimmedStr1.concat(trimmedStr2);
	}

	public static void main(String[] args) {
		StringManipulator manipulator = new StringManipulator();
		String str = manipulator.trimAndConcat("    Hola     ", "     Mundo    ");
		System.out.println(str);
	}
}
