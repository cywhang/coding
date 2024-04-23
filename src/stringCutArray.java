import java.util.ArrayList;
import java.util.Arrays;

public class stringCutArray {
    public static void main(String[] args) {
        String myString = "dxccxbbbxxaaaa";
        String[] answer = solution(myString);
        System.out.println("answer: " + Arrays.toString(answer));
    }

    public static String[] solution(String myString) {
        ArrayList<String> list = new ArrayList<>();
        myString = myString.replaceAll(" ", "");
        String[] answer = myString.split("x");
        for (int i = 0; i < answer.length; i++) {
            if (!answer[i].isEmpty()) {
                list.add(answer[i]);
            }
        }
        answer = list.toArray(new String[list.size()]);
        Arrays.sort(answer);
        return answer;
    }
}

/*
public String[] solution(String myString) {
        StringTokenizer st = new StringTokenizer(myString, "x");
        int idx = 0, N = st.countTokens();
        String[] result = new String[N];
        for (int n = 0;n < N;n++)
            result[idx++] = st.nextToken();
        Arrays.sort(result);
        return result;
    }

 */