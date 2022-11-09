package start.solution;

import java.util.*;

public class StringMerger {

    private static Map<Integer, Character> map;

    public static boolean isMerge(String s, String part1, String part2) {
        map = new HashMap<>();
        if (s.length() == 0) {
            return false;
        }
        addToArray(s, part1);
        addToArray(s, part2);
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Integer, Character> iterator : map.entrySet()) {
            sb.append(iterator.getValue());
        }

        if (sb.toString().equals(s)) {
            return true;
        }

        return false;
    }

    private static void addToArray(String s, String part) {
        for (int i = 0; i < part.length(); i++) {
            char ch = part.charAt(i);
            for (int j = 0; j < s.length(); j++) {
                if (ch == s.charAt(j)) {
                    int index = s.indexOf(ch);
                    map.put(index, ch);
                }
            }
        }
    }
}
