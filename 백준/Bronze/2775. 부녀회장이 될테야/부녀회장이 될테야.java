

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());

        for(int t=0; t<T; t++){
            int k = Integer.parseInt(bf.readLine());
            int n = Integer.parseInt(bf.readLine());

            int[][] dp = new int[k+1][n+1];

            for(int i=1; i<=n; i++){
                dp[0][i] = i;
            }
            // dp[k][n] = dp[k][n-1](같은 층, 이전호수까지의 누적) + dp[k-1][n](아래층, 같은 호수까지의 누적)

            for(int i=1; i<=k; i++){
                for(int j=1; j<=n; j++){
                    dp[i][j] = dp[i][j-1]+dp[i-1][j];
                }
            }

            System.out.println(dp[k][n]);
        }
    }
}
