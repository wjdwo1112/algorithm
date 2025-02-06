

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static Queue<Integer> q;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(bf.readLine());
        q = new LinkedList<>();
        int rear = 0;

        for(int i=0; i<n; i++){
            st = new StringTokenizer(bf.readLine());
            String s = st.nextToken();

            switch(s){
                case "push":
                    rear = Integer.parseInt(st.nextToken());
                    q.offer(rear);
                    break;

                case "pop":
                    if(q.isEmpty()){
                        sb.append(-1).append("\n");
                    }else {
                        sb.append(q.poll()).append("\n");
                    }
                    break;

                case "size":
                    sb.append(q.size()).append("\n");
                    break;

                case "empty":
                    if(q.isEmpty()){
                        sb.append(1).append("\n");
                    }else{
                        sb.append(0).append("\n");
                    }
                    break;

                case "front":
                    if(q.isEmpty()){
                        sb.append(-1).append("\n");
                    }else{
                        sb.append(q.peek()).append("\n");
                    }
                    break;

                case"back":
                    if(q.isEmpty()){
                        sb.append(-1).append("\n");
                    }else{
                        sb.append(rear).append("\n");
                    }

            }
        }
        System.out.println(sb);
    }
}
