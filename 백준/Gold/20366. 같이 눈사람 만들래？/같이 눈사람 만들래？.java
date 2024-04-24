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

        int min = Integer.MAX_VALUE;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                int sum1 = arr[i] + arr[j];
                int start = 0;
                int end = n-1;

                while(start < end){

                    if(start == i || start ==j){
                        start++;
                        continue;

                    }
                    if(end == i || end == j){
                        end --;
                        continue;

                    }
                    int sum2 = arr[start] + arr[end];

                    min = Math.min(min,Math.abs(sum2 - sum1));
                    if(sum1 > sum2){
                        start++;
                    }else if(sum1 < sum2){
                        end--;
                    }else{
                        break;
                    }
            }

            }
        }
        System.out.println(min);

    }
}