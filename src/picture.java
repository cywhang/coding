import java.util.Arrays;

public class picture {
    public static void main(String[] args) {
        String[] picture = {".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."};
        int k = 2;
        String[] answer = solution(picture, k);
        System.out.println(Arrays.toString(answer));
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
        int rows = picture.length;
        int cols = picture[0].length();

        int newRows = rows * k;
        int newCols = cols * k;

        String[] newPicture = new String[newRows];

        for (int i = 0; i < newRows; i++) {
            StringBuilder sb = new StringBuilder();
            int row = i / k;

            for (int j = 0; j < newCols; j++) {
                int col = j / k;
                char pixel = picture[row].charAt(col);
                sb.append(pixel);
            }

            newPicture[i] = sb.toString();
        }

        return newPicture;
    }
}

/*
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        int idx = 0;

        for(int i=0; i<picture.length; i++) {
            for(int j=0; j<k; j++) {
                StringBuilder sb = new StringBuilder();

                for(int l=0; l<picture[i].length(); l++) {
                    sb.append(String.valueOf(picture[i].charAt(l)).repeat(k));
                }

                answer[idx++] = sb.toString();
            }
        }

        return answer;
    }
 */
