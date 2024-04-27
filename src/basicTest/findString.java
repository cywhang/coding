package basicTest;

public class findString {

    public static void main(String[] args) {
        String myString = "AbCdEfG";
        String pat = "aBc";
        int answer = solution(myString, pat);
        System.out.println("answer: " + answer);
        // 'a'와 'A'의 차이는 32이다.
    }

    public static int solution(String myString, String pat) {
        int answer = 0;
        return (myString.toUpperCase().contains(pat.toUpperCase())) ? 1 : 0;
    }

    /*   유저 문제풀이

     public int solution(String myString, String pat) {
        int answer = 0;
        String str = myString.toLowerCase();
        String str2 = pat.toLowerCase();

        if (str.indexOf(str2) != -1) {
            return 1;
        }
        return 0;
    }
     */
}
