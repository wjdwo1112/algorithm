


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());

        char[][] arr = new char[h][w];

        for(int i=0; i<h; i++){
            String s = bf.readLine();
            for(int j=0; j<w; j++){
                arr[i][j] = s.charAt(j);

            }
        }



        for(int i=0; i<h; i++){
            int cnt = -1; // 처음엔 구름이 없다고 가정
            for(int j=0; j<w; j++){
                if(arr[i][j] == 'c'){
                    System.out.print(0 + " ");
                    cnt = 1; //구름이 나타난 후 부터 카운트 시작
                } else{
                    System.out.print(cnt + " ");
                    if(cnt != -1){
                        cnt++; // 구름이 나타난적 있으면 증가
                    }
                }

            }
            System.out.println();
        }
    }
}
