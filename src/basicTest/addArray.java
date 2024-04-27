package basicTest;

import java.util.*;
public class addArray {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 1, 3};
        boolean[] flag = {true, false, true, false, false};
        int[] answer = solution(arr, flag);
        System.out.println("answer: " + Arrays.toString(answer));
    }

    /*
        true  : arr[i] * 2 만큼 arr[i]를 추가
        false : 마지막에서부터 arr[i] 만큼 삭제
     */
    public static int[] solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < flag.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i]*2; j++) {
                    list.add(arr[i]);
                }
            } else {
                int idx = list.size();
                for (int j = 0; j < arr[i]; j++) {
                    list.remove(--idx);
                }
                
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}

