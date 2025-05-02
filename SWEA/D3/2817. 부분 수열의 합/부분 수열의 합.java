

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    static int n,k;
    static int[] arr;
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        StringTokenizer st;

        for (int t = 1; t <= T; t++) {
            st = new StringTokenizer(bf.readLine());
             n = Integer.parseInt(st.nextToken());
             k = Integer.parseInt(st.nextToken());
            arr = new int[n];
            count = 0;
            st = new StringTokenizer(bf.readLine());

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            dfs(0,0,0);

            System.out.println("#" + t + " " + count);
        }
    }
    public static void dfs(int idx, int sum, int depth){
        // 1. 종료 조건(기저 조건)
        if(idx == n){ // 배열 끝까지 탐색 완료
            if(sum == k && depth > 0){ // 조건 만족(공집합 제외)
                count++;
            }
            return; //종료
        }

        // 현재 원소 포함하는 경우
        dfs(idx+1,sum+arr[idx],depth+1);
        // 현재 원소 포함하지 않는 경우
        dfs(idx+1,sum,depth);
    }
}
