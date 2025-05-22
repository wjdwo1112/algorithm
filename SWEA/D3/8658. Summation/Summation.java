

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
            int[] arr = new int[10];

            int max = 0;
            int min = Integer.MAX_VALUE;
            for(int i=0; i<10; i++){
                String line = st.nextToken();
                int sum = 0;
                for(int j=0; j<line.length();j++){
                    int a = line.charAt(j)-'0';
                    sum = sum + a;

                }
                arr[i] = sum;
                max = Math.max(max,arr[i]);
                min = Math.min(min,arr[i]);
            }

            System.out.println("#" + t + " " + max + " " + min);

        }
    }
}
