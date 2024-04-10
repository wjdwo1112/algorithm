import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main  {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(bf.readLine());
        String answer = "";

        for (int i = 0; i < num; i++) {
            String str = bf.readLine();

            if (str.contains("S")){
                answer = str;
            }
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}