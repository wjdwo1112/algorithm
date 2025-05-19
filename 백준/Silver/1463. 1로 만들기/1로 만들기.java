

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        int[] dp = new int[n+1];
        //dp[i] = i를 1로 만들기 위해 필요한 최소연산횟수;
        //dp[1] = 0 -> 1은 이미 1이므로 연산이 필요 없다.
        dp[1] = 0;
        for(int i=2; i<=n; i++){
            //기본적으로 1을 뺴는경우
            dp[i] = dp[i-1] + 1;

            //2로 나누어 떨어지면 2로 나누는 경우와 비교
            if(i % 2 == 0){
                dp[i] = Math.min(dp[i] , dp[i/2] + 1);
            }
            // 3으로 나누어 떨어지면 3으로 나누는 경우와 비교
            if(i % 3 == 0){
                dp[i] = Math.min(dp[i], dp[i/3] + 1);
            }
        }

        System.out.println(dp[n]);
    }
}
