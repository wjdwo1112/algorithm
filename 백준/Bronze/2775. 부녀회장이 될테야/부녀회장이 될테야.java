import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        for(int i=0; i<T; i++) {
            int k = Integer.parseInt(bf.readLine());
            int n = Integer.parseInt(bf.readLine());
            int[][] arr = new int[15][15];

                for(int j=0; j<15; j++){
                    arr[j][1] = 1;
                    arr[0][j] = j;
                }

                for(int j=1; j<15; j++){
                    for(int m=2; m<15; m++){
                        arr[j][m] = arr[j-1][m] + arr[j][m-1];

                    }
                }

            System.out.println(arr[k][n]);



        }
    }
}
