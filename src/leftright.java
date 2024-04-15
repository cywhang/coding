import java.util.ArrayList;
import java.util.Arrays;

public class leftright {
    public static void main(String[] args) {
        String[] str_list = {"u", "u", "r", "l", "r", "r", "r", "r"};
        String[] answer = solution(str_list);
        System.out.println("answer : " + Arrays.toString(answer));
    }

    public static String[] solution(String[] str_list) {

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                for (int k = 0; k < i; k++) {
                    list.add(str_list[k]);  // 왼쪽값 담기
                }
                break;
            }
        }

        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("r")) {
                for (int k = i+1; k < str_list.length; k++) {
                    list.add(str_list[k]);
                }
                break;
            }
        }

        String[] answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
