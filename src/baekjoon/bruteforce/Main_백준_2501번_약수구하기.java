package baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2501번_약수구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());


        int cnt = 0;
        int result = 0;

        for(int i=1; i<=n; i++){
            if(n % i == 0){
                cnt++;
            }
            if(cnt == k){
                result = i;
                break;

            }
        }
        System.out.println(result);
    }

}
