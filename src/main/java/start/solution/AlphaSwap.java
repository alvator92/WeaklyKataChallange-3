package start.solution;

public class AlphaSwap {
    public static String reverseAlphabetInString(String str) {
        if (str.length() == 0) return null;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < str.length(); i += 2) {
            sb.append(str.charAt(i));
            sb.append(str.charAt(i - 1));
        }
        if (str.length() % 2 != 0) sb.append(str.charAt(str.length() - 1));
        return sb.toString();
    }
}
