import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(bf.readLine());
        }
        Arrays.sort(arr);

        int min = Integer.MAX_VALUE;
        int cnt = 0;
        int start = 0;
        int end = 1;

        while(start < n && end < n){
            if(arr[end] - arr[start] < m){
                end++;
            }else if(arr[end] - arr[start] >= m){
                cnt = arr[end] - arr[start];
                min = Math.min(min,cnt);
                start++;

            }
        }
        System.out.println(min);
    }
}
