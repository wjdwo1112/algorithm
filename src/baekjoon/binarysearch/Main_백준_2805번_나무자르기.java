package baekjoon.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2805번_나무자르기 {
    public static void main(String[] args) throws IOException {
        //매개변수탐색과 이분탐색 이용
        //매개변수탐색 : 조건을 만족하는 최대값을 구한다라고 생각하기
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n= Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        long[] arr = new long[n];
        long max = 0;
        st = new StringTokenizer(bf.readLine(), " ");
        for(int i=0; i<n; i++){
            arr[i] = Long.parseLong(st.nextToken());
            max = Math.max(max,arr[i]); //입력받은 나무의 길이 중에서 가장 긴 길이까지 자를 수 있다.
        }
        long start =0;
        long end = max;


        while(start <= end){
            long mid = start + (long)(end - start)/2; //설정한 절단값 길이
            long result = 0;
            long sum = 0;
            for(int i=0; i<n; i++) {
                if (arr[i] > mid) { //입력받은 나무의 길이가 중간값보다 크다면
                    result = arr[i] - mid; // 나무 길이에서 설정한 절단값을 뺴준다 -> 상근이가 가져가는 절단한 나무의 길이
                    sum += result; //상근이가 가져가는 절단한 나무의 길이의 합
                }
            }
                if(sum >= m){ // 가져가는 나무의 길이의 합이 크거나 같다면 설정해야 할 절단값이 더 커야 한다.
                    start = mid+1; // 따라서 설정해야 할 절단값의 하한선을 높여주는 작업
                }else{      // 가져가는 나무의 길이의 합이 작다면
                    end = mid-1; // 설정해야 할 절단값의 상한선을 낮혀주는 작업
                }
            }
            System.out.println(end);
        }


    }

