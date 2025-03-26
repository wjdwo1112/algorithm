import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        int[] wine = new int[n+1];
        int[] dp = new int [n+1];

        for(int i=1; i<=n; i++){
            wine[i] = Integer.parseInt(bf.readLine());
        }
        
        //예외 처리(n이 1이나 2일때)
        if(n>=1){
            dp[1] = wine[1]; // 첫번째 잔만 마심
        }
        if(n>=2){
            dp[2] = wine[1] + wine[2]; // 첫 장 + 두 번째 잔
        }
        //dp[i]는 i번째 포도주까지 마셨을 때의 최대 양
        // 연속으로 놓여 있는 3잔을 모두 마실 수 없다.
        // 그러면 세번째걸 마시려면
        // dp[i] = dp[i-1] -> i번째 잔 안 마심
        // dp[i] = dp[i-2] + wine[i]; -> i-1 안 마시고 i마심
        // dp[i] = dp[i-3] + wine[i-1] + wine[i]; -> i-2 안마시고, i-1, i 마심
        for(int i=3; i<=n; i++) {
            dp[i] = Math.max(dp[i-1],(Math.max(dp[i - 2] + wine[i], dp[i - 3] + wine[i - 1] + wine[i])));
        }

        System.out.println(dp[n]); // 최댓값 출력
    }
}
