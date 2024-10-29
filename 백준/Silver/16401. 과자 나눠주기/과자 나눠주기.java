import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(bf.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int start = 1;
        int end = arr[n-1];
        boolean answer = false;

        while(start <= end){
            int mid = start + (end - start) / 2;
            int result = 0;
            for(int i=0; i<n; i++){
                if(arr[i] >= mid){
                    result += arr[i] / mid;
                }
            }
            if(result >= m){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
            if(result == 0){
                answer = true;
            }
        }
        if(answer) {
            System.out.println(answer);
        }else{
            System.out.println(end);
        }
    }
}
