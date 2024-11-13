import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        for(int t=1; t<=T; t++){
            int n = Integer.parseInt(bf.readLine());
            int[][] board = new int[n][n];
            if(n == 1){
                board[0][0] = 1;
            }else {
                board[0][0] = 1;
                board[1][0] = 1;
                board[1][1] = 1;
                for (int i = 2; i < n; i++) {
                    for (int j = 1; j < n; j++) {
                        if (i == n - 1 && j == n - 1) {
                            board[i][j] = 1;
                            break;
                        }
                        board[i][0] = 1;
                        board[i][j] = board[i - 1][j - 1] + board[i - 1][j];
                    }
                }
            }
            System.out.println("#" + t);
            for(int i=0; i<n; i++){
                for(int j=0; j<=i; j++){
                    System.out.print(board[i][j]);
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
