import java.util.ArrayList;
import java.util.Arrays;

public class area2 {
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        /*
            arr에 숫자2가 포함된 부분을 반환하는 문제
            숫자2가 없는경우 -1
         */
        System.out.println(Arrays.toString(solution(arr)));
    }

    public static int[] solution(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                list.add(i);
            }
        }
        if (list.size() == 0){
            int[] answer = {-1};
            return answer;
        } else if (list.size() == 1) {
            int[] answer = {2};
            return answer;
        } else {
            int start = list.get(0);
            int end = list.get(list.size()-1);
            int[] answer = new int[end-start+1];
            int k = 0;
            for (int i = start; i <= end; i++) {
                answer[k++] = arr[i];
            }
            return answer;
        }

        // 유저 풀이
        
//        ArrayList<Integer> answer = new ArrayList<Integer>();
//        int start = -1;
//        int end = -1;
//        for(int i = 0; i<arr.length; i++){
//            if(arr[i]==2){
//                start = i;
//                break;
//            }
//        }
//        for(int i = arr.length-1; i>=0; i--){
//            if(arr[i]==2){
//                end = i;
//                break;
//            }
//        }
//        if(start==-1 && end==-1){
//            answer.add(-1);
//        } else{
//            for(int i = start; i<=end; i++){
//                answer.add(arr[i]);
//            }
//        }
//
//        return answer;
//        
    }
}
