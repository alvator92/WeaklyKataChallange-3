package start.solution;

public class Solution2 {
    public static double solution(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null) return 0.0;
        if (arr1.length != arr2.length) return 0;

        double temp2 = 0;
        for (int i = 0; i < arr1.length; i++) {
            double temp1 = Math.pow(Math.abs(arr1[i] - arr2[i]), 2);
            temp2 += temp1;
        }

        return temp2 / arr1.length;
    }
}
