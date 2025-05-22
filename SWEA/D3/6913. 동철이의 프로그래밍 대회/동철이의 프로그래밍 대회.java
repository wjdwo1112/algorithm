

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(bf.readLine());
        for(int t=1; t<=T; t++) {
            st = new StringTokenizer(bf.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int[][] arr = new int[n][m];


            int[] count = new int[n];
            for(int i=0; i<n; i++){
                st = new StringTokenizer(bf.readLine());
                for(int j=0; j<m; j++){
                    arr[i][j] = Integer.parseInt(st.nextToken());
                    if(arr[i][j] == 1){
                        count[i]++;
                    }
                }
            }

            int max = 0;
            int p = 0;
            for(int i=0; i<n; i++){
                max = Math.max(max,count[i]);
            }
            for(int i=0; i<n; i++){
                if(max == count[i]){
                    p++;
                }
            }

            System.out.print("#" + t + " ");
            System.out.println(p + " " + max);

        }
    }
}
