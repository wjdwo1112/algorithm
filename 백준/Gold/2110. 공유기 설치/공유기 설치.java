import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//이분탐색, 매개변수 탐색
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(bf.readLine());
        }
        Arrays.sort(arr);

        int start = 1;
        int end = arr[n-1] - arr[0]; //최대간격
        int result = 0;
        while(start <= end) {
            int mid = start + (end - start)/2; // 집 사이 거리 -> 조절할 변수
            int position = 0;
            int cnt = 1; // 첫번째 공유기
            //공유기 설치 작업
            for(int i=1; i<n; i++){
                if(arr[i] - arr[position] >= mid){
                    position = i;
                    cnt++;
                }
            }
            if(cnt >= c){ // 설치될 공유기보다 많이 설치함 -> 오른쪽을 이동해 더 긴 간격 찾기
                result = mid;

                // 최적의 해를 위해 간격을 넗혀본다
                start = mid +1;
            }else if(cnt < c){ // 공유기를 c보다 적게 설치 -> 왼쪽으로 이동해 더 짧은 간격 찾기
                end = mid - 1; // 간격 좁히기
            }

        }
        System.out.println(result);
    }
}
