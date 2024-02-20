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

        int[] arr = new int[n+1];
        st = new StringTokenizer(bf.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }


        int start = 0;
        int end = 0;
        int a = 0;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        while(start <= end && end<= n){

            if(sum >= s){
                a = Math.abs(start - end) ;
                if(min > a){
                    min = a;
                }

                
                sum -= arr[start];
                start++;
            }else if(sum < s){
                sum += arr[end];
                end++;
            }

        }
        if(min == Integer.MAX_VALUE){
            System.out.println(0);
        }else {
            System.out.println(min);
        }
    }
}

