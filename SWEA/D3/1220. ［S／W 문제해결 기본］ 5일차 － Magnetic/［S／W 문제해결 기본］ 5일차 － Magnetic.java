import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        for(int t=1; t<=10; t++){
            int[][] arr = new int[100][100];

            int n = Integer.parseInt(bf.readLine());

            for(int i=0; i<100; i++){
                StringTokenizer st = new StringTokenizer(bf.readLine());
                for(int j=0; j<100; j++){
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int cnt = 0;

            for(int j=0; j<100; j++){
                boolean check = false;
                for(int i=0; i<100; i++){
                    if(arr[i][j] == 1){
                        check = true;
                    }
                    if(check == true && arr[i][j] == 2){
                        cnt ++;
                        check = false;
                    }
                }
            }
            System.out.println("#" + t + " " + cnt);
        }
    }
}
