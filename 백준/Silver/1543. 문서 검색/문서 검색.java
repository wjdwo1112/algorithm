import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        String word = bf.readLine();

        //replace 함수 사용 -> word를 1로 치환
        str = str.replace(word,"1");
        int answer = 0;

        for(int i=0; i<str.length();i++){
            if(str.charAt(i) == '1'){
                answer++;
            }
        }
        System.out.println(answer);
     }
}