
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        // 2차원 배열의 합배열 공식
        // D[i][j] = D[i][j-1] + D[i-1][j] - D[i-1][j-1] + A[i][j];
        // i,j 에서 x,y 까지 저장되어 있는 수들의 합
        // D[x][y] - D[i-1][y] - D[x][j-1] + D[i-1][j-1];
//        prefixSum[i][j]
//                - prefixSum[i - M][j]
//                - prefixSum[i][j - M]
//                + prefixSum[i - M][j - M];
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        for(int i=0; i<t; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int[][] arr = new int[n+1][n+1];
            int[][] prefix = new int[n+1][n+1];
            for(int j=1; j<=n; j++){
                st = new StringTokenizer(bf.readLine());
                for(int k=1; k<=n; k++){
                    arr[j][k] = Integer.parseInt(st.nextToken());
                    prefix[j][k] = prefix[j][k-1] + prefix[j-1][k] - prefix[j-1][k-1] + arr[j][k];
                }
            }
            int max = 0;
            for(int j=m; j<=n ; j++){
                for(int k=m; k<=n; k++){
                    int a = prefix[j][k] - prefix[j-m][k] - prefix[j][k-m] + prefix[j-m][k-m];
                    max = Math.max(max,a);

                }
            }
            System.out.println("#" + (i+1) + " " + max);





        }
    }
}
