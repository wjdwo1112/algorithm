

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(bf.readLine());

        for(int t=1; t<=T; t++){
            st = new StringTokenizer(bf.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            Double[] arr = new Double[n];
            String[] grade = {"A+","A0","A-","B+","B0","B-","C+","C0","C-","D0"};
            for(int i=0; i<n; i++){
                st = new StringTokenizer(bf.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int c = Integer.parseInt(st.nextToken());
                arr[i] = a*0.35 + b*0.45 + c*0.20;

            }

            double targetScore = arr[k-1];

            Arrays.sort(arr,Collections.reverseOrder());

            int rank = 0;
            for(int i=0; i<n; i++){
                if(arr[i] == targetScore){
                    rank = i;
                    break;
                }
            }
            int gradeIndex = (rank * 10) / n;
            System.out.println("#" + t + " " + grade[gradeIndex]);


        }
    }
}
