package baekjoon.arithmetic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main_백준_5532번_방학숙제 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(bf.readLine());
        int A = Integer.parseInt(bf.readLine());
        int B = Integer.parseInt(bf.readLine());
        int C = Integer.parseInt(bf.readLine());
        int D = Integer.parseInt(bf.readLine());



        int math = 0;
        int korean = 0;
        if(B%D == 0){
            math = B/D;
        }else if (B%D !=0){
            math = B/D+1;
        }
        if(A%C == 0 ){
            korean = A/C;
        }else if(A%C !=0){
            korean = A/C+1;
        }

        int max = Math.max(math,korean);

        int result = L - max;
        System.out.println(result);
    }
}
