import java.util.Arrays;

public class randomK {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 1, 1};
        int k = 4;
        int[] answer = solution(arr, k);
        System.out.println("answer: " + Arrays.toString(answer));
    }

    /*
        랜덤한 정수를 담은 arr배열이 있고
        서로다른 정수를 담을 answer배열에 arr원소들을 k개수만큼 담는다
        정수가 k개를 충족하지 못할때는 나머지를 -1로 채운다
     */
    public static int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        arr = Arrays.stream(arr).distinct().toArray();
        if (arr.length < k) {
            for (int i = 0; i < arr.length; i++) {
                answer[i] = arr[i];
                System.out.println("arr[i]: " +arr[i]);
            }
            for (int i = arr.length; i < k; i++) {
                answer[i] = -1;
            }
        } else {
            for (int i = 0; i < k; i++) {
                answer[i] = arr[i];
            }
        }
        return answer;
    }
}

/*
    public int[] solution(int[] arr, int k) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int a : arr)
            if (!arrayList.contains(a))
                arrayList.add(a);

        int idx = 0;
        int[] answer = new int[k];
        for (int i = 0;i < k;i++)
            answer[i] = -1;
        for (int i = 0;i < k && i < arrayList.size();i++)
            answer[i] = arrayList.get(i);
        return answer;
    }
 */