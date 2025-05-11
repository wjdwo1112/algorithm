

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        for(int t=1; t<=T; t++){
            String line = bf.readLine();
            int [] arr = new int[line.length()];
            for(int i=0; i<line.length(); i++){
                arr[i] = line.charAt(i) - '0';
            }

            int prev = 0;
            int cnt = 0;
            for(int i=0; i<arr.length; i++){
                if(arr[i] != prev){
                    cnt++;
                    prev = arr[i];
                }
            }
            System.out.println("#" + t + " " + cnt);

        }
    }
}
