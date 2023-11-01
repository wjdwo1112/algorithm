package swexpertacademy.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1204번_최빈수구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(bf.readLine());
        for(int tc=1; tc<=T; tc++) {
            int n = Integer.parseInt(bf.readLine());

            int[] arr = new int[101];
            int score = 0;
            st = new StringTokenizer(bf.readLine(), " ");
            for (int i = 0; i < 1000; i++) {
                score = Integer.parseInt(st.nextToken());
                arr[score]++;
            }
            int max = 0;
            int result = 0;
            for (int i= 0; i <= 100; i++) {

                if (max <= arr[i]) {
                    max = arr[i];
                    result = i;
                }
            }

            System.out.println("#"+ tc +" "+result);

        }




    }
}
