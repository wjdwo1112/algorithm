import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(bf.readLine());
        Queue<Integer> queue = new LinkedList<>();
        int rear = 0;
        int x;

        for(int i=0; i<n; i++){
            st = new StringTokenizer(bf.readLine());
            String s = st.nextToken();

            switch(s){
                case "push":
                    x = Integer.parseInt(st.nextToken());
                    rear = x;
                    queue.offer(x);
                    break;

                case "pop":
                    if(queue.isEmpty()){
                        sb.append(-1).append("\n");
                    }else {
                        sb.append(queue.poll()).append("\n");
                    }
                    break;

                case "size":
                    sb.append(queue.size()).append("\n");
                    break;

                case "empty":
                    if(queue.isEmpty()){
                        sb.append(1).append("\n");
                    }else{
                        sb.append(0).append("\n");
                    }
                    break;

                case "front":
                    if(queue.isEmpty()){
                        sb.append(-1).append("\n");
                    }else {
                        sb.append(queue.peek()).append("\n");
                    }
                    break;

                case "back":
                    if(queue.isEmpty()){
                        sb.append(-1).append("\n");
                    }else{
                        sb.append(rear).append("\n");
                    }
                    break;
            }

        }
        System.out.println(sb);
    }
}
