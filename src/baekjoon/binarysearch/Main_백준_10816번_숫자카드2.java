package baekjoon.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_백준_10816번_숫자카드2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(bf.readLine());
        int[] arr = new int[n];
        st = new StringTokenizer(bf.readLine(), " ");
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int m = Integer.parseInt(bf.readLine());
        st = new StringTokenizer(bf.readLine(), " ");


        for(int i=0; i<m; i++){
            int target = Integer.parseInt(st.nextToken());
            int low = lowerbound(arr,target);
            int high = upperbound(arr,target);
            sb.append(high - low).append(" ");
        }
        System.out.println(sb);

    }

    private static int lowerbound(int[]arr, int target){
        int start = 0;
        int end = arr.length;
        while(start < end){
            int mid = (start + end)/2;
            if(target <= arr[mid]){
                end = mid;
                // 하한선을 내려줘서 target 왼쪽 값들 중
                // target 이상인 것들 중 가장 작은 인덱스 탐색
            }else{
                start = mid + 1;
            }
        }
        return end;
    }

    public static int upperbound(int[]arr, int target){
        int start = 0;
        int end = arr.length;
        while(start < end){
            int mid = (start + end) / 2;
            if(target < arr[mid]){
                end = mid;
                // 하한선을 내려줫 왼쪽값들 중
                // target을 초과하는 값들 중  가장 작은 값 / 인덱스 찾기
            } else{
                start = mid + 1;

            }
        }
        return end;
    }

}
