import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        for(int t=1; t<=T; t++){
            int n = Integer.parseInt(bf.readLine());
            int sum = 0;
            for(int i=1; i<=n; i++){
                if(i%2 == 0){
                    sum -= i;
                }else{
                    sum += i;
                }
            }
            System.out.println("#" + t + " " + sum);
        }
    }
}