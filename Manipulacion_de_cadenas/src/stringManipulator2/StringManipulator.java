package stringManipulator2;

public class StringManipulator {
	public int getIndexOrNull(String str, String subString) {
		return str.indexOf(subString);
	}

	public static void main(String[] args) {
		StringManipulator manipulator = new StringManipulator();
		String word = "Hola";
		String subString = "la";
		String notSubString = "mundo";
		int a = manipulator.getIndexOrNull(word, subString);
		int b = manipulator.getIndexOrNull(word, notSubString);
		System.out.println(a);
		System.out.println(b);
	}
}
