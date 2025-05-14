

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(bf.readLine());


        for(int i=0; i<n; i++){
            int[] a = new int[5];
            int[] b = new int[5];
            st = new StringTokenizer(bf.readLine());
                int c = Integer.parseInt(st.nextToken());
                a[0] = c;


                for(int j=0; j<c; j++) {
                    int e = Integer.parseInt(st.nextToken());
                    a[e]++;
                }

            st = new StringTokenizer(bf.readLine());
                int d = Integer.parseInt(st.nextToken());
                b[0] = d;

                for(int j=0; j<d; j++) {
                    int f = Integer.parseInt(st.nextToken());
                    b[f]++;
                }

            if((a[4]) != b[4]){
                if(a[4]>b[4]){
                    System.out.println("A");
                }else{
                    System.out.println("B");
                }
            }

            if(a[4] == b[4] && a[3] != b[3]){
                if(a[3] > b[3]){
                    System.out.println("A");
                }else {
                    System.out.println("B");
                }
            }

            if(a[4] == b[4] && a[3] == b[3] && a[2] != b[2]){
                if(a[2] > b[2]){
                    System.out.println("A");
                }else{
                    System.out.println("B");
                }
            }

            if(a[4] == b[4] && a[3] == b[3] && a[2] == b[2] && a[1] != b[1]){
                if(a[1] > b[1]){
                    System.out.println("A");
                }else{
                    System.out.println("B");
                }
            }

            if(a[4] == b[4] && a[3] == b[3] && a[2] == b[2] && a[1] == b[1]){
                System.out.println("D");
            }
        }
    }
}
