

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(bf.readLine());

        for(int t=1; t<=T; t++){
            st = new StringTokenizer(bf.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int[][] arr = new int[n+1][n+1];
            for(int i=1; i<=n; i++){
                st = new StringTokenizer(bf.readLine());
                for(int j=1; j<=n; j++){
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int result = 0;
            for(int i=1; i<=n; i++){
                int cnt = 0;
                for(int j=0; j<=n; j++){
                    if(arr[i][j] == 1){
                        cnt++;
                    }else{
                        if(cnt == k) result++;
                        cnt = 0;
                    }
                }
                if(cnt == k){
                    result++;
                }
            }

            for(int j=1; j<=n; j++){
                int cnt = 0;
                for(int i=1; i<=n; i++){
                    if(arr[i][j] == 1){
                        cnt++;
                    }else{
                        if(cnt == k) result++;
                        cnt = 0;
                    }
                }
                if(cnt == k){
                    result++;
                }
            }

            System.out.println("#" + t+ " " + result);
        }
    }
}
