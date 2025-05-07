

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
            int k = Integer.parseInt(st.nextToken());
            int[] arr = new int[n+1];
            int[] num = new int[n+1];
            st = new StringTokenizer(bf.readLine());
            for(int i=0; i<k; i++){

                int a = Integer.parseInt(st.nextToken());
                arr[a] = a;
            }


            for(int i=1; i<=n; i++){
                num[i] = i;
                if(i == arr[i]){
                    num[i] = 0;
                }
            }

            System.out.print("#" + t + " ");
            for(int i=1; i<=n; i++){
                if(num[i] != 0){
                    System.out.print(num[i] + " ");
                }
            }
            System.out.println();


        }
    }
}
