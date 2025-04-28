

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for(int t=1; t<=10; t++){
            int n = Integer.parseInt(bf.readLine());
            int[] arr = new int[n];
            st = new StringTokenizer(bf.readLine());
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int sum = 0;
            for(int i=2; i<n-2; i++){
                int max1 =0;
                int max2 = 0;
                int max = 0;
                if(arr[i] > arr[i-2] && arr[i] > arr[i-1] && arr[i] > arr[i+1] && arr[i] > arr[i+2]){
                    max1 = Math.max(arr[i-2],arr[i-1]);
                    max2 = Math.max(arr[i+1],arr[i+2]);
                    max = Math.max(max1,max2);

                    sum += (arr[i] - max);
                }
            }
             System.out.println("#" + t + " " + sum);
        }
    }
}
