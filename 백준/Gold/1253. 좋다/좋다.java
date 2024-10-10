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
        long[] arr = new long[n];

        st = new StringTokenizer(bf.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(arr);
        int cnt = 0;

        for(int i=0; i<n; i++){
            int start = 0;
            int end = n-1;

            while(start < end){
                if(arr[start] + arr[end] == arr[i]){
                    if(start != i && end != i){
                        cnt++;
                        break;
                    }else if(start == i){
                        start++;
                    }else if(end == i){
                        end--;
                    }
                }else if(arr[start] + arr[end] < arr[i]){
                    start++;
                }else{
                    end--;
                }
            }
        }
        System.out.println(cnt);
    }
}
