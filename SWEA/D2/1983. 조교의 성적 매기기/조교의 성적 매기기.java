import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(bf.readLine());

        String[] score = new String[]{"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};

        for(int m=0; m<t; m++){
             st = new StringTokenizer(bf.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken()) - 1; // 배열은 0부터 시작이라 입력값 들어갈때 1빼준다
            Double [] arr = new Double[n];
            double targetscore = 0;

            for(int i=0; i<n; i++){
                st = new StringTokenizer(bf.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int c = Integer.parseInt(st.nextToken());
                double total = a * 0.35 + b * 0.45 + c * 0.2;
                arr[i] = total;
                if(i == k){
                    targetscore = total; // k번쨰 학생의 점수 저장
                }
            }
            Arrays.sort(arr, Collections.reverseOrder()); //내림차순 정렬

            //k번째 학생 순위 계산
            int rank = 0;
            for(int i=0; i<n; i++){
                if(arr[i] == targetscore){
                    rank = i;
                    break;
                }
            }
            //등급 비율에 따를 인덱스 계산
            int gradeIndex = (rank * 10) / n;
            System.out.printf("#%d %s%n", m+1, score[gradeIndex]);



        }

    }
}
