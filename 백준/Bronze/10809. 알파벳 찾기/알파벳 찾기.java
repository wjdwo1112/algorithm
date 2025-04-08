import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String S = bf.readLine();

        int[] alphabet = new int[26];
        for(int i=0; i<26; i++){
            alphabet[i] = -1;
        }
        //
        for(int i=0; i<S.length(); i++){
            char c = S.charAt(i);
            if(alphabet[c-97] != -1){
                continue;
            }
            alphabet[c-97] = i;
        }

        for(int i=0; i<26; i++){
            System.out.print(alphabet[i] + " ");
        }
    }
}