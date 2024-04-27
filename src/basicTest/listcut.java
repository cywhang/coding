package basicTest;

import java.util.ArrayList;
import java.util.Arrays;

public class listcut {

    public static void main(String[] args) {

        int n = 2;
        int[] slicer = {1, 5, 2};
        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        /*
            n = 1 : 0번 인덱스부터 b번 인덱스까지
            n = 2 : a번 인덱스부터 마지막까지
            n = 3 : a번 인덱스부터 b번 인덱스까지
            n = 4 : a번 인덱스부터 b번 인덱스까지 c간격으로
         */
        ArrayList<Integer> list = new ArrayList<>();
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];

        if (n == 1) {
            for (int i = 0; i <= b; i++) {
                list.add(num_list[i]);
            }
        } else if (n == 2) {
            for (int i = a; i < num_list.length; i++) {
                list.add(num_list[i]);
            }
        } else if (n == 3) {
            for (int i = a; i <= b; i++) {
                list.add(num_list[i]);
            }
        } else {
            for (int i = a; i <= b; i+=c) {
                list.add(num_list[i]);
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }


        System.out.println("answer : " + Arrays.toString(answer));
    }

}

/*
public int[] solution(int n, int[] slicer, int[] num_list) {
        int start = n == 1 ? 0 : slicer[0];
        int end = n == 2 ? num_list.length - 1 : slicer[1];
        int step = n == 4 ? slicer[2] : 1;
        int[] answer = new int[(end - start + step) / step];
        for (int i = start, j = 0; i <= end; i += step) {
            answer[j++] = num_list[i];
        }
        return answer;
    }
 */