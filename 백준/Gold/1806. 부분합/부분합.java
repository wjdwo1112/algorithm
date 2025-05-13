

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        st = new StringTokenizer(bf.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int start = 0;
        int end = 0;
        
        int sum = 0;
        int min = n+1;

        while(true){
            if(sum >= s){
               
                min = Math.min(end - start,min);
                sum = sum - arr[start];
                start++;
            }else if(end == n){
                break;
            }else{

                sum = sum + arr[end];
                end++;
            }

        }

        if(min == n+1){
            System.out.println(0);
        }else{
        System.out.println(min);
        }
    }
}
