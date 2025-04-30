

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        for(int t=1; t<=10; t++){
            int n = Integer.parseInt(bf.readLine());
            char[][] arr = new char[8][8];
            for(int i=0; i<8; i++){
                st = new StringTokenizer(bf.readLine());
                String line = st.nextToken();
                for(int j=0; j<8; j++){
                    arr[i][j] = line.charAt(j);
                }
            }
            int result = 0;
            //행 회문 검사
            for(int i=0; i<8; i++){
                for(int j=0; j<=8-n; j++){
                    int cnt = 0;
                    for(int k=0; k<n/2; k++){
                     if(arr[i][j+k] == arr[i][j+n-1-k]){
                         cnt++;
                     }
                    }
                    if(cnt == n/2){
                        result++;
                    }
                }
            }

            //열 회문 검사
            for(int j=0; j<8; j++){
                for(int i=0; i<=8-n; i++){
                    int cnt = 0;
                    for(int k=0; k<n/2; k++){
                        if(arr[i+k][j] == arr[i+n-1-k][j]){
                            cnt++;
                        }
                    }
                    if(cnt == n/2){
                        result++;
                    }
                }
            }
            System.out.println("#" + t + " " + result);
        }
    }
}
