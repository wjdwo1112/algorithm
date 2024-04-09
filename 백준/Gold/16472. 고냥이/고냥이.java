import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
//        end를 기준으로 반복문 시작
//        알파뱃 배열의 값이 0이면? (새로운 알파벳이면?) 카운팅 + 1
//        만약, 카운팅 변수가 N 보다 크면 작거나 같을 때 까지 start 변수 + 1
//        start 위치에 있는 알파벳 배열이 0이되면? 카운팅 변수 - 1
//        결과 값 중 큰 것 선택 (Math.max)
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] alphabet = new int[26];
        int n = Integer.parseInt(bf.readLine());
        String str = bf.readLine();

        int start = 0;
        int end = 0;
        int cnt = 1;
        int max = 0;


        alphabet[str.charAt(end)-'a']++;
        while(end < str.length()){
            if(cnt<=n){
                max = Math.max(max,end-start+1);
            }
            if(cnt <= n) {
                end++;
                if(end<str.length()){
                char charend = str.charAt(end);
                if (alphabet[charend - 'a'] == 0) {
                    cnt++;
                }
                alphabet[charend - 'a']++;
            }

            }else{
                char charstart = str.charAt(start);
                alphabet[charstart-'a']--;
                if(alphabet[charstart-'a'] == 0){
                    cnt--;

                }
                start++;
            }
        }
        System.out.println(max);

    }
}
