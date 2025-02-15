
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int x = Integer.parseInt(bf.readLine());
        Arrays.sort(arr);

        int cnt = 0;
        int start = 0;
        int end = n-1;
        while(start < end){
            if(arr[start]+arr[end] > x){
                end--;
            }else if(arr[start]+arr[end] < x){
                start++;
            }else{
                cnt++;
                start++;
                end--;
            }
        }
        System.out.println(cnt);
    }
}
