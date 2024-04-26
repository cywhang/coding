import java.util.*;

public class rank {
    public static void main(String[] args) {
        int[] rank = {3, 7, 2, 5, 4, 6, 1};
        boolean[] attendance = {false, true, true, true, true, false, false};
        int answer = solution(rank, attendance);
        System.out.println("answer: " + answer);
    }

    /*
        3명을 선발하는 전국대회 등수인 rank[]
        전국대회에 참여하지 못하는 attendance[]
        참여하는 학생중 등수가 높은 3명 선발
        1등부터 순서대로 a,b,c 라고 할때
        a,b,c는 인덱스 위치
        answer  =  10000 * a  +  100 * b  +  c
     */
    public static int solution(int[] rank, boolean[] attendance) {
        ArrayList<Integer> list = new ArrayList<>();
        // 대회에 참전한 학생들을 list에 담아줌
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]){
                list.add(rank[i]);
            }
        }
        // 학생들의 등수를 오름차순으로 정렬 (1등, 2등, 3등)
        Collections.sort(list);
        int[] r = new int[3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < rank.length; j++) {
                if (list.get(i) == rank[j]) {
                    r[i] = j;
                }
            }
        }
        int a=r[0]; int b=r[1]; int c=r[2];
        int answer = 10000*a+100*b+c;
        return answer;
    }
}

/*
public int solution(int[] rank, boolean[] attendance) {
        TreeMap<Integer, Integer> tree = new TreeMap<>();
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i] == true) tree.put(rank[i], i);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (Integer key : tree.keySet()) {
            if (list.size() == 3) break;
            list.add(tree.get(key));
        }
        return list.get(0) * 10000 + list.get(1) * 100 + list.get(2);
    }
 */
