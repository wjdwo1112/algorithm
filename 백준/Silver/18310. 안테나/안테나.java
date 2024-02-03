import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] arr = new int[n+1];
        int a = 0;
        int result = 0;
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i=1; i<=n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        if (n % 2 == 0) {
            a = n / 2;
            result = arr[a];
            System.out.println(result);
        }  else{
            a = n/2+1  ;
            result = arr[a];
            System.out.println(result);
        }



    }
}
