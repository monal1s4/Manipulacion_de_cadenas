package stringManipulator1;

public class StringManipulator {
    public int getIndexOrNull(String str, char c) {
        return str.indexOf(c);
    }

    public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulator();
        char letter = 'n';
        int a = manipulator.getIndexOrNull("Coding", letter);
        int b = manipulator.getIndexOrNull("Hola Mundo", letter);
        int c = manipulator.getIndexOrNull("Saludar", letter);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
