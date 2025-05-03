

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
            int m = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            int[] guest = new int[n];
            st = new StringTokenizer(bf.readLine());
            for(int i=0; i<n; i++){
                guest[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(guest);

            boolean check = true;
            for(int i=0; i<n; i++){
                int guestArrival = guest[i];
                int currentMade = (guestArrival/m) * k;
                if(currentMade < i + 1){
                    check = false;
                    break;
                }
            }

            System.out.print("#" + t + " ");
            if(check){
                System.out.print("Possible");
            }else{
                System.out.print("Impossible");
            }

            System.out.println();











        }
    }
}
