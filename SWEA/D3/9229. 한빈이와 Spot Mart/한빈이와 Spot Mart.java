

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(bf.readLine());
        for(int t=1; t<=T; t++){
            st = new StringTokenizer(bf.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int[] arr = new int[n];
            st = new StringTokenizer(bf.readLine());
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            int start = 0;
            int end = n-1;

            int max = 0;

            while(start<end){
                if(arr[start] + arr[end] > m ){
                    end--;
                }else{
                    max = Math.max((arr[start] + arr[end]),max);
                    start++;
                }

            }
            System.out.print("#" + t + " ");
            if(max == 0){
                System.out.println(-1);
            }else {
                System.out.println(max);
            }
        }
    }
}
