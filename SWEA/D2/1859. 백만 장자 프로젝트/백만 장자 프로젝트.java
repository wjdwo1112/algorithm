/////////////////////////////////////////////////////////////////////////////////////////////
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        for (int t = 1; t <= T; t++) {
            int n = Integer.parseInt(bf.readLine());
            int[] arr = new int[n];

            StringTokenizer st = new StringTokenizer(bf.readLine());
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            long max = arr[n-1];
            long sum = 0;

            for(int i=n-1; i>=0; i--){
                if(arr[i] < max){
                    sum += max - arr[i];

                }else{
                    max = arr[i];

                }
            }
            System.out.println("#" + t + " " + sum);


        }
    }

}
