import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        for(int t=1; t<=10; t++){
            int T = Integer.parseInt(bf.readLine());
            char[][] arr = new char[100][100];

            for(int i=0; i<100; i++){

                String a = bf.readLine();
                for(int j=0; j<100; j++){
                    arr[i][j] = a.charAt(j);
                }
            }

            int maxlength = 1;
            //행 회문 검사
            for(int i=0; i<100; i++){
                for(int j=0; j<100; j++){
                    for(int len = 1; len + j <=100; len++) {
                        boolean isPalindrome = true;

                        for (int k = 0; k < len / 2; k++) {

                            if (arr[i][j + k] != arr[i][j + (len - k - 1)]) {
                                isPalindrome = false;
                                break;
                            }
                        }
                        if (isPalindrome) {
                            maxlength = Math.max(len, maxlength);
                        }
                    }
                }
            }
            //열 회문 검사
            for(int j=0; j<100; j++){
                for(int i=0; i<100; i++){
                    for(int len = 1; i + len <= 100; len++) {
                        boolean isPalindrome = true;

                        for (int k = 0; k < len / 2; k++) {

                            if (arr[i + k][j] != arr[i + (len - k - 1)][j]) {
                                isPalindrome = false;
                                break;
                            }
                        }
                        if (isPalindrome) {
                            maxlength = Math.max(len, maxlength);
                        }
                    }
                }
            }
            System.out.println("#" + T + " " + maxlength);
        }
    }
}
