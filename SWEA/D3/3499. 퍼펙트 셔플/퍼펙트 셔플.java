

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
            int n = Integer.parseInt(bf.readLine());
            String[] arr = new String[n];
            st = new StringTokenizer(bf.readLine());
            for(int i=0; i<n; i++){
                arr[i] = st.nextToken();
            }


            System.out.print("#" + t + " ");
            if(n % 2 == 0){
                int a = n / 2;
                String[] dec1 = new String[a];
                String[] dec2 = new String[a];
                for(int i=0; i<a; i++){
                    dec1[i] = arr[i];
                    dec2[i] = arr[i+a];
                }
                for(int i=0; i<a; i++){
                    System.out.print(dec1[i] + " ");
                    System.out.print(dec2[i] + " ");
                }
					System.out.println();
            }else{
                int a = n / 2 + 1;
                int b = n / 2 ;
                String[] dec1 = new String[a];
                String[] dec2 = new String[b];
                for(int i=0; i<a; i++){
                    dec1[i] = arr[i];
                }
                for(int i=0; i<b; i++){
                    dec2[i] = arr[i+a];
                }
                for(int i=0; i<a; i++){
                    System.out.print(dec1[i] + " ");
                    if(i==a-1){
                        break;
                    }
                    System.out.print(dec2[i] + " ");
                }
                System.out.println();
            }
        }
    }
}
