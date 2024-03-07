import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());

        int[] arr = new int[w+1];

        st = new StringTokenizer(bf.readLine());
        for(int i=0; i<w; i++){

            arr[i] = Integer.parseInt(st.nextToken());
        }
        int sum = 0;

        for(int i=1; i<w-1; i++){
            int left = 0;
            int right = 0;
            for(int j=0; j<i; j++){
                left = Math.max(arr[j],left);
            }
            for(int j=i+1; j<w; j++){
                right = Math.max(arr[j],right);
            }
            if(arr[i]<left && arr[i]<right){
                sum += Math.min(left,right) - arr[i];
            }
        }
        System.out.println(sum);
    }
}
