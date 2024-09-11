import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    //조건
    //가장 많이 반복되 문자가 2개 이상일 경우 ?을 출력
    //대문자와 소문자의 구분은 없다.
    //출력 문자는 대문자로 한다.
    public static void main(String[] args) throws IOException {
        //풀이
        //각 문자들의 빈도수를 나타내기 위한 배열 생성
        //대문자와 소문자 구분하지 않기 때문에
        //대문자 범위 65~90, 소문자 범위 97~122 를 생각하여 조건문 작성
        //각 문자들의 빈도수의 최대값 구하기 위해 반복문 생성
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String word = bf.readLine();
        int[] upper = new int[26];

        for(int i=0; i<word.length(); i++){
            char c = word.charAt(i);
            if(65<= c&& c<=90){
                upper[c-65]++;
            }else{
                upper[c-97]++;
            }

        }
        int max = -1;
        char ch = '?';
        for(int i=0; i<26; i++){
            if(max < upper[i]){
                max = upper[i];
                ch = (char)(i+65); //대문자로 변환하기 위해 65를 더한다.
            }else if(upper[i] == max){
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}