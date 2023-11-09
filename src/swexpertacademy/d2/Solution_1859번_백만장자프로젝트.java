package swexpertacademy.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1859번_백만장자프로젝트 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(bf.readLine());

        for(int i=1; i<=T; i++){
            int n = Integer.parseInt(bf.readLine());
            int[] price = new int[n];
            long max = 0;
            long money = 0;
            StringTokenizer st = new StringTokenizer(bf.readLine());
            for(int j=0; j<n; j++){
                price[j] = Integer.parseInt(st.nextToken());
            }

            for(int k=n-1; k>=0; k--){
                if(price[k] > max){
                    max = price[k];

                }
                if(price[k] < max){
                    money = money + (max - price[k]);
                }
            }

            System.out.println("#"+ i + " "+ money);
        }
    }
}
