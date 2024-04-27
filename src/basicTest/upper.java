package basicTest;

import java.util.Arrays;
import java.util.Locale;

public class upper {
    public static void main(String[] args) {
        String my_string = "programmers";
        String alp = "p";
        String answer = solution(my_string, alp);
        System.out.println("answer : " + answer);
    }
    public static String solution(String my_String, String alp) {
        String answer = "";
        char[] chr = my_String.toCharArray();
        char aa = alp.charAt(0);

        for (int i = 0; i < my_String.length(); i++) {
            if (chr[i] == aa) {
                chr[i] = Character.toUpperCase(aa);
            }
        }
        for (int i = 0; i < chr.length; i++) {
            answer += chr[i];
        }

        return answer;
    }
}

/*
public String solution(String my_string, String alp) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            String s = my_string.charAt(i) + "";
            if(s.equals(alp)){
                s = s.toUpperCase();
            }
            answer += s;
        }
        return answer;
    }
 */
