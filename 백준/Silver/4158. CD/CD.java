import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        while(true) {

            StringTokenizer st = new StringTokenizer(bf.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            if(n==0 && m==0){
                break;
            }

            int[] arr = new int[n + m];


            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(bf.readLine());
            }

            for (int i = n; i < n + m; i++) {
                arr[i] = Integer.parseInt(bf.readLine());
            }
            Arrays.sort(arr);




            int cnt = 0;

            int start = 0;
            int end = 1;
            while (end < n + m) {
                if (arr[end] - arr[start] == 0) {
                    cnt++;
                    start++;
                    end++;
                } else if (arr[end] - arr[start] > 0) {
                    start++;
                    end++;
                }
            }
            System.out.println(cnt);

        }

    }
}
