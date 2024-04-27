package basicTest;

import java.util.ArrayList;
import java.util.Arrays;

public class xCount {
    public static void main(String[] args) {
        String myString = "oxooxoxxox";
        int[] answer = solution(myString);
        System.out.println("answer: " + Arrays.toString(answer));
    }

    public static int[] solution(String myString) {
        ArrayList<Integer> list = new ArrayList<>();
        String[] ob = myString.split("x", -1);
        int[] answer = new int[ob.length];
        for (int i = 0; i < ob.length; i++) {
            answer[i] = ob[i].length();
        }
        return answer;
    }
}

/*
public int[] solution(String myString) {
        ArrayList<Integer> list = new ArrayList<>();
        String[] tmp = myString.split("x");
        for (int i = 0; i < tmp.length; i++) {
            list.add(tmp[i].length());
        }
        if(myString.endsWith("x")) {
            list.add(0);
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
 */
