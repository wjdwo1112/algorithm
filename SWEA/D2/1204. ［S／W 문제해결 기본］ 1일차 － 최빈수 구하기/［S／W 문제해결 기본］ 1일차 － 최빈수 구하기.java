import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        for(int t=1; t<=T; t++){
            int n = Integer.parseInt(bf.readLine());
            int[] arr = new int[101];
            StringTokenizer st = new StringTokenizer(bf.readLine());
            for(int i=0; i<1000; i++){
                int score = Integer.parseInt(st.nextToken());
                arr[score]++;
            }
            int max = 0;
            int maxIndex = 0;
            for(int i=0; i<101; i++){
                if(max <= arr[i]){
                    max = arr[i];
                    maxIndex = i;
                }
            }

            System.out.println("#" + t+ " " + maxIndex);

        }
    }
}
