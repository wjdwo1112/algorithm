import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        //풀이
        // 배열을 만들어서 그 안에 크로아티아 알파벳을 넣어준다.
        // 그 다음 입력받은 문자열에 contains()함수를 사용하여 배열 안 알파벳들이 있는지 확인한다.
        // 있다고 확인되면 알파벳들을 특수문자 ! 로 변환한다.
        // 변환된 입력받은 문자열의 길이를 출력해준다.
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] croatia = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        String word = bf.readLine();
        for(int i=0; i< croatia.length;i++){
            if(word.contains(croatia[i])){
                word = word.replace(croatia[i],"!");
            }
        }
        System.out.println(word.length());




    }
}
