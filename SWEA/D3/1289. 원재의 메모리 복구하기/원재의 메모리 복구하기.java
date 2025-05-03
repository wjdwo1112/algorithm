

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(bf.readLine());

        for(int t=1; t<=T; t++){
            String a = bf.readLine();
            int prev = 0;
            int cnt = 0;
            for(int i=0; i<a.length(); i++){
                int curr = a.charAt(i) - '0';
                if(curr != prev){
                    cnt++;
                    prev = curr;
                }
            }

            System.out.println("#" + t + " " + cnt);





        }

    }
}
