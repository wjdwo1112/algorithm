

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(bf.readLine());
        for(int t=1; t<=T; t++){
            int[][] arr = new int[9][9];
            for(int i=0; i<9; i++){
                st = new StringTokenizer(bf.readLine());
                for(int j=0; j<9; j++){
                    arr[i][j] = Integer.parseInt(st.nextToken());

                }
            }


            int result = 0;

            //행 검사
            for(int i=0; i<9; i++){
                boolean[] check = new boolean[10];
                int cnt = 0;
                for(int j=0; j<9; j++){
                    if(check[arr[i][j]] == true){
                        cnt++;
                        break;
                    }
                    check[arr[i][j]] = true;

                }
                if(cnt != 0)break;
                result++;
            }

            // 열 검사
            for(int j=0; j<9; j++){
                boolean[]check = new boolean[10];
                int cnt = 0;
                for(int i=0; i<9; i++){
                    if(check[arr[i][j]] == true){
                        cnt++;
                        break;
                    }
                    check[arr[i][j]] = true;
                }
                if(cnt !=0) break;
                result++;
            }

            //3x3 검사
            for(int i=0; i<9; i+=3){
                for(int j=0; j<9; j+=3){
                    boolean[] check = new boolean[10];
                    int cnt = 0;
                    for(int k=0; k<3; k++){
                        for(int l=0; l<3; l++){
                            if(check[arr[k+i][l+j]] == true){
                                cnt++;
                                break;
                            }
                            check[arr[k+i][j+l]] = true;
                        }
                        if(cnt != 0) break;

                    }
                    if(cnt == 0) {
                        result++;
                    }
                }
            }
            if(result == 27){
                System.out.println("#" + t + " " + 1);
            }else{
                System.out.println("#" + t + " " + 0);
            }

        }
    }
}
