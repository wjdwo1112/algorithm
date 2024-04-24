import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        long[] arr = new long[n];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(arr);
        int start = 0;
        int end = n-1;

        long min = Integer.MAX_VALUE;
        long a = 0;
        long b = 0;
        while(start < end){
           long sum = arr[start] + arr[end];
           if(min > Math.abs(sum)){
               min = Math.abs(sum);
               a = arr[start];
               b = arr[end];
           }
           if(sum > 0){
               end--;
           }else if(sum < 0){
               start++;
           }else{
               a = arr[start];
               b = arr[end];
               break;
           }
        }
        System.out.println(a + " " + b);

    }
}
