import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(bf.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int start = 0;
        int end = 0;
        int result = 0;
        int[] cnt = new int[100001];
        while(start <= end){
            if(cnt[arr[end]] < k){
                cnt[arr[end]]++;
                end++;
            }else if(cnt[arr[end]] == k){
                cnt[arr[start]]--;
                start++;
            }
            result = Math.max(end-start,result);
            if(end == n){
                break;
            }
        }
        System.out.println(result);

    }
}
