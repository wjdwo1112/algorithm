
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] dx = {-1, 0, 1, 0};  // 북, 동, 남, 서
        int[] dy = {0, 1, 0, -1};

        st = new StringTokenizer(bf.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int dir = Integer.parseInt(st.nextToken());

        int[][] map = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(bf.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int result = 0;

        while (true) {
            // 1. 현재 칸 청소
            if (map[x][y] == 0) {
                map[x][y] = 2;  // 청소 완료
                result++;
            }

            boolean found = false;

            // 2. 왼쪽부터 탐색
            for (int i = 0; i < 4; i++) {
                dir = (dir + 3) % 4; //왼쪽으로 회전
                int nx = x + dx[dir];
                int ny = y + dy[dir];

                // 경계 체크 및 청소 여부 확인
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && map[nx][ny] == 0) { //청소 안한 곳 발견
                    x = nx;
                    y = ny;
                    found = true;
                    break; // 새로운 위치로 이동했으니 탐색 종료
                }
            }

            // 3. 네 방향 모두 불가
            if (!found) {
                int backDir = (dir + 2) % 4; // 현재 방향 기준 뒤쪽
                int bx = x + dx[backDir];
                int by = y + dy[backDir];

                // 경계 체크 및 벽 체크
                if (bx < 0 || bx >= n || by < 0 || by >= m || map[bx][by] == 1) {
                    break;  // 벽이면 종료
                }

                //뒤로 한칸 이동(방향 유지)
                x = bx;
                y = by;
            }
        }

        System.out.println(result);

    }
}
