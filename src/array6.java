import java.util.ArrayList;
import java.util.Arrays;

public class array6 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0};
        int[] answer = solution(arr);
        System.out.println("answer: " + Arrays.toString(answer));
    }

    /*
        stk가 빈 배열이라면 arr[i]를 stk에 추가 후 i++
        stk에 원소가 있고, arr[i]와 같다면 stk의 마지막 원소 제거, i++
        stk에 원소가 있고, arr[i]와 다르면 stk의 마지막에 arr[i] 추가, i++
     */

    public static int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int k = 0;
        while (k < arr.length) {
            int size = list.size();
            if (list.isEmpty()) { // 비어있을때
                list.add(arr[k++]);
            } else if (!list.isEmpty() && arr[k] == list.get(size-1)) { // 값이 있을때
                list.remove(size-1);
                k++;
            } else {  // 값이 있을때 2
                list.add(arr[k]);
                k++;
            }
        }

        if (list.isEmpty()) {
            int[] answer = new int[1];
            answer[0] = -1;
            return answer;
        } else {
            int[] answer = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }
            return answer;
        }
    }
}


/*
public int[] solution(int[] arr) {

        Stack<Integer> stack = new Stack<>();

        for (int no : arr) {
            if (!stack.isEmpty() && no == stack.peek()) {
                stack.pop();
            } else {
                stack.push(no);
            }
        }

        return stack.isEmpty() ? new int[] { -1 } : stack.stream().mapToInt(i -> i).toArray();
    }
 */