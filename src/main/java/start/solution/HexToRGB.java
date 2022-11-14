package start.solution;

public class HexToRGB {

    public static int[] hexStringToRGB(String hex) {
        if(hex == null) {
            return null;
        }

        int[] res = new int[3];
        res[0] = Integer.valueOf(hex.substring(1,3), 16);
        res[1] = Integer.valueOf(hex.substring(3,5), 16);
        res[2] = Integer.valueOf(hex.substring(5), 16);

        return res;
    }
}
