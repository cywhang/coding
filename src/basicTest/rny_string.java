package basicTest;

import java.util.ArrayList;
import java.util.Arrays;

public class rny_string {
    public static void main(String[] args) {
        String myStr = "baconlettucetomato";
        String[] answer = solution(myStr);
        System.out.println("answer : " + Arrays.toString(answer));
    }

    public static String[] solution(String myStr) {

        ArrayList<String> list = new ArrayList<>();
        String[] ss = myStr.split("[abc]");
        for (int i = 0; i < ss.length; i++) {
            if (!ss[i].isEmpty()){
                list.add(ss[i]);
            }
        }
        if (list.isEmpty()) {
            list.add("EMPTY");
        }
        return list.toArray(new String[0]);
    }
}

/*
public String[] solution(String myStr) {
        myStr = myStr.replaceAll("[a|b|c]+", ",");
        myStr = myStr.charAt(0) == ',' ? myStr.substring(1) : myStr;
        myStr = myStr.equals("") ? "EMPTY" : myStr;

        return myStr.split("[,]");
    }

 */
