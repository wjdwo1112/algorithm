import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        // 입력받기
        int[][] arr = new int[n+1][n+1];

        for(int i=1; i<=n; i++){
            st = new StringTokenizer(bf.readLine());
            for(int j=1; j<=n; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        // 누적합
        int[][] prefix = new int[n+1][n+1];

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n ; j++){
                prefix[i][j] = prefix[i][j-1] + prefix[i-1][j] - prefix[i-1][j-1] + arr[i][j];
            }
        }

        for(int i=1; i<=m; i++){
            st = new StringTokenizer(bf.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            System.out.println(prefix[x2][y2] - prefix[x1-1][y2] - prefix[x2][y1-1] + prefix [x1-1][y1-1]);
        }


    }
}
