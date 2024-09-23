import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        int[] q = new int[2*n];

        for(int i=1; i<=n; i++){
            q[i] = i;
        }
        int prev_index = 1;
        int last_index = n;

        int[] arr = new int[n+1];

        for(int i=n; i>1; i--){
            arr[i] = q[prev_index];
            prev_index++;
            q[last_index + 1] = q[prev_index];
            last_index++;
            prev_index++;

        }
        for(int i=n; i>1; i--){
            System.out.print(arr[i] + " ");
        }
        System.out.print(q[prev_index]);

    }
}