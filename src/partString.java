import java.util.Date;

public class partString {
    public static void main(String[] args) {
        int[] date1 = {2021, 12, 28};
        int[] date2 = {2021, 12, 29};
        int answer = solution(date1, date2);
        System.out.println("answer: " + answer);
    }
    /*
        Java 버전에 따라 날짜 비교하는 방법이 다름
        Java8 이전 : Date, calendar
        Java8 이후 : LocalDate, LocalDateTime
     */
    public static int solution(int[] date1, int[] date2) {
        Date da1 = new Date(date1[0], date1[1], date1[2]);
        Date da2 = new Date(date2[0], date2[1], date2[2]);
        int answer = da1.before(da2) == true ? 1 : 0;
        return answer;
    }
}
