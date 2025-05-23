

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    static int n,k;
    static int[] arr;
    static int cnt;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(bf.readLine());
        for(int t=1; t<=T; t++){
            st = new StringTokenizer(bf.readLine());
             n = Integer.parseInt(st.nextToken());
             k = Integer.parseInt(st.nextToken());

            arr = new int[n];
            st = new StringTokenizer(bf.readLine());
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            cnt = 0;
            dfs(0,0);
            System.out.println("#" + t + " " + cnt);
        }
    }

    public static void dfs(int idx, int sum){
        if(idx == n){
            if(sum == k){
                cnt++;
            }
            return;
        }
        dfs(idx + 1, sum + arr[idx]);
        dfs(idx + 1, sum );
    }
}
