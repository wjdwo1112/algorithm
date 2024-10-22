import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    // 2차원 배열의 합배열 공식
    // D[i][j] = D[i][j-1] + D[i-1][j] - D[i-1][j-1] + A[i][j];
    
    // i,j 에서 x,y 까지 저장되어 있는 수들의 합
    // D[x][y] - D[i-1][y] - D[x][j-1] + D[i-1][j-1];
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n+1][m+1];
        int[][] prefix_sum = new int[n+1][m+1];

        for(int i=1; i<=n; i++){
            st = new StringTokenizer(bf.readLine());
            for(int j=1; j<=m; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                prefix_sum[i][j] = prefix_sum[i][j-1] + prefix_sum[i-1][j] - prefix_sum[i-1][j-1] + arr[i][j];
            }
        }
        int k = Integer.parseInt(bf.readLine());

        for(int a=0; a<k; a++){
            st = new StringTokenizer(bf.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            System.out.println(prefix_sum[x][y] - prefix_sum[i-1][y] - prefix_sum[x][j-1] + prefix_sum[i-1][j-1]);
        }
    }
}
