package start.solution;

public class Solution3 {
    public static String lcs(String x, String y) {
        if(x == null || y == null) return "";
        boolean[] booleans = new boolean[y.length()];

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < x.length(); i++) {
            char char1 = x.charAt(i);
            for (int k = 0; k < y.length(); k++) {
                char char2 = y.charAt(k);
                if (char2 == char1) {
                    booleans[k] = true;
                    break;
                }
            }
        }
        for (int i = 0; i < y.length(); i++) {
            if (booleans[i]) {
                sb.append(y.charAt(i));

            }
        }
        return sb.toString();
    }
}
