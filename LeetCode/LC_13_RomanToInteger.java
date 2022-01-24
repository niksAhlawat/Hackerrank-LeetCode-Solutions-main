import java.util.HashMap;
import java.util.Map;

public class LC_13_RomanToInteger {
    public static void main(String[] args) {
        String roman = "MCCXXXIV";
        System.out.println(romanToInt("XCIX") +"   " );
        System.out.println("####################");
        System.out.println(romanToIntHashMAp(roman));
    }

    private static int romanToInt(String roman) {
        int result = 0;
        for (int i=0; i<roman.length(); i++){
            int number = conditions(roman.charAt(i));
            if (i + 1 < roman.length()) {
                int temp = conditions(roman.charAt(i + 1));
                
                if (temp > number) {
                    result = result + temp - number;
                    i++;
                }
                else {
                    result = result + number;
                }
            }
            else {
                result = result + number;
            }
        }
        return result;
    }

    private static int conditions(char c){
        int number = 0;
        switch(c){
            case 'I':
            number = 1;
            break;

            case 'V':
            number = 5;
            break;

            case 'X':
            number = 10;
            break;

            case 'L':
            number = 50;
            break;

            case 'C':
            number = 100;
            break;

            case 'D':
            number = 500;
            break;

            case 'M':
            number = 1000;
            break;
           
            default:
            number = 0;
            break;
        }
        return number;
    }

private static final Map<Character,Integer> mapRoman = new HashMap<Character, Integer>() {{
    put('I', 1);
    put('V', 5);
    put('X', 10);
    put('L', 50);
    put('C', 100);
    put('D', 500);
    put('M', 1000);
}};

private static int romanToIntHashMAp(String s){
    int result = 0;
    int n = s.length();
    
    for(int i = 0; i < n; i++) {
        if (i != n - 1 && mapRoman.get(s.charAt(i)) < mapRoman.get(s.charAt(i + 1))) {
            result += mapRoman.get(s.charAt(i + 1)) - mapRoman.get(s.charAt(i));
            i++;
        } 
        else{
            result += mapRoman.get(s.charAt(i));
        }
    }
    return result;
}
}
