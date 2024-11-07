import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        //거슬러야 하는 돈들 목록
        int[] money = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
        for(int t=1; t<=T; t++){
            int n = Integer.parseInt(bf.readLine());
            //거스른 돈들이 얼마만큼 사용되었는지 확인하는 목록
            int[] change = new int[8];
            for(int i=0; i<8; i++){
                //먼저 잔돈 배열에 얼마를 썼는지 n을 나눈 몫을 넣는다.
                change[i] = n / money[i];
                //그리고 n에다 n을 money[i]로 나눈 나머지들로 다시 업데이트 해준다.
                n = n % money[i];
            }

            //출력
            System.out.println("#" + t);
            for(int i=0; i<8; i++){
                System.out.print(change[i] + " ");

            }
            System.out.println();
        }
    }
}

