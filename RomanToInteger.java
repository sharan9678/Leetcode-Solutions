import java.util.HashMap;

class RomanToInteger {
    public static int romanToInteger(String s) {
        HashMap<Character, Integer> value = new HashMap<>();
        value.put('I', 1);
        value.put('V', 5);
        value.put('X', 10);
        value.put('L', 50);
        value.put('C', 100);
        value.put('D', 500);
        value.put('M', 1000);
        
        int number=0;
        for (int i=0; i<s.length(); i++) {
            if (i+1 == s.length() || value.get(s.charAt(i)) >= value.get(s.charAt(i + 1))) {
                number += value.get(s.charAt(i));
            } else {
                number -= value.get(s.charAt(i));
            }
        }
        return number;
    }
}