import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution{
    public static int n;
    public static int k;
    public static int[] arr;
    public static int answer;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        for(int t=1; t<=T; t++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
             n = Integer.parseInt(st.nextToken());
             k = Integer.parseInt(st.nextToken());

              arr = new int[n];

            st = new StringTokenizer(bf.readLine());
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
			answer = 0;
            recur(0,0);
                if(k==0){
                    answer --;
                }
                System.out.println("#" + t + " " + answer);
            }



        }


    public static void recur(int cur, int sum){
        if (cur == n){
            if(sum == k) answer++;
            return;
        }
        recur(cur + 1, sum + arr[cur]);
        recur(cur + 1 , sum);
    }
}
