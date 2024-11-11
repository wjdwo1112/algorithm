import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        for(int t=1; t<=10; t++){

           	int a = Integer.parseInt(bf.readLine());
            int[][] arr = new int[100][100];
            for(int i=0; i<100; i++){
                StringTokenizer st = new StringTokenizer(bf.readLine());
                for(int j=0; j<100; j++){
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }



            int rowMax = 0;
            int colMax = 0;
            int diag1Sum = 0;
            int diag2Sum = 0;

            //행 ,열 합 최대값구하기
            for(int i=0; i<100; i++){
                int rowSum = 0;
                int colSum = 0;

                for(int j=0; j<100; j++){
                    rowSum += arr[i][j]; //행 합
                    colSum += arr[j][i]; // 열 합
                }
                rowMax = Math.max(rowSum,rowMax); //  행 최대값
                colMax = Math.max(colSum,colMax); // 열 최대값
				
                //대각선 합 계산
                diag1Sum += arr[i][i]; //왼쪽 상단 -> 오른쪽 하단 대각선 합
                diag2Sum += arr[i][100-1-i]; // 오른쪽 상단 -> 왼쪽 하단 대각선 합

            }

            int diagonalMax = Math.max(diag1Sum,diag2Sum); // 대각선 최대값

            int answer = Math.max(Math.max(rowMax,colMax),diagonalMax);
            System.out.println("#" + t + " " + answer);


        }
    }
}
