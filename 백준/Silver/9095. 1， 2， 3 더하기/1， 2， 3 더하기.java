import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());

        for(int t=0; t<T; t++){
            int n = Integer.parseInt(bf.readLine());

            // n이 1일 수도 있어서 바로 dp[2], dp[3] 할당하는 부분에서 ArrayIndexOutOfBounds 날 수 도 있어서
            int[] dp = new int[Math.max(n+1,4)]; // 최소 크기 4 확보
            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 4;

            for(int i=4; i<=n; i++){
                //dp[n] = n을 1,2,3의 합으로 만드는 방법의 수
                // n을 만들기 위해서 n-1에 +1 하거나, n-2에 +2하거나, n-3에 +3하면 된다.
                dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
            }
            System.out.println(dp[n]);
        }

    }
}
