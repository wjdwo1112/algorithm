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

        int m = Integer.parseInt(bf.readLine());
        st = new StringTokenizer(bf.readLine());
        for(int i=0; i<m; i++){
            boolean find = false;
            int target = Integer.parseInt(st.nextToken());
            int start = 0;
            int end = n-1;
            while(start<=end){
                int mid = (start+end)/2;
                if(arr[mid] > target){
                    end = mid - 1;
                }else if(arr[mid] < target){
                    start = mid + 1;
                }else{
                    find = true;
                    break;
                }
            }
            if(find){
                System.out.println(1);
            }else{
                System.out.println(0);
            }

        }


    }
}
