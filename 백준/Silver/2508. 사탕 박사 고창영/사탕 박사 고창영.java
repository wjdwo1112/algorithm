import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());

        for(int i=0; i<t; i++){
            int result = 0;
            bf.readLine();
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            char[][] arr = new char[r][c];

            for(int j=0; j<r; j++){
                String str = bf.readLine();
                for(int k=0; k<c; k++){
                    arr[j][k] = str.charAt(k);
                }
            }
            for(int j=0; j<r; j++){
                for(int k=0; k<c; k++){
                    //가로모양
                    if(k < c-2 && arr[j][k] == '>' && arr[j][k+1] == 'o' && arr[j][k+2] == '<'){
                        result++;
                    }
                    //세로모양
                    if(j < r-2 && arr[j][k] == 'v' && arr[j+1][k] == 'o' && arr[j+2][k] == '^') {
                        result++;
                    }
                }
            }
            System.out.println(result);

        }

    }
}
