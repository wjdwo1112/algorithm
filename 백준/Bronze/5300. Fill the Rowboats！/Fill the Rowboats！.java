import java.io.*;


 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());

        for (int n = 1; n <= N; n++){
            str.append(n + " ");
            if(n%6 == 0 || n == N)
                str.append("Go! ");
        }

        System.out.print(str);
        br.close();
    }
}