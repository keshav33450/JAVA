public class Panagram {

    public static boolean panagram(String s) {

        for (char ch = 'a'; ch <= 'z'; ch++) {
            boolean res = false;

            for (int i = 0; i < s.length(); i++) {
                if (ch == Character.toLowerCase(s.charAt(i))) {
                    res = true;
                    break;
                }
            }

            if (res == false) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";

        if (panagram(s)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}