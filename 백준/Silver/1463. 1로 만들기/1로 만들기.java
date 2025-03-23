
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        int[] dp = new int[n+1]; // dp[i]: i를 1로 만드는데 필요한 최소 연산 횟수
        dp[1] = 0; //초기값 설정 1은 이미 1이므로 연산 0번
        
        for(int i=2; i<=n; i++){
            // 기본값: i-1에서 +1 연산으로 오는 경우
            dp[i] = dp[i-1] + 1;
            // i가 2로 나누어 떨어질 경우: i/2 에서 오는 경로 비교
            if(i % 2 == 0){
                dp[i] = Math.min(dp[i], dp[i/2] + 1); // 기존 값과 비교하여 더 작은 값 선택
            }
            // i가 3으로 나누어 떨어질 경우: i/3 에서 오는 경로 비교
            if(i % 3 == 0){
                dp[i] = Math.min(dp[i], dp[i/3] + 1); // 기존 값과 비교하여 더 작은 값 선택
            }

        }
        // n을 1로 만들기 위한 최소 연산 횟수
        System.out.println(dp[n]);
    }
}
