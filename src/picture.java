import java.util.Arrays;

public class picture {
    public static void main(String[] args) {
        String[] picture = {".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."};
        int k = 2;
        String[] answer = solution(picture, k);
        String[] answer2 = solution2(picture, k);
        System.out.println("answer");
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
        System.out.println("answer2");
        for (int i = 0; i < answer2.length; i++) {
            System.out.println(answer2[i]);
        }
    }
    /*
        picture는 1:1 비율의 그림이고
        k배 만큼 picture를 확대해야함.

            .xx...xx.
            x..x.x..x                   x.x
            x...x...x                   .x.
            .x.....x.                   x.x
            ..x...x..
            ...x.x...
            ....x....

                 |                      |
                2배                     3배
                 |                      |

        ..xxxx......xxxx..          xxx...xxx
        ..xxxx......xxxx..          xxx...xxx
        xx....xx..xx....xx          xxx...xxx
        xx....xx..xx....xx          ...xxx...
        xx......xx......xx          ...xxx...
        xx......xx......xx          ...xxx...
        ..xx..........xx..          xxx...xxx
        ..xx..........xx..          xxx...xxx
        ....xx......xx....          xxx...xxx
        ....xx......xx....
        ......xx..xx......
        ......xx..xx......
        ........xx........
        ........xx........
     */
    public static String[] solution(String[] picture, int k) {
        // 1. 기존 이미지의 행과 열의 수를 가져옴.
        int rows = picture.length;
        int cols = picture[0].length();

        // 2. k배 확대한 이미지의 행과 열의 수를 가져옴.
        int newRows = rows * k;
        int newCols = cols * k;
        
        // 3. 확대한 이미지를 저장할 배열
        String[] newPicture = new String[newRows];
        
        // 4. 각 행에 대한 반복
        for (int i = 0; i < newRows; i++) {
            // StringBuilder 초기화
            StringBuilder sb = new StringBuilder();
            // 현재 행이 기존 이미지의 몇 번째 행에 해당하는지 계산
            int row = i / k;

            // 5. 각 열에 대한 반복
            for (int j = 0; j < newCols; j++) {
                // 현재 열이 기존 이미지의 몇 번째 열에 해당하는지 계산
                int col = j / k;
                // 기존 이미지에서 픽셀 값을 가져와 pixel에 저장
                char pixel = picture[row].charAt(col);
                sb.append(pixel);
            }
            // 한 행의 정보를 toString하여 배열에 저장
            newPicture[i] = sb.toString();
        }
        return newPicture;
    }


    public static String[] solution2(String[] picture, int k) {
        // 1. 확대한 이미지를 저장할 배열
        String[] answer = new String[picture.length * k];
        int idx = 0;
        
        // 2. 기존 이미지의 각 행에 대해 반복
        for(int i=0; i<picture.length; i++) {
            // 3. 각 행을 k배 확대하여 새로운 행을 생성
            for(int j=0; j<k; j++) {
                // StringBuilder 초기화
                StringBuilder sb = new StringBuilder();
                
                // 4. 현재 행의 각 문자를 k번 반복하여 새로운 행에 추가
                for(int l=0; l<picture[i].length(); l++) {
                    // 기존 이미지의 열을 k번 반복하여 sb에 추가
                    sb.append(String.valueOf(picture[i].charAt(l)).repeat(k));
                }
                
                // 5. 새롭게 생성한 행을 배열에 추가
                answer[idx++] = sb.toString();
            }
        }

        return answer;
    }
}

