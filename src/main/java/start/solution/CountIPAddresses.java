package start.solution;

public class CountIPAddresses {
    public static long ipsBetween(String start, String end) {
        if (start == null || end == null) return 0;
        return strToLong2(end) - strToLong2(start);
    }

    public static long strToLong(String s) {
        String[] strings = s.split("\\.");
        long res = 0;
        for (int i = 0; i < strings.length; i++) {
            int power = 3 - i;
            int ip = Integer.parseInt(strings[i]);
            res += ip * Math.pow(256, power);
        }
        return res;
    }

    public static long strToLong2(String s) {
        long result = 0;
        String[] strings = s.split("\\.");
        for (int i = 3; i >= 0; i--) {
            long ip = Long.parseLong(strings[3 - i]);
            //1. 192 << 24  192 * 2 ^ 24
            //1. 168 << 16  168 * 2 ^ 16
            //1. 1   << 8   1 * 2 ^ 8
            //1. 2   << 0   2 * 2 ^ 0
            //left shifting 24,16,8,0 and bitwise OR

            result |= ip << (i * 8);
        }
        return  result;
    }


}
