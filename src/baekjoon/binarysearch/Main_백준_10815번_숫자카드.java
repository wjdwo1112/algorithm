package baekjoon.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_백준_10815번_숫자카드 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(bf.readLine());

        st = new StringTokenizer(bf.readLine(), " ");


        Arrays.sort(arr);

        for (int i = 0; i < m; i++) {
                int target = Integer.parseInt(st.nextToken());
                int start = 0;
                int end = n - 1;
                boolean find = false;
                while (start <= end) {
                    int mid = (start + end) / 2;
                    if (arr[mid] > target) {
                        end = mid - 1;
                    } else if (arr[mid] < target) {
                        start = mid + 1;
                    } else {
                        find = true;
                        break;
                    }
                }
                if (find) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }

            }
        }
    }

