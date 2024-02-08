import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(bf.readLine());
        int[] arr = new int [n];
        st = new StringTokenizer(bf.readLine(), " ");
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());

        }
        int x = Integer.parseInt(bf.readLine());

        Arrays.sort(arr);

        int start = 0;
        int end = n-1;
        int cnt = 0;

        while(start<end){
            int sum = arr[start] + arr[end];
            if(sum > x){
                end = end-1;

            }else if(sum < x){
                start = start+1;

            }if(sum == x){
                cnt++;
                end--;
                start++;
            }

        }
        System.out.println(cnt);
    }
}
