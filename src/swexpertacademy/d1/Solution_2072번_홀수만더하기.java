package swexpertacademy.d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_2072번_홀수만더하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;

        int T = Integer.parseInt(bf.readLine());
        int[][] arr = new int[3][10];
        int[] sum = new int[T];

            for(int i=0 ; i<T; i++) {
                st = new StringTokenizer(bf.readLine(), " ");
                for (int j = 0; j < 10; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                    if ((arr[i][j] % 2) == 1) {
                        sum[i] += arr[i][j];
                    }
                }
            }
            for(int i=0; i<T; i++) {
                System.out.printf("#"+"%d" + " " + sum[i],i+1);
                System.out.println();
            }
    }

}
