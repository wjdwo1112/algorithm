import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        for(int t=1; t<=10; t++){
            int a = Integer.parseInt(bf.readLine());
            char[][] arr = new char[8][8];

            for(int i=0; i<8; i++){
                StringTokenizer st = new StringTokenizer(bf.readLine());
                String line = st.nextToken();
                for(int j=0; j<8; j++){
                    arr[i][j] = line.charAt(j);
                }
            }

            int cnt = 0;

            // 행 회문 검사
            for(int i=0; i<8; i++){
                for(int j=0; j<=8-a; j++){
                    boolean isPalindrome = true;
                    for(int k=0; k<a/2; k++) {
                        if(arr[i][j+k] != arr[i][j+ (a-1-k)]){
                            isPalindrome = false;
                            break;
                        }
                    }
                    if(isPalindrome){
                        cnt++;
                    }
                }
            }

            //열 회문 검사
            for(int j=0; j<8; j++){
                for(int i=0; i<=8-a; i++){
                    boolean isPalindrome = true;
                    for(int k=0; k<a/2; k++) {
                        if(arr[i+k][j] != arr[i+(a-1-k)][j]){
                            isPalindrome = false;
                            break;
                        }
                    }
                    if(isPalindrome){
                        cnt++;
                    }
                }
            }

            System.out.println("#" + t + " " + cnt);

        }
    }
}
