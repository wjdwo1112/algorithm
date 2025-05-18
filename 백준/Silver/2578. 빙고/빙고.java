
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
   static int[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;

        arr = new int[5][5];
        for(int i=0; i<5; i++){
            st = new StringTokenizer(bf.readLine());
            for(int j=0; j<5; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        int find = 0;
        for(int i=0; i<5; i++){
            st = new StringTokenizer(bf.readLine());
            for(int j=0; j<5; j++){
                int a = Integer.parseInt(st.nextToken());
                find++;
                for(int x=0; x<5; x++){
                    for(int y=0; y<5; y++){
                        if(arr[x][y] == a){
                            arr[x][y] = 0;
                        }
                    }
                }

                int z = checkA(arr);
                int x = checkB(arr);
                int c = checkC(arr);
                int v = checkD(arr);
                if(z+x+c+v >= 3){
                    System.out.println(find);
                    return;
                }
            }
        }


    }
    public static int checkA(int[][] arr){
        int count = 0;
        for(int i=0; i<5; i++){
            int cnt = 0;
            for(int j=0; j<5; j++){
                if(arr[i][j] == 0){
                    cnt++;
                }

            }
            if(cnt == 5){
                count++;
            }
        }
        return count;
    }
    public static int checkB(int[][] arr){
        int count = 0;
        for(int i=0; i<5; i++){
            int cnt = 0;
            for(int j=0; j<5; j++){
                if(arr[j][i] == 0){
                    cnt++;
                }

            }
            if(cnt == 5){
                count++;
            }
        }
        return count;
    }

    public static int checkC(int[][] arr){
        int count = 0;
        int cnt = 0;
       for(int i=0; i<5; i++){
           if(arr[i][i] == 0)cnt++;
       }
       if(cnt == 5)count++;

       return count;
    }

    public static int checkD(int[][] arr){
        int count = 0;
        int cnt = 0;
        for(int i=0; i<5; i++){
            if(arr[i][4-i] == 0)cnt++;
        }
        if(cnt == 5)count++;

        return count;
    }




}
