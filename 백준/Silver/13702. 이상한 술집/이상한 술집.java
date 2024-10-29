import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(bf.readLine());
        }
        Arrays.sort(arr);

        long start = 1;
        long end = arr[n-1];
        while(start <= end){
            long mid = start + (end - start)/2;
            long sum = 0;
            int cnt = 0;
            for(int i=0; i<n; i++)
                {
                    sum += arr[i]/mid;
                }
                if(sum >= k){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }

        }
        System.out.println(end);
    }
}
