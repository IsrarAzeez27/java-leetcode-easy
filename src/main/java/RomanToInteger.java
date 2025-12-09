import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> Map = new HashMap<>();
        Map.put('I', 1);
        Map.put('V', 5);
        Map.put('X', 10);
        Map.put('L', 50);
        Map.put('C', 100);
        Map.put('D', 500);
        Map.put('M', 1000);
        char chars[] = s.toCharArray();
        int result = 0;
        int i, j;
        for (i = 0, j = 1; j < chars.length; i++, j++) {
            if (Map.get(chars[i]) >= Map.get(chars[j])) {
                result = result + Map.get(chars[i]);
            } else {
                result = result - Map.get(chars[i]);
            }
        }
        result = result + Map.get(chars[i]);
        return result;
    }

    public static void main(String[] args) {
        RomanToInteger sol = new RomanToInteger();

        String roman = "MCMXCIV"; // Example: 1994
        int number = sol.romanToInt(roman);

        System.out.println("Roman: " + roman);
        System.out.println("Integer: " + number);
    }
}

