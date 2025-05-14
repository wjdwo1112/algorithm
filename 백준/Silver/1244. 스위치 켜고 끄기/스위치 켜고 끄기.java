

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(bf.readLine());
        int[] swi = new int[n+1];

        st = new StringTokenizer(bf.readLine());
        for(int i=1; i<=n; i++){
            swi[i] = Integer.parseInt(st.nextToken());
        }

        int k = Integer.parseInt(bf.readLine());
        int[] stu = new int[k];
        int[] stuSwi = new int[k];
        for(int i=0; i<k; i++){
            st = new StringTokenizer(bf.readLine());

             stu[i] = Integer.parseInt(st.nextToken());
            stuSwi[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<k; i++){

                if(stu[i] == 1){
                   for(int j=stuSwi[i]; j<=n; j+=stuSwi[i]){
                       if(swi[j] == 1){
                           swi[j] = 0;
                       }else if(swi[j] == 0){
                           swi[j] = 1;
                       }
                   }
                }

                if(stu[i] == 2){
                    int left = stuSwi[i] - 1;
                    int right = stuSwi[i] + 1;

                    swi[stuSwi[i]] = 1 - swi[stuSwi[i]]; // 자기 자신 먼저 토글

                    while(left>=1 && right <=n && swi[left] == swi[right]){
                        swi[left] = 1 - swi[left]; // 스위치 상태 토글
                        swi[right] = 1 - swi[right]; // 스위치 상태 토글
                        left--;
                        right++;
                    }
                }



        }

            for (int i = 1; i <= n; i++) {
                System.out.print(swi[i] + " ");
                if(i%20==0){
                    System.out.println();
                }
            }



    }
}
