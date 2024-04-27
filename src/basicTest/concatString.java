import java.util.HashMap;

public class concatString {
    public static void main(String[] args) {
        String[] strArr = {"a","bc","d","efg","hi"};
        int answer = solution(strArr);
        System.out.println("answer: " + answer);
    }
    /*
        strArr를 문자열의 길이가 같은 원소끼리 그룹화 한다.
        그룹화한 최댓값(개수가 가장 많은 그룹)을 반환
     */
    public static int solution(String[] strArr) {
        int answer = 0;
        int[] len = new int[30];
        for (int i = 0; i < strArr.length; i++) {
            len[strArr[i].length()-1]++;
        }
        for (int n : len) {
            if (answer < n) {
                answer = n;
            }
        }
        return answer;
    }
}

/*      Map을 이용한 문제풀이
    public int solution(String[] strArr) {
        Map<Integer, ArrayList<String>> map = new HashMap<>();
        for (String str : strArr) {
            int len = str.length();
            if (map.containsKey(len)) {
                map.get(len).add(str);
            } else {
                ArrayList<String> temp = new ArrayList<>();
                temp.add(str);
                map.put(len, temp);
            }
        }

        int answer = 0;
        for (int len : map.keySet())
            answer = Math.max(answer, map.get(len).size());
        return answer;
    }
 */
