import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] arr = new int[n+1];
        int[] dp = new int [n+1];
        for(int i=1; i<=n; i++){
            arr[i] = Integer.parseInt(bf.readLine());
        }

        
        if(n >= 1){
            // 계단이 1개만 있을 때, 첫번째 계단을 반드시 밟아야 하니까, 점수는 그 계단 점수 그대로이다.
            dp[1] = arr[1];
        }
        if(n >= 2){
            // 계단이 2개라면 연속 세 계단 금지는 3개 이상 밟을 때만 해당되고, 2개는 연속으로 밟아도 된다.
            dp[2] = arr[1] + arr[2];
        }


        for(int i=3; i<=n; i++) {
            //dp[i]는 i번째 계단까지 올라갔을 때의 최대 점수
            // i번째 계단을 밟는 경우는 딱 2가지이다.
            // 1. (i-2)번째 계단 -> i번째 계단
            // 2. (i-3)번째 계단 -> (i-1)번째 계단 -> i번째 계단
            dp[i] = Math.max(dp[i - 2] + arr[i], dp[i - 3] + arr[i - 1] + arr[i]);

        }

        System.out.println(dp[n]);


    }

}

