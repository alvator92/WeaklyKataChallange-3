package start.solution;

import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;
import java.util.Locale;

public class Solution {
    public static String driver(final String[] data) {
        StringBuilder sb = new StringBuilder();
        sb.append(data[2].length() >= 5 ? data[2].substring(0,5).toUpperCase() : data[2].toUpperCase());
        for (int i = 0; i < 5 - data[2].length(); i++) {
            sb.append(9);
        }
        sb.append(data[3].substring(data[3].length() - 2, data[3].length() - 1));
        String[] strings = data[3].split("-");
        int temp = monthNum(strings[1]);
        sb.append(data[4].equals("M") ? (temp > 9 ? temp : "0" + temp)  : temp + 50);
        sb.append(strings[0]);
        sb.append(strings[2].substring(3));
        sb.append(data[0].charAt(0));
        sb.append(!data[1].isEmpty() ? data[1].substring(0,1) : "9");
        sb.append("9");
        sb.append("AA");
        return sb.toString(); // Code here

    }
    private static int monthNum(String dateInString) {
        String pattern;
        if (dateInString.length() < 4) {
            pattern = "MMM";
        } else {
            pattern = "MMMM";
        }
        DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern(pattern).withLocale(Locale.ENGLISH);
        TemporalAccessor temporalAccessor = dtFormatter.parse(dateInString);
        return temporalAccessor.get(ChronoField.MONTH_OF_YEAR);
    }
}
