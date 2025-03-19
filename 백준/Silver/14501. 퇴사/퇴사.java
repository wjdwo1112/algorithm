

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine()); // 퇴사일까지 남은 일 수

        int[] Time = new int[n + 1]; // 상담 기간
        int[] Pay = new int[n + 1];  // 상담 수익
        int[] dp = new int[n + 2];   // i일부터 퇴사일까지 얻을 수 있는 최대 금액

        // 상담 일정 입력받기
        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            Time[i] = Integer.parseInt(st.nextToken()); // 상담 소요 기간
            Pay[i] = Integer.parseInt(st.nextToken());  // 상담 완료 시 받을 돈
        }

        // **뒤에서부터 DP 계산 (퇴사일 기준으로 거꾸로)**
        for (int i = n; i > 0; i--) {
            if(i + Time[i] > n+1){
                dp[i] = dp[i+1]; // 상담을 진행할 수 없으면 다음날 값 유지
            }else{
                dp[i] = Math.max(dp[i+1], Pay[i] + dp[i + Time[i]]);
            }
        }

        // 첫째 날부터 얻을 수 있는 최대 이익 출력
        System.out.println(dp[1]);
    }
}