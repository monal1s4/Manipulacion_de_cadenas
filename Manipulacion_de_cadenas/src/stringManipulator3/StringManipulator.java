package stringManipulator3;

public class StringManipulator {
	public String concatSubstring(String str, int startIndex, int endIndex, String secondStr) {
		String substring = str.substring(startIndex, endIndex);
		return substring.concat(secondStr);
	}

	public static void main(String[] args) {
		StringManipulator manipulator = new StringManipulator();
		String word = manipulator.concatSubstring("Hola", 1, 3, "mundo");
		System.out.println(word);
	}
}
