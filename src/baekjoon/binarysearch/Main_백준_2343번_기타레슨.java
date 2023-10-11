package baekjoon.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2343번_기타레슨 {
    public static void main(String[] args) throws IOException {


    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(bf.readLine());

    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    int[] arr = new int[n];
    int start = 0;
    int end = 0;
    st = new StringTokenizer(bf.readLine(), " ");
    for(int i=0; i<n; i++){
        arr[i] = Integer.parseInt(st.nextToken());
        start = Math.max(start,arr[i]); // 블루레이에 최소 하나 이상이 담겨야 하기 때문에 제일 큰 블루레이가 시작이 된다.
        end += arr[i];  // 모든 블루레이 크기의 합
    }

    while(start <= end) {
        int mid = (start + end) / 2;
        int sum = 0;
        int cnt = 0;

        for (int i = 0; i < n; i++){

            if (sum + arr[i]> mid) { // 합이 mid값보다 커지면 카운트를 1 증가시켜준다.
                sum = 0;
                cnt++;
            }
            sum += arr[i];
            }
            if(sum > 0) cnt++;   // 마지막 블루레이 필요하므로 +1

            if(cnt > m){
                start = mid+1;     // m보다 cnt 가 많으면 블루레이의 개당 크기가 늘어나야 하므로 하한선 올리기
            }else{
                end = mid-1;     // m보다 cnt가 적으면 블루레이의 개당 크기가 작아져야 하므로 상한선 올리기
            }
        }
        System.out.println(start);
    }
}

