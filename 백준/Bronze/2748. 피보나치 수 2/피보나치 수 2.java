
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        long[] dp = new long[n+1];

        dp[0] = 0;
        dp[1] = 1;

        for(int i=2; i<=n; i++){
          dp[i] = dp[i-2] + dp[i-1];
        }
        System.out.println(dp[n]);
    }
}
