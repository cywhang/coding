public class string {
    char[] arr;

    public String solution(String my_string, int[][] queries) {

        arr = my_string.toCharArray();

        for (int[] query : queries) {
            reverse(query[0], query[1]);
        }

        return new String(arr);
    }

    private void reverse(int s, int e) {
        while (s < e) {
            char temp = arr[s];
            arr[s++] = arr[e];
            arr[e--] = temp;
        }
    }

}

/*
    public static void main(String args[]){
        String answer = "";
        String my_string = "rermgorpsam";
        int[][] queries = {{2, 3},{0,7},{5,9},{6,10}};
        char[] str = my_string.toCharArray();
        for (int i = 0; i < queries.length; i++) {
            int k = queries[i][0];
            int l = queries[i][1];
            char[] idx = new char[l-k+1];
            int n = 0;
            for (int j = l; j >= k; j--) {
                idx[n] = str[j];
                n++;
            }
            for (int j = 0; j < n; j++) {
                str[k] = idx[j];
                k++;
            }
        }
        for (int i = 0; i < my_string.length(); i++) {
            answer += str[i];
        }

        System.out.println("answer : " + answer);
    }
 */
