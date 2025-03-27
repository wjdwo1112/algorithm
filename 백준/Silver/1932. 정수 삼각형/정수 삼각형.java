

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(bf.readLine());

        int[][] tri = new int[n+1][n+1];
        int[][] dp = new int [n+1][n+1]; // dp[i][j] = (i,j) 위치까지 왔을 때 최대 누적합

        // 삼각형 숫자 입력받기
        for(int i=1; i<=n; i++){
            st = new StringTokenizer(bf.readLine());
            for(int j=1; j<=i; j++){
                tri[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 시작점 초기화(꼭대기 숫자)
        dp[1][1] = tri[1][1];

        // 점화식 적용하며 dp 배열 채우기
        for(int i=2; i<=n; i++){
            for(int j=1; j<=i; j++){

                //[왼쪽 끝] -> 바로 위 칸에서만 올 수 있음
                if(j==1){
                    dp[i][j] = dp[i-1][j] + tri[i][j];
                }
                // [오른쪽 끝] -> 왼쪽 위 칸에서만 올 수 있음
                else if(j==i){
                    dp[i][j] = dp[i-1][j-1] + tri[i][j];
                }
                // [중간] -> 왼쪽 위 또는 바로 위에서 올 수 있음
                // 둘 중 더 큰 경로를 선택해서 현재 값을 더함
                else{
                    dp[i][j] = Math.max (dp[i-1][j-1],dp[i-1][j]) + tri[i][j];
                }
            }
        }

        // 마지막 줄에서 최댓값 찾기
        int answer = 0;
        for(int i=1; i<=n; i++){
            answer = Math.max(answer, dp[n][i]);
        }

        System.out.println(answer);






    }
}
