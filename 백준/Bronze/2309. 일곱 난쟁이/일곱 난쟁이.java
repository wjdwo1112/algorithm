import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];

        int sum = 0;
        int a = 0;
        int b = 0;
        for(int i=0; i<9; i++){
            arr[i] = Integer.parseInt(bf.readLine());
            sum += arr[i];
        }
        for(int i=0; i<8; i++) {
            for (int j = i + 1; j < 9; j++) {

                if (sum - arr[i] - arr[j] == 100) {
                    a = i;
                    b = j;
                    break;

                }
            }
            Arrays.sort(arr);
        }

        for(int i=0; i<9; i++){
            if(i==a || i==b) {
                continue;
            }
            System.out.println(arr[i]);

        }


    }
}


