
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(bf.readLine());
        for(int m=0; m<t; m++){
            int n = Integer.parseInt(bf.readLine());
            int[][] arr = new int[n][n];
            
            //배열요소 입력
            for(int i=0; i<n; i++){
                st = new StringTokenizer(bf.readLine());
                for(int j=0; j<n; j++){
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            //회전 결과 생성
            int[][] arr90 = rotate90(arr,n);
            int[][] arr180 = rotate180(arr,n);
            int[][] arr270 = rotate270(arr,n);
            
            //출력
            System.out.println("#" + (m+1));
            for(int i=0; i<n; i++){
                //각 행의 i번쨰 요소를 출력
                printRow(arr90[i]);
                System.out.print(" ");
                printRow(arr180[i]);
                System.out.print(" ");
                printRow(arr270[i]);
                System.out.println(" ");
            }
        }
    }
    //90도 회전
    public static int[][] rotate90(int[][] arr, int n){
        int[][] result = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                result[i][j] = arr[n-1-j][i];
            }
        }
        return result;
    }
    //180도 회전
    public static int[][] rotate180(int[][] arr, int n){
        int[][] result = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                result[i][j] = arr[n-1-i][n-1-j];
            }
        }
        return result;
    }
    //270도 회전
    public static int[][] rotate270(int[][] arr, int n){
        int[][] result = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                result[i][j] = arr[j][n-1-i];
            }
        }
        return result;
    }
    //행을 출력하는 메서드
    public static void printRow(int[] row){
        for(int i=0; i<row.length; i++){
            System.out.print(row[i]);
        }
    }
}
