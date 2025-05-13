

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(bf.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }


        int start = 0;
        int end = 0;
        int cnt = 0;
        int sum = 0;
        while(true){
            if(sum >= m){
                sum = sum - arr[start];
                start++;
            }else if(end ==n){
                break;
            }else{
                sum = sum + arr[end];
                end++;
            }
            if(sum == m){
                cnt++;
            }

        }
        System.out.println(cnt);

    }
}
