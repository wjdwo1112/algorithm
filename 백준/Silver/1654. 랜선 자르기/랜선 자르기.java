import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] arr = new int[k];
        long max = 0;
        for(int i=0; i<k; i++){
            arr[i] = Integer.parseInt(bf.readLine());
            max = Math.max(arr[i],max);
        }

        long start = 1;
        long end = max;

        while(start<=end){
            long mid = start + (end - start)/2;
            long result = 0;
            for(int i=0; i<k; i++){
                result += arr[i]/mid;
            }
            if(result >= n){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }

        System.out.println(end);

    }
}
