import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        for(int t=1; t<=T; t++){
            int n = Integer.parseInt(bf.readLine());
            int[][] arr = new int[n][n];

            for(int i=0; i<n; i++){
                String line = bf.readLine();
                for(int j=0; j<n; j++){
                    arr[i][j] = line.charAt(j) - '0';
                }
            }
            int sum = 0;
            int mid = n/2;

            for(int i=0; i<n; i++){
                int start = Math.abs(mid - i);//시작 열 인덱스(마름모 범위)
                int end = n - start;//끝 열 인덱스
                for(int j=start; j<end; j++){
                    sum += arr[i][j];
                }
            }
            System.out.println("#" + t + " " + sum);

        }
    }
}
