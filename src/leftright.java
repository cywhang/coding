import java.util.ArrayList;
import java.util.Arrays;

public class leftright {
    public static void main(String[] args) {
        String[] str_list = {"u", "u", "l", "r"};
//        String[] str_list = {"u", "u", "r", "l", "r", "r", "r", "r"};
        String[] answer = solution(str_list);
        System.out.println("answer : " + Arrays.toString(answer));
    }
    // 가장 먼저 나오는 문자열이 "l"인지 "r"인지를 판단하여 
    // "l"일때는 왼쪽문자열을 담은 리스트
    // "r"일때는 오른쪽문자열을 담은 리스트

    public static String[] solution(String[] str_list) {

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                for (int k = 0; k < i; k++) {
                    list.add(str_list[k]);  // 왼쪽값 담기
                }
                break;
            }
            if (str_list[i].equals("r")) {
                for (int k = i+1; k < str_list.length; k++) {
                    list.add(str_list[k]);
                }
                break;
            }
        }
        System.out.println("L이전, R 이후값 담기 : " + list.toString());
        String[] answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}


/*      유저풀이

public String[] solution(String[] str_list) {

        for (int i = 0; i < str_list.length; i++) {

            if ("l".equals(str_list[i])) {
                return Arrays.copyOfRange(str_list, 0, i);
            } else if ("r".equals(str_list[i])) {
                return Arrays.copyOfRange(str_list, i + 1, str_list.length);
            }
        }

        return new String[0];
    }
 */
