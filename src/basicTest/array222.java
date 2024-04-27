import java.util.Arrays;

public class array222 {
    public static void main(String[] args) {
        int[] arr = {58, 172, 746, 89};
        int[] answer = solution(arr);
        System.out.println("answer: " + Arrays.toString(answer));
    }
    /*
        arr 배열의 길이가 2의 거듭제곱이 되도록 만드는 문제
        길이가 2의 거듭제곱이 되도록 나머지 자리에 0을 채우는데
        최소한의 0을 추가하여 거듭제곱으로 만드려고한다.
     */
    public static int[] solution(int[] arr) {
        int ss = arr.length;
        int l = 1;
        while (ss > l) {
            l *= 2;
        }
        int[] answer = new int[l];
        for (int i = 0; i < ss; i++) {
            answer[i] = arr[i];
        }
        return answer;
    }
}

/*  자바 배열의 빈 요소를 이용하여 copyOf사용
    public int[] solution(int[] arr) {
        int length = 1;

        while (length < arr.length) {
            length *= 2;
        }

        return Arrays.copyOf(arr, length);
    }
 */
