

import java.util.Scanner;

public class Solution {
    static int b,c;
    static int answer;
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        for(int t=1; t<=10; t++) {
            int a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();

            answer = 1;

            square(0);
            System.out.println("#" + t + " " + answer);
        }
    }

    public static void square(int idx){

        if(idx == c){

            return;
        }
        answer = answer * b;
        square(idx+1);
    }
}
