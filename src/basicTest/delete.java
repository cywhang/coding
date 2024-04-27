package basicTest;

import java.util.Arrays;
import java.util.Collections;

public class delete {
    /*
    public static void main(String[] args) {
        String my_string = "apporoograpemmemprs";
        int[] indices = {1, 16, 6, 15, 0, 10, 11, 3};
        int k = indices.length;
        int[] delete = new int[k];
        Arrays.sort(indices);
        String answer = "";
        StringBuilder sb = new StringBuilder();
        sb.append(my_string);
        for (int i = 0; i < indices.length; i++) {
            delete[i] = indices[k-1];
            k--;
        }
        for (int i = 0; i < indices.length; i++) {
            sb.deleteCharAt(delete[i]);
        }

        answer = sb.toString();
        System.out.println("answer : " + answer);
    }

     */

    public static void main(String[] args) {
        String my_string = "apporoograpemmemprs";
        int[] indices = {1, 16, 6, 15, 0, 10, 11, 3};
        String answer = "";
        String[] tmp = my_string.split("");

        for (int i = 0; i < indices.length; i++) {
            tmp[indices[i]] = "";
        }

        for (String x : tmp) {
            answer += x;
        }
        System.out.println(answer);
    }


}
