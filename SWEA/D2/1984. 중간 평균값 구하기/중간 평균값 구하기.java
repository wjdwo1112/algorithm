import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        for(int t=1; t<=T; t++){
            int[] arr = new int[10];
            StringTokenizer st = new StringTokenizer(bf.readLine());
            for(int i=0; i<10; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            double sum = 0;
            for(int i=1; i<9; i++){
                sum += arr[i];
            }
            double avg = Math.round(sum / 8); //Math.round는 소수점 첫째자리에서 반올림하는 것
            int result = (int)avg;

            System.out.println("#" + t + " " + result);
        }
    }
}
