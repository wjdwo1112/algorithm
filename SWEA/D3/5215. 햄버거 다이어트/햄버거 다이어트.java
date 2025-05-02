

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    static int n,l;
    static int[] taste;
    static int[] calorie;
    static int maxTaste;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(bf.readLine());
      
        for(int t=1; t<=T; t++){
              st = new StringTokenizer(bf.readLine());
             n = Integer.parseInt(st.nextToken());
             l = Integer.parseInt(st.nextToken());
            taste = new int[n];
            calorie = new int[n];


            for(int i=0; i<n; i++){
                st = new StringTokenizer(bf.readLine());
                taste[i] = Integer.parseInt(st.nextToken());
                calorie[i] = Integer.parseInt(st.nextToken());
            }
			
            maxTaste = 0;
            dfs(0,0,0);
            System.out.println("#" + t + " " + maxTaste);

        }
    }
    public static void dfs(int idx, int cal, int tas){
        if(cal > l ){ // 최대 칼로리 넘으면 돌아가기
            return;
        }
        if(idx == n){ // 마지막 재료까지 확인했으면 재귀에서 빠져나온다.
            maxTaste = Math.max(maxTaste,tas);
            return;
        }

        //해당 재료 선택할 경우
        dfs(idx+1, cal+calorie[idx], tas+taste[idx]);
        //해당 재료 선택하지 않을 경우
        dfs(idx+1,cal,tas);

    }
}
