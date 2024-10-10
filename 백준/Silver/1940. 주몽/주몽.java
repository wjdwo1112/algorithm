import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(bf.readLine());
        int m = Integer.parseInt(bf.readLine());

        int[] arr = new int[n];

        st = new StringTokenizer(bf.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        
        int cnt = 0;
        int start = 0;
        int end = n-1;
        
        while(start < end){
            int sum = arr[start]+arr[end];

            if(sum > m){
                end--;
            }else if(sum < m){
                start++;
            }else{
                cnt++;
                start++;
                end--;
            }
        }
        System.out.println(cnt);
    }
}
