

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(bf.readLine());

        int[] arr = new int[n+1];
        int[] dp = new int[n+1];

        //dp[i] 를 뭐로 정해야 할까???? -> i번쨰 원소를 포함하는 연속합의 최대값

        // dp[i] = Math.max(arr[i], dp[i-1] + arr[i])

        st = new StringTokenizer(bf.readLine());
        for(int i=1; i<=n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int answer = -1001;
        for(int i=1; i<=n; i++){
            dp[i] = Math.max(arr[i], dp[i-1] + arr[i]);
            answer = Math.max(answer,dp[i]);
        }
        System.out.println(answer);

    }
}
