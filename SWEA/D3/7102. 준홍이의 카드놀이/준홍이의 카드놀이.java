

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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

            int[] arr = new int[n+m+1];
            for(int i=1; i<=n; i++){
                for(int j=1; j<=m; j++){
                    arr[i+j]++;
                }
            }

            int max = 0;
            for(int i=1; i<arr.length; i++){
                max = Math.max(arr[i],max);
            }

            System.out.print("#" + t + " ");
            for(int i=1; i<arr.length; i++){
                if(arr[i] == max){
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }
}
