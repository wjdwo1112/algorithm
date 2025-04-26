

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        for(int i=1; i<=n; i++){
            String a = String.valueOf(i);
            if(a.contains("3") || a.contains("6") || a.contains("9")) {
                for (int j = 0; j < a.length(); j++) {
                    if (a.charAt(j) == '3' || a.charAt(j) == '6' || a.charAt(j) == '9') {
                        System.out.print("-");
                    }
                }
            }else{
                System.out.print(a);
            }
            System.out.print(" ");


        }
    }
}
