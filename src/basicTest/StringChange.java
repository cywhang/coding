package basicTest;

public class StringChange {
    public static void main(String[] args) {
        String myString = "ABBAA";
        String pat = "AABB";
        int answer = solution(myString, pat);
        System.out.println("answer : " + answer);
    }
    public static int solution(String myString, String pat) {
        int answer = 0;
        char[] ss = myString.toCharArray();
        for (int i = 0; i < ss.length; i++) {
            if (ss[i] == 'A') {
                ss[i] = 'B';
            } else {
                ss[i] = 'A';
            }
        }
        String mys = String.valueOf(ss);
        return mys.contains(pat) ? 1 : 0;
    }
}

/*  소문자로 변경해서 a와 B로 구분 후 다시 replace

public int solution(String myString, String pat) {
        myString = myString.replace("A", "a").replace("B", "A").replace("a", "B");
        return myString.contains(pat) ? 1 : 0;
    }
 */
