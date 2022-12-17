package start.solution;

public class RgbToHex {
    private static StringBuilder sb;

    public static String rgb(int... color) {
        sb = new StringBuilder();
        for (int temp : color) {
            if (temp < 10) {
                intLowerTen(roundInt(temp));
            } else if (temp > 10 && temp < 16) {
                sb.append("0").append(intToStr(temp));
            } else {
                sb.append(intToStr(temp));
            }
        }

        return sb.toString();
    }

    private static void intLowerTen(int color) {
        if (color < 10) {
            sb.append("0").append(color);
        }
    }

    private static String intToStr(int color) {
        return String.format("%X", roundInt(color));
    }

    private static int roundInt(int color) {
        if (color > 255) return 255;
        if (color < 0) return 0;
        return color;
    }
}
