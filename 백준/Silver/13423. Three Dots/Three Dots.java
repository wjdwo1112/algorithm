import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(bf.readLine());
            int[] arr = new int[n];
            StringTokenizer st = new StringTokenizer(bf.readLine());
            for (int j = 0; j < n; j++) {

                arr[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr);

            int cnt = 0;
            for (int k = 0; k < n - 1; k++) {
                int a = k+2;
                for (int l = k + 1; l < n; l++) {
                    int dist = arr[l] - arr[k];

                    while (a < n && arr[a] - arr[l] < dist) {
                        a++;
                    }
                    if (a == n) break;
                    if (arr[a] - arr[l] == dist) {
                        cnt++;
                    }



                }
                }

            System.out.println(cnt);

        }
    }
}