import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] arr = new int[n+1];
        for(int i=1; i<=n; i++){
            arr[i] = i;
        }
        int cnt = 1;
        int sum = 1;
        int start = 1;
        int end = 1;
        while(end < n){
            if(sum == n){
                cnt++;
                end++;
                sum = sum + arr[end];
            }else if(sum > n){
                sum = sum - arr[start];
                start++;
            }else if(sum < n){
                end++;
                sum = sum + arr[end];
            }
        }
        System.out.println(cnt);
    }
}
