import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        int sum = 0;
        int min = 100 ;
        int[] ans = new int[10];
        int[] sub = new int[10];
        int cnt = 0;

        for(int i=0; i<10; i++){
            arr[i] = Integer.parseInt(bf.readLine());
            sum += arr[i];
            ans[i] = sum;
            sub[i] = 100 - ans[i];
            if(min >= Math.abs(sub[i])){
                min = sub[i];
                cnt = i;
            }





        }
        System.out.println(ans[cnt]);

    }
}
