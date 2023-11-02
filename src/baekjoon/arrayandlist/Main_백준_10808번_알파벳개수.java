package baekjoon.arrayandlist;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_백준_10808번_알파벳개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        int[] arr = new int[26];
        for(int i=0; i<s.length(); i++){
          arr[(int)s.charAt(i)-'a']++;

        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
