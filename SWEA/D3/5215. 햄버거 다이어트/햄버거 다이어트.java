import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static int n;
    public static int l;
    public static int max;
    public static int[] score;
    public static int[] cal;
    public static void main(String[] args) throws IOException {
        BufferedReader bf =  new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        for(int t=1; t<=T ; t++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            n = Integer.parseInt(st.nextToken());
            l = Integer.parseInt(st.nextToken());
            score = new int[n];
            cal = new int[n];

            for(int i=0; i<n; i++){
                st = new StringTokenizer(bf.readLine());
                score[i] = Integer.parseInt(st.nextToken());
                cal[i] = Integer.parseInt(st.nextToken());
            }
           max = 0;
            recur(0,0,0);
            System.out.println("#" + t + " " + max);


        }
    }
        // 현재 인덱스, 점수의 합, 칼로리의 합
    public static void recur(int cur, int scoreSum, int calSum){
        if(cur > l)return; //최대 칼로리 넘으면 돌아가기
        if(cur == n){
            //마지막 재료까지 확인했으면(조합으로 포함했든 안했든) 재귀에서 빠져나온다
            //그 전에 지금까지 조합의 칼로리 합이 최대를 넘지 않았으면 max를 갱신한다.
            if(calSum <= l){
                max = Math.max(max , scoreSum);
            }
            return;
        }

        //해당 재료 선택했을때
        recur(cur + 1, scoreSum + score[cur], calSum + cal[cur]);
        //해당 재료 선택하지 않았을떄
        recur(cur + 1, scoreSum,calSum);

    }
}
