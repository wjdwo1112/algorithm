

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());

        for(int t=1; t<=T; t++){
            String word = bf.readLine();
            int a = word.length();

            int cnt = 0;
            for(int i=0; i<a/2; i++){
                if(word.charAt(i) == word.charAt(a-1-i)){
                    cnt++;
                }
            }
                if(cnt == a/2){
                    System.out.println("#" + t + " " + 1);
                }else{
                    System.out.println("#" + t + " " + 0);
                }

        }
    }
}
