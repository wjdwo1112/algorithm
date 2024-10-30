import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int s = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int[] arr = new int[s];
        long sum = 0;
        for(int i=0; i<s; i++){
            arr[i] = Integer.parseInt(bf.readLine());
            sum += arr[i];
        }
        Arrays.sort(arr);

        long start = 1;
        long end = arr[s-1];

        while(start <= end){
            long mid = start + (end - start)/2;
            long result = 0;
            long so = 0;
            for(int i=0; i<s; i++){

                    result += arr[i] / mid;

            }
            if(result >= c){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        System.out.println(sum - end * c);

    }
}
