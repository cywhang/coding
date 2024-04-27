package basicTest;

public class stringbuilder {

    public static void main(String[] args) {
        // StringBuilder 객체 생성
        StringBuilder sb = new StringBuilder();

        // 문자열 추가
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");

        // 문자열 삽입
        sb.insert(5, ","); // "Hello, World"

        // 문자열 인덱스 문자 변경
        sb.setCharAt(0, 'A');

        // 문자열 삭제 범위
        sb.delete(5, 7); // "Hello World"

        // 문자열 삭제 선택
        sb.deleteCharAt(5);

        // 문자열 대체
        sb.replace(6, 11, "Java"); // "Hello Java"

        // 문자열 역순으로 변경
        sb.reverse(); // "avaJ olleH"

        // 문자열 인덱스 반환
        System.out.println(sb.substring(3, 7)); // "JWol"

        // StringBuilder 객체를 문자열로 변환하여 출력
        System.out.println(sb.toString()); // 출력: "avaJ olleH"
    }
}
