public class compareArray {
    public static void main(String[] args) {
        int[] arr1 = {49, 13};
        int[] arr2 = {70, 11, 2};
        int answer = solution(arr1, arr2);
        System.out.println("answer: " + answer);
    }

    /*

     */
    public static int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        if (arr1.length < arr2.length || arr1.length > arr2.length) {
            answer = arr1.length < arr2.length ? -1 : 1;
        } else {
            int a1 = 0;
            int b1 = 0;
            for (int n : arr1) {
                a1 += n;
            }
            for (int n : arr2) {
                b1 += n;
            }
            answer = Integer.compare(a1, b1);
            //answer = a1 == b1 ? 0 : a1 < b1 ? -1 : 1;
        }

        return answer;
    }
}

/*      배열의 길이가 같다는 점을 이용해서 for문을 같이 돌렸다.
    public int solution(int[] arr1, int[] arr2) {
        if (arr1.length < arr2.length) return -1;
        else if (arr1.length > arr2.length) return 1;
        int arr1Sum = 0, arr2Sum = 0;
        for (int i = 0;i < arr1.length;i++) {
            arr1Sum += arr1[i];
            arr2Sum += arr2[i];
        }
        return arr1Sum == arr2Sum ? 0 : (arr1Sum > arr2Sum ? 1 : -1);
    }
 */
