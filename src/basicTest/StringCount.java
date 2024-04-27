package basicTest;

public class StringCount {
    public static void main(String[] args) {
        String myString = "banana";
        String pat = "ana";
        int answer = solution(myString, pat);
        System.out.println("answer : " + answer);
    }
    public static int solution(String myString, String pat) {
        int answer = 0;
        int l = myString.indexOf(pat);
        while (l > -1) {
            answer++;
            l = myString.indexOf(pat, l+1);
        }

        return answer;
    }
}

/*
public int solution(String myString, String pat) {
        int cnt = 0;
        for(int i=0; i<myString.length(); i++) {
            if(myString.substring(i).startsWith(pat)){
                cnt++;
            }
        }
        return cnt;
    }
 */
