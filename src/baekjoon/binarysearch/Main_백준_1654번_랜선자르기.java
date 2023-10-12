package baekjoon.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_1654번_랜선자르기 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        int max = 0;
        //st = new StringTokenizer(bf.readLine(), " ");
        for(int i=0; i<k; i++){
            arr[i] = Integer.parseInt(bf.readLine());
            max = Math.max(max,arr[i]);
        }

        long start = 1; // 자연수라 1부터 시작    //자료형 설정 주의 -> int 설정시 틀림 long으로 설정
        long end = max;
        //int sum = 0;
        while(start <= end){
            long mid = start + (end-start)/2;
            long result = 0;

            for(int i=0; i<k; i++){

                    result += arr[i]/mid; //길이를 mid값으로 나눈 몫만 저장

                }
                if(result >= n){  //result 값이 n보다 크다면 mid값의 길이가 작다는 뜻
                    start = mid + 1 ; // 그래서 mid값의 하한선을 높여주는 작업
                }else{             // result값이 n보다 작다면 mid값의 길이가 충분하다는 뜻
                    end = mid - 1 ; // 그래서 mid값의 상한선을 낮춰주는 작업
                }
            }

        System.out.println(end);
        //System.out.println(sum);
    }
}
