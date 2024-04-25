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
        long sum1 = 0;
        long min = 3_000_000_000L;
        long a = 0;
        long b = 0;
        long c = 0;
        for(int i=0 ; i<n; i++){
            sum1 = arr[i];
            int start = 0;
            int end = n-1;

            while(start < end){
                if(start == i){
                    start++;
                    continue;


                }else if(end == i){
                    end --;
                    continue;


                }
                long sum2 = sum1 + arr[start] + arr[end];

                if(min > Math.abs(sum2)){
                    min = Math.abs(sum2);
                    a = arr[i];
                    b = arr[start];
                    c = arr[end];
                }
                if(sum2 > 0 ){
                    end--;
                }else if(sum2 < 0){
                    start ++;
                }else{
                    a = arr[i];
                    b = arr[start];
                    c = arr[end];
                    break;
                }
            }
        }
        long[]arr2 = new long[3];
        arr2[0] = a;
        arr2[1] = b;
        arr2[2] = c;
        Arrays.sort(arr2);
        for(int i=0; i<3; i++){
            System.out.print(arr2[i]);
            System.out.print(" ");
        }
    }
}
