import java.util.Arrays;

public class array2 {
    public static void main(String[] args) {
        String myString = "abcdevwxyz";
        String answer = solution(myString);
        System.out.println("answer: " + answer);
    }

    public static String solution(String myString) {
        String answer = "";
        char s = 'i';
        char[] chr = myString.toCharArray();
        for (int i = 0; i < chr.length; i++) {
            if ((int)chr[i] < (int)s){
                chr[i] = 'i';
            }
        }
        for (int i = 0; i < chr.length; i++) {
            answer += chr[i];
        }
        return answer;
    }
}

/*
    public String solution(String myString) {
        return myString.replaceAll("[^l-z]", "l");
    }
 */
