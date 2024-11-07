import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        //10개짜리 크기의 배열을 만들고 각 숫자가 나올때마다 카운트를 해준다.
        for(int t=1; t<=T; t++){
            int n = Integer.parseInt(bf.readLine());
            boolean[] seenDigits = new boolean[10];// 0~9까지 숫자가 나왔는지 체크할 배열
            int i = 1;
            int cnt = 0; // 현재까지 본 고유 숫자의 개수
            int a = 0; // 마지막으로 센 양 번호

            //모든 숫자가 나올때 까지 반복
            while(cnt < 10){
                a = i * n;
                String s = String.valueOf(a);

                //각 자리의 숫자를 seenDigits에 체크
                for(int j=0; j<s.length(); j++){
                    int digit = s.charAt(j)- '0'; // 문자 숫자를 정수로 변환
                    if(!seenDigits[digit]) //
                    {
                        seenDigits[digit] = true;
                        cnt++;
                    }

                }
                i++; //다음 배수로 이동
            }
            System.out.println("#" + t + " " + a);
        }
    }
}
