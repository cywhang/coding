import java.util.ArrayList;
import java.util.Arrays;

public class array5 {

    public static void main(String[] args) {
        String[] intStrs = {"0123456789","9876543210","9999999999999"};
        int k = 50000;
        int s = 5;
        int l = 5;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < intStrs.length; i++) {
            char[] idx = intStrs[i].toCharArray();
            String result ="";
            for (int j = s; j < s+l; j++) {
                result += idx[j];
            }
            if (k < Integer.parseInt(result)) {
                list.add(Integer.parseInt(result));
            }
        }
        int[] answer = new int[list.size()];
        int n = 0;
        for (int num : list) {
            answer[n] = num;
            n++;
        }

        System.out.println(Arrays.toString(answer));
    }

    public int[] solution(String[] intStrs, int k, int s, int l) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < intStrs.length; i++) {
            int tmp = Integer.parseInt(intStrs[i].substring(s, s + l));
            if (tmp > k) {
                list.add(tmp);
            }
        }
        int[] answer = new int[list.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
