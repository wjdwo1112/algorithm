import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        for(int t=1; t<=T; t++){
            int n = Integer.parseInt(bf.readLine());
            int[][] snail = new int[n][n];
                    //우 하 좌 상
            int[]dx = {0,1,0,-1};
            int[]dy = {1,0,-1,0};

            // 초기 위치와 방향 설정
            int x = 0;
            int y = 0;
            int direction = 0;
            for(int i=1; i<=n * n; i++) {
                snail[x][y] = i; //현재 위치에 숫자 채우기
                //nx와 ny는 x와y의 다음 위치를 나타내는 변수
                int nx = x + dx[direction];
                int ny = y + dy[direction];

                //배열 범위 밖이거나 숫자가 채워져 있으면 방향 전환
                if(nx < 0 || nx >= n || ny < 0 || ny >= n || snail[nx][ny] != 0){
                    direction = (direction + 1) % 4; //방향 전환
                    nx = x + dx[direction];
                    ny = y + dy[direction];
                }
                x = nx;
                y = ny;
            }

            //결과 출력
            System.out.println("#" + t );
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    System.out.print(snail[i][j] + " ");
                }
                System.out.println();
            }

        }

    }
}
