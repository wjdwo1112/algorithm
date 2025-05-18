


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][m];

        int a = 0;
        if(n>=m){
            a = m;
        }else{
            a = n;
        }

        for(int i=0; i<n; i++){
            String line = bf.readLine();
            for(int j=0; j<m; j++) {
                arr[i][j] = line.charAt(j) - '0';
            }
        }

        int maxArea = 1;



        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                for(int size=1; size+i<n && size+j<m; size++){
                    int topLeft = arr[i][j];
                    int topRight = arr[i][j+size];
                    int bottomLeft = arr[i+size][j];
                    int bottomRight = arr[i+size][j+size];

                    if(topLeft == topRight && topLeft == bottomLeft && topLeft == bottomRight){
                        int area = (size+1) * (size + 1);
                        maxArea = Math.max(area,maxArea);
                    }
                }
            }
        }

        System.out.println(maxArea);

    }
}
