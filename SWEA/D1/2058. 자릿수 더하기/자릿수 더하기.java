

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        String a = String.valueOf(N);
        int sum = 0;
        for(int i=0; i<a.length(); i++){
            int c = a.charAt(i) -'0';
            sum += c;
        }
        System.out.println(sum);

    }
}
