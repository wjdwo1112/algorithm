

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
            int n = Integer.parseInt(bf.readLine());
            int[][] arr = new int[n][n];
            for(int i=0; i<n; i++){
                st = new StringTokenizer(bf.readLine());
                for(int j=0; j<n; j++){
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }

            }
            int[][] rotated90 = turn90(arr);
            int[][] rotated180 = turn180(arr);
            int[][] rotated270 = turn270(arr);

            System.out.println("#" + t);
            for(int i=0; i<n; i++){

                for(int j=0; j<n; j++){
                    System.out.print(rotated90[i][j]);

                }
                System.out.print(" ");
                for(int j=0; j<n; j++){
                    System.out.print(rotated180[i][j]);
                }
                System.out.print(" ");

                for(int j=0; j<n; j++){
                    System.out.print(rotated270[i][j]);
                }

                System.out.println();
            }


        }
    }
    public static int[][] turn90(int[][] arr){
        int a = arr.length;
        int [][] New = new int[a][a];
        for(int i=0; i<a; i++){
            for(int j=0; j< a; j++){
                New[j][a-1-i] = arr[i][j];
            }
        }
        return New;
    }
    public static int[][] turn180(int[][] arr){
        int a = arr.length;
        int [][] New = new int[a][a];
        for(int i=0; i<a; i++){
            for(int j=0; j<a; j++){
                New[a-1-i][a-1-j] = arr[i][j];
            }
        }
        return New;
    }
    public static int[][] turn270(int[][] arr){
        int a = arr.length;
        int [][] New = new int[a][a];
        for(int i=0; i<a; i++){
            for(int j=0; j<a; j++){
                New[a-1-j][i] = arr[i][j];
            }
        }
        return New;
    }
}
