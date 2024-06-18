import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());  //앨범에 수록된 곡의 개수
        int I = Integer.parseInt(st.nextToken());  //평균값
        System.out.print(A * (I-1) + 1);
    }
}