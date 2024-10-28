import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        long m = Long.parseLong(bf.readLine());
        long start = 1;
        long end = arr[n - 1];
        long result = 0;
        while(start <= end) {
            long mid = (start + end) / 2;
            long sum = 0;
            for(int i=0; i<n; i++){

                if(arr[i] <=mid){
                    sum += arr[i];
                }else if(arr[i] > mid){
                    sum += mid;
                }
            }
            if(sum > m){
                end = mid -1;
            }else if (sum <= m){
                result = Math.max(mid,result);
                start = mid + 1;
            }

        }
        System.out.println(result);
    }
}
