package basicTest;

import java.util.Arrays;

public class split2 {

    public static void main(String[] args) {
        String my_string = " i    love  you";
        String[] answer = solution(my_string);
        System.out.println("answer : " + Arrays.toString(answer));
    }

    public static String[] solution(String my_string) {
        String[] answer = my_string.trim().split("\\s+");


        return answer;
    }
}
