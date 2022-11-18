package start.solution;

import org.junit.jupiter.api.Test;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private static final String[] names = new String[]
            {
                    "Eugene", "Kade", "Johanna", "Andrew", "Maddison", "Marin", "Wayne", "Nick", "Mccullough",
                    "Sandoval", "Hurst", "Gibbs", "Benson", "Holland", "Crane", "Lee", "Wilson", "Clara", "Zhang",
                    "Cummings", "Richmond", "Kadyn", "Stevens", "Laila", "Alan", "Angel", "Yadiel", "Saul", "Jovan",
                    "Faith", "King", "Milagros", "Scott", "Brennan", "Ashanti", "Dayton", "Lindsey", "Gilbert",
                    "Jamya", "Sam", "Madeleine", "Levine", "Luna", "Addison", "Bethany", "Zoie", "Landyn", "Mireya",
                    "Mcgee", "Kirk", "Kirsten", "Kamren", "Vega", "Stephany", "Brooks", "Issac", "Hays", "Jasmin",
                    "Benitez", "Alfonso", "Shepherd", "Jenkins"
            };
    private static final String[] months = new String[]
            {
                    "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"
            };
    private static int randomInt(int min, int max)
    {
        return (int)(Math.random() * (max - min + 1)) + min;
    }
    private static boolean randomBool()
    {
        return randomInt(0, 9999) % 2 == 0 ? true : false;
    }
    private static int randomDay()
    {
        return randomInt(1, 28);
    }
    private static String randomMonth()
    {
        return randomBool() ? months[randomInt(0, 11)] : months[randomInt(0, 11)].substring(0, 3);
    }
    private static int randomYear()
    {
        return randomInt(1930, 2000);
    }
    private static String randomName()
    {
        return names[randomInt(0, names.length-1)];
    }
    private static String randomSex()
    {
        return randomBool() ? "M" : "F";
    }
    @Test
    public void randomTests()
    {
        for (int trial = 1; trial <= 100; trial++)
        {
            String[] data = new String[]{ randomName(),
                    randomBool() ? randomName() : "",
                    randomName(),
                    String.format("%02d-%s-%04d", randomDay(), randomMonth(), randomYear()),
                    randomSex() };
            System.out.format("Trial #%d\ndata = {", trial);
            for (int i = 0; i < data.length; i++)
                System.out.format("\"%s\"%s", data[i], (i < data.length-1 ? ", " : ""));
            System.out.format("}\n");
            assertEquals(solution(data), Solution.driver(data));
        }
    }
    private static int findMonth(final String m)
    {
        for (int i = 0; i < months.length; i++)
            if ( m.equals(months[i].substring(0, 3)) )
                return i + 1;
        return 0;
    }
    private static String solution(final String[] data)
    {
        String[] date = data[3].split("-");
        return String.format("%s%s%02d%s%s%s9AA",
                        (data[2] + "99999").substring(0, 5),
                        date[2].substring(2, 3),
                        findMonth(date[1].substring(0, 3)) + ("F" == data[4] ? 50 : 0),
                        date[0],
                        date[2].substring(3, 4),
                        (data[0].substring(0, 1) + (data[1].length() > 0 ? data[1].substring(0, 1) : "9")).substring(0, 2))
                .toUpperCase();
    }

}