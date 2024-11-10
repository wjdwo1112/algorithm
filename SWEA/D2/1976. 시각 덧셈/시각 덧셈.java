import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        for(int t=1; t<=T; t++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            int hour = a + c;
            int minute = b + d;
            if(minute>59){
                minute = minute - 60;
                hour++;
            }
            if(hour > 12){
                hour = hour - 12;
            }
            System.out.printf("#" + t + " " +"%d %d",hour, minute);
            System.out.println();
        }
    }
}
