

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(bf.readLine());
        int[][] arr = new int[1001][1001];


        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(bf.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int width = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());

            for (int j = x; j < x + width; j++) {
                for (int k = y; k < y + height; k++) {
                    arr[j][k] = i;
                }
            }

        }

        for (int k = 1; k <= n; k++) {
            int cnt = 0;
            for (int i = 0; i <= 1000; i++) {
                for (int j = 0; j <= 1000; j++) {
                        if(arr[i][j] == k){
                            cnt++;
                        }
                }
            }
            System.out.println(cnt);

        }
    }
}
