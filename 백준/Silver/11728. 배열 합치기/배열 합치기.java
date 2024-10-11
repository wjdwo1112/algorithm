import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException,IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

       int[] arr = new int[n+m];

       st = new StringTokenizer(bf.readLine());
           for(int i=0; i<n; i++){
               arr[i] = Integer.parseInt(st.nextToken());
           }

        st = new StringTokenizer(bf.readLine());
        for(int i=n; i<n+m; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0; i<arr.length; i++) {
            bw.write(arr[i] + " ");
        }
        bw.flush();
        bw.close();
    }
}