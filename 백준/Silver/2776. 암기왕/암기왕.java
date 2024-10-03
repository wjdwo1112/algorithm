import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st ;
        int T = Integer.parseInt(bf.readLine());
        for(int i=0; i<T; i++){
            int n = Integer.parseInt(bf.readLine());
            int[] arr = new int[n];
            st = new StringTokenizer(bf.readLine());
            for(int j=0; j<n; j++){
                arr[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            int m = Integer.parseInt(bf.readLine());
            st = new StringTokenizer(bf.readLine());
            for(int k=0 ; k<m; k++){
                boolean find = false;
                int target = Integer.parseInt(st.nextToken());
                int start = 0;
                int end = n-1;
                while(start <= end){
                    int mid = (start + end) / 2;
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
                    bw.write(1 + "\n");
                }else{
                    bw.write(0 + "\n");
                }

            }
        }
        bw.flush();
        bw.close();
    }
}
