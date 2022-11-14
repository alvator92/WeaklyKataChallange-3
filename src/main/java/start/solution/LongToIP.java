package start.solution;

public class LongToIP {

    public static String longToIP(long ip) {
        if (ip == 0) return "0.0.0.0";

        String int32 = Long.toBinaryString(ip);
        String[] strings = new String[4];
        strings[0] = int32.substring(0,8);
        strings[1] = int32.substring(8,16);
        strings[2] = int32.substring(16,24);
        strings[3] = int32.substring(24);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            sb.append(Integer.parseInt(strings[i], 2));
            if (i == strings.length - 1) {
                break;
            }
            sb.append(".");
        }
        return sb.toString();
    }

    public static String longToIPBestPractice(long ip) {
        if (ip == 0) return "0.0.0.0";
        StringBuilder sb = new StringBuilder(15);
        for (int i = 0; i < 4; i++) {
            sb.insert(0, (ip & 0xff));
            if (i < 3) {
                sb.insert(0, '.');
            }
            ip = ip >> 8;
        }
        return sb.toString();
    }
}
