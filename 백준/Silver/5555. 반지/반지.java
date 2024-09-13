import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        //풀이
        //시작과 끝이 연결된 반지 모양이기 때문에 입력받은 문자열을 이어붙여준다.
        //입력받은 횟수만큼 반복문을 돌리면서 입력받은 문자열 뒤에 동일한 문자열을 한번 더 더해보고
        //contains 함수를 이용하여 특정 문자열이 있는지 확인하고 있으면 횟수를 더해준다.
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String find = bf.readLine();
        int n = Integer.parseInt(bf.readLine());
        int cnt = 0;
        for(int i=0; i<n; i++){
            String word = bf.readLine();
            word += word;
            if(word.contains(find)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}