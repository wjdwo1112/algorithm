package baekjoon.twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_백준_3273번_두수의합 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;
        int n = Integer.parseInt(bufferedReader.readLine());

        int[] Arr = new int[n];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        for (int i = 0; i < n; i++) {
            Arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        int x = Integer.parseInt(bufferedReader.readLine());
        Arrays.sort(Arr);
        int cnt = 0;
        int left = 0;
        int right = n-1;


        while (left<right) {

            if (Arr[left] + Arr[right] == x) {
                cnt++;
                right--;
                left++;
            } else if (Arr[left] + Arr[right] > x) {
                right--;
            } else if (Arr[left] + Arr[right] < x) {
                left++;
            }
        }
        System.out.println(cnt);
    }
}
