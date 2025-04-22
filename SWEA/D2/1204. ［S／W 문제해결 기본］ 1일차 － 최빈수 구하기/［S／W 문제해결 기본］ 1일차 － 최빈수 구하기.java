

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
            
            int[] num = new int[101];
            int result = 0;
            int b = 0;

            int a = Integer.parseInt(bf.readLine());
            st = new StringTokenizer(bf.readLine());

            for(int i=0; i<1000; i++) {
                int score  = Integer.parseInt(st.nextToken());
                num[score]++;
            }
            for(int i=0; i<=100; i++){
                if(result <= num[i]){
                    result = num[i];
                    b = i;
                }
            }
            System.out.println("#" + t+ " " + b);
        }
    }
}
