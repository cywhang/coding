import java.util.Arrays;

public class split {
    public static void main(String[] args) {
        String my_string = "i love you";
        String[] answer = solution(my_string);
        System.out.println("answer : " + Arrays.toString(answer));
    }
/*
    public static String[] solution(String my_string) {
        ArrayList<String> list = new ArrayList<>();
        int l = my_string.indexOf(" ");
        int c = 0;
        while (l > -1) {
            list.add(my_string.substring(c++, l));
            l = my_string.indexOf(" ", l+1);
        }
        list.add(my_string.substring(c,my_string.length()));
        String[] answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
    */
    public static String[] solution(String my_string) {
        String[] answer = my_string.split(" ");
        return answer;
    }
}
