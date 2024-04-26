import java.util.ArrayList;
import java.util.Arrays;

public class arrayDelete {
    public static void main(String[] args) {
        int[] arr = {293, 1000, 395, 678, 94};
        int[] delete_list = {94, 777, 104, 1000, 1, 12};
        int[] answer = solution(arr, delete_list);
        System.out.println("answer : " + Arrays.toString(answer));
    }
    /*
        arr에 delete_list를 적용시키고 남은 원소들을 순서 유지한 채로 반환
     */
    public static int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        ArrayList<Integer> rlist = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < delete_list.length; j++) {
                if (arr[i] == delete_list[j]) {
                    rlist.add(arr[i]);
                }
            }
        }
        int[] answer = new int[arr.length - rlist.size()];
        int k = 0;
        for (int j = 0; j < rlist.size(); j++) {
            list.remove(rlist.get(j));
        }
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}

/*
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();
        for(int n : arr) {
            list.add(n);
        }
        for(int n: delete_list) {
            list.remove((Integer)n);
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }

 */