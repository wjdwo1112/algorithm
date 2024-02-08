import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(bf.readLine(), " ");
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0;
        int start = 0;
        int end = 0;
        int sum = arr[start];

        while(true){

            if(sum == m){
                cnt++;
                end++;


                if(end == n){
                    break;
                }
                sum += arr[end];


            }else if(sum > m){
                sum -= arr[start];
                start++;
            }else{

                end++;
                if(end == n){
                    break;
                }


                sum+=arr[end];

            }
        }
        System.out.println(cnt);
    }
}