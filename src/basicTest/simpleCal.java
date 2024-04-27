package basicTest;

public class simpleCal {
    public static void main(String[] args) {
        String binomial = "43 + 12";
        int answer = solution(binomial);
        System.out.println("answer: " + answer);
    }
    public static int solution(String binomial) {
        int answer = 0;
        String[] spl = binomial.split(" ");
        int fir = Integer.parseInt(spl[0]);
        int sec = Integer.parseInt(spl[2]);
        String oper = spl[1];
        switch (oper) {
            case "+" : answer = fir + sec; break;
            case "-" : answer = fir - sec; break;
            case "*" : answer = fir * sec; break;
        }

        return answer;
    }
}
