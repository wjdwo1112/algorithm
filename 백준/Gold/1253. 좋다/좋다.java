

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(bf.readLine());
        int[] arr = new int[n];
        st = new StringTokenizer(bf.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int cnt = 0;

        for(int i=0; i<n; i++){
            int target = arr[i];
            int start = 0;
            int end = n-1;
            while(start<end){
                if(start == i){
                    start++;
                    // continue로 현재 타겟 인덱스는 건너뛰기
                    // 자기 자신을 합에 쓰면 안되기 때문
                    continue;

                }
                if(end == i){
                    end--;
                    continue;
                }

                if(arr[start] + arr[end] > target){
                    end--;
                }else if(arr[start] + arr[end] < target){
                    start++;
                }else{
                    cnt++;
                    break; // 하나만 찾으면된다. 더 볼 필요 없음
                }
            }
        }
        System.out.println(cnt);
    }
}
