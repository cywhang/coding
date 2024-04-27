package basicTest;

import java.util.ArrayList;
import java.util.Arrays;

public class arraypiece {

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7};
        int[] query = {4,1,2};
        int[] answer = solution(arr, query);
        /*
            query를 순회하면서 홀,짝 인덱스에 대해서 arr를 변화 시킴
            짝수 인덱스 : query[i] 인덱스의 뒷부분을 자른다.
            홀수 인덱스 : query[i] 인덱스의 앞부분을 자른다.
         */
        System.out.println("answer : " + Arrays.toString(answer));
    }
        /*
            0,1,2,3,4,5 초기상태
            0,1,2,3,4   짝수 처리 - 4
            1,2,3,4     홀수 처리 - 1
            1,2,3       짝수 처리 - 2
         */
    public static int[] solution(int[] arr, int[] query) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        for (int i = 0; i < query.length; i++) {
            int k = list.size();
            if (i % 2 == 0) {
                for (int j = query[i]+1; j < k; j++) {
                    list.remove(query[i]+1);
                    System.out.println(i + "번째 : "+list.toString());
                }
            } else {
                for (int j = query[i]-1; j >= 0; j--) {
                    list.remove(j);
                    System.out.println(i + "번째 : "+list.toString());
                }
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
    
    /*   유저 문제 풀이
         실시간으로 변화하지않고 시작값과 끝값을 계산하여 변환

    public int[] solution(int[] arr, int[] query) {
        int start = 0;
        int end = arr.length - 1;
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                end = start + query[i] - 1;
            } else {
                start += query[i];
            }
        }

        return Arrays.copyOfRange(arr, start, end + 2);
    }
     */
}
