

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    static int n,s;
    static int[] arr;
    static int cnt;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());

        arr = new int[n];
        st = new StringTokenizer(bf.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        cnt = 0;

        dfs(0,0,0);

        System.out.println(cnt);

    }

    private static void dfs(int idx, int sum, int depth) {
        if(idx == n){
            if(depth > 0 && sum == s){
                cnt++;
            }
            return;
        }
        dfs(idx + 1, sum + arr[idx], depth + 1);
        dfs(idx + 1, sum, depth);

    }
}
