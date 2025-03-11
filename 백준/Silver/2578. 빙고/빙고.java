

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int count ;
    static int[][] bingo;
    static int turn = 1;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        bingo = new int[5][5];


        for(int i=0; i<5; i++){
            st = new StringTokenizer(bf.readLine());
            for(int j=0; j<5; j++){
                bingo[i][j] = Integer.parseInt(st.nextToken());
            }
        }

         count = 0;

        for(int i=0; i<5; i++){
            st = new StringTokenizer(bf.readLine());
            for(int j=0; j<5; j++){
                    int n = Integer.parseInt(st.nextToken());

                    for(int k=0; k<5; k++){
                        for(int l=0; l<5; l++){
                            if(bingo[k][l] == n){
                                bingo[k][l] = 0;
                            }
                        }
                    }
                    col();
                    row();
                    diag1();
                    diag2();

                   if(count>=3){
                       System.out.println(turn);
                       return;
                   }
                   count = 0; // 초기화

                    //턴 증가
                   turn ++;
                   
            }
        }

    }

    //행 체크
    public static void col(){
        for(int i=0; i<5; i++){
            int cnt = 0;
            for(int j=0; j<5; j++){
                if(bingo[j][i] == 0){
                    cnt++;
                }
                if(cnt == 5){
                    count++;
                }
            }
        }
    }

    //행 체크
    public static void row(){
        for(int i=0; i<5; i++){
            int cnt = 0;
            for(int j=0; j<5; j++){
                if(bingo[i][j] == 0){
                    cnt++;
                }
                if(cnt == 5){
                    count++;
                }
            }
        }
    }

    // 좌측 상단 -> 우측 하단 (대각선)
    public static void diag1(){
        int cnt = 0;
        for(int i=0; i<5; i++){

            if(bingo[i][i] == 0){ //(0,0), (1,1), (2,2), (3,3), (4,4)
                cnt++;
            }
            if(cnt == 5){
                count++;
            }
        }
    }

    //우측상단 -> 좌측하단 (대각선)
    public static void diag2(){
        int cnt = 0;
        for(int i=0; i<5; i++){
            if(bingo[i][4-i] == 0){ // (0,4), (1,3), (2,2), (3,1), (4,0)
                cnt++;
            }
            if(cnt == 5){
                count++;
            }
        }
    }

}
