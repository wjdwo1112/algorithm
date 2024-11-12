import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        for(int t=1; t<=10; t++){
            int n = Integer.parseInt(bf.readLine());

            int[] arr = new int[n];
            StringTokenizer st = new StringTokenizer(bf.readLine());

            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int cnt = 0;

            for(int i=2; i<n-2; i++) {
                int leftMax = Math.max(arr[i-1],arr[i-2]); //arr[i] 기준 왼쪽 최대값(i-2까지)
                int rightMax = Math.max(arr[i+1],arr[i+2]); // arr[i] 기준 오른쪽 최대값(i+2까지)
                int max = Math.max(leftMax,rightMax);
                if(arr[i] > max){ // arr[i] 에서 뺀 값이 2이상이면
                    cnt = cnt + (arr[i] - max); // 왼쪽 최대값과 오른쪽 최대값중 더 큰걸 뺸걸 더해준다.
                }

            }
            System.out.println("#" + t + " " + cnt);
        }
    }
}
