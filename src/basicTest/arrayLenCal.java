import java.util.Arrays;

public class arrayLenCal {
    public static void main(String[] args) {
        int[] arr = {49, 12, 100, 276, 33};
        int n = 27;
        int[] answer = solution(arr, n);
        System.out.println("answer: " + Arrays.toString(answer));
    }
    /*
        arr의 길이가 홀수라면, 짝수 인덱스에 n을 더해준다.
        arr의 길이가 짝수라면, 홀수 인덱스에 n을 더해준다.
     */
    public static int[] solution(int[] arr, int n) {
        int[] answer = {};
        if (arr.length % 2 == 0) {
            for (int i = 1; i < arr.length; i+=2) {
                arr[i] += n;
            }
        } else {
            for (int i = 0; i < arr.length; i+=2) {
                arr[i] += n;
            }
        }
        return arr;
    }
}


/*      클린코드
    public int[] solution(int[] arr, int n) {
        for(int idx=arr.length%2==0?1:0; idx<arr.length; idx+=2) {
            arr[idx]+=n;
        }

        return arr;
    }
 */