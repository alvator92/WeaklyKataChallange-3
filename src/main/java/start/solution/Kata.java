package start.solution;

import java.util.Arrays;
import java.util.List;

public class Kata {
    public static String incrementString(String str) {

        List<String> check = Arrays.asList(new String[] {"0","1","2","3","4","5","6","7","8","9"});

        if(str.length()== 0|| !check.contains(str.substring(str.length()-1))){return str +"1";}

        return str
                .substring(str.length()-1).equals("9")
                ? incrementString(str.substring(0,str.length()-1)) +"0"
                : str.substring(0,str.length()-1)
                    + String.valueOf( Integer.parseInt( str.substring(str.length() - 1) ) +1);
    }
}
