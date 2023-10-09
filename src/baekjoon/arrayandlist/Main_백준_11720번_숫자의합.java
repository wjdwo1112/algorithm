package baekjoon.arrayandlist;


import java.io.IOException;
import java.util.Scanner;


public class Main_백준_11720번_숫자의합 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String input = sc.next();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += input.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}
