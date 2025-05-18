

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[][] stu = new int[n][2];
        for(int i=0; i<n; i++){
            st = new StringTokenizer(bf.readLine());
            for(int j=0; j<2; j++){
                stu[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[] g = new int[7];
        int[] b = new int[7];
        int cnt = 0;
        for(int i=0; i<n; i++){

                if(stu[i][0] == 0){
                    g[stu[i][1]]++;
                }else if(stu[i][0] == 1){
                    b[stu[i][1]]++;
                }

        }

        for(int i=1; i<=6; i++){
            if(g[i] % k == 0){
                cnt = cnt + (g[i] / k);
            }else{
                cnt = cnt + ((g[i] / k) + 1);
            }
        }
        for(int i=1; i<=6; i++){
            if(b[i] % k == 0){
                cnt = cnt + (b[i] / k);
            }else{
                cnt = cnt + ((b[i] / k) + 1);
            }
        }

        System.out.println(cnt);

    }
}
