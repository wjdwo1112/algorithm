

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        for(int t=1; t<=10; t++){
            int n = Integer.parseInt(bf.readLine());
            Queue<Integer> q = new LinkedList<>();
            st = new StringTokenizer(bf.readLine());
            for(int i=0; i<8; i++){
                int a = Integer.parseInt(st.nextToken());
                q.offer(a);
            }
            int i = 1;
            while(true){
                if(i>5){
                    i = 1;
                }
                int b = q.peek() - i;
                q.poll();
                if(b <= 0 ){
                    b = 0;
                    q.offer(b);
                    break;
                }
                q.offer(b);

                i++;
            }

            System.out.print("#" + t + " ");
            for(int k : q){
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
