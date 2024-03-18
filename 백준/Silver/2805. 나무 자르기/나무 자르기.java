import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n= Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        long[] arr = new long[n];
        long max = 0;
        st = new StringTokenizer(bf.readLine(), " ");
        for(int i=0; i<n; i++){
            arr[i] = Long.parseLong(st.nextToken());
            max = Math.max(max,arr[i]);
        }
        long start =0;
        long end = max;


        while(start <= end){
            long mid = start + (long)(end - start)/2;
            long result = 0;
            long sum = 0;
            for(int i=0; i<n; i++) {
                if (arr[i] > mid) {
                    result = arr[i] - mid;
                    sum += result;
                }
            }
                if(sum >= m){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
            System.out.println(end);
        }


    }
