import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    //조건
    //1.각 문자가 연속해서 나타나야 한다.
    //어떤 문자가 다시 나타날때 그 문자가 중간에 끊어져서는 안된다.
    public static void main(String[] args) throws IOException {
        //풀이
        //1. 각 단어에 대해 boolean[]check 배열을 만들어서 문자의 출현을 확인
        // (단어-'a') = 인덱스 번호 예) 'a'-'a' = 97-97 -> 0번째 , 'b'-'a' = 98-97 -> 1번째
        //2. 단어의 각 문자를 순회하면서 처음 나온 문자를 check배열에서 true로 변경 (boolean배열의 초기값은 false)
        //3. 문자가 다시 나타났을 때, 이전 단어와 다르다면 그룹단어가 아니므로 카운트를 뺸다.
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int cnt = 0;
        for(int i=0; i<n; i++){
            boolean[] check = new boolean[26]; //알파벳 소문자 갯수
            String word = bf.readLine();
            for(int j=0 ; j<word.length(); j++){
                char c1 = word.charAt(j);
                if(check[c1 - 97] == false){
                    check[c1 - 97] = true;
                } else{
                    char c2 = word.charAt(j-1);
                        if(c1 != c2){
                            cnt--;
                            break;
                        }
                    }

                }
            cnt++;
            }
        System.out.println(cnt);

        }
}
