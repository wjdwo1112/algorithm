import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int v = Integer.parseInt(bf.readLine());
        String vote = bf.readLine();
        int Acount = 0;
        int Bcount = 0;

        for(int i=0; i<vote.length(); i++){
            char c = vote.charAt(i);
            if(c == 'A'){
                Acount++;
            }else{
                Bcount++;
            }
        }

        if(Acount > Bcount){
            System.out.println('A');
        }else if(Bcount > Acount){
            System.out.println('B');
        }else{
            System.out.println("Tie");
        }
    }
}
