import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main (String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        int[] arr = new int[1001];
        // 왼쪽 최고 기둥
        int[] prefix_max = new int [1002];
        //오른쪽 최고 기둥
        int[] suffix_max = new int [1002];
        ///StringTokenizer st = new StringTokenizer(bf.readLine()," ");
        //입력
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine()," ");
            arr[Integer.parseInt(st.nextToken())] = Integer.parseInt(st.nextToken());
        }

        //왼쪽 최고 기둥 구하기
        for(int i=1; i<1001; i++){
            prefix_max[i] = Math.max(prefix_max[i-1],arr[i]);
        }
        //오른쪽 최고 기둥 구하기
        for(int i=1000; i>0; i--){
            suffix_max[i] = Math.max(suffix_max[i+1],arr[i]);
        }
        int sum = 0;
        //왼쪽 기둥과 오른쪽 기둥 중에서 낮은 값 구하기 => 지붕
        for(int i=1; i<1001; i++){
            sum += Math.min(prefix_max[i],suffix_max[i]);
        }
        System.out.println(sum);



    }
}
