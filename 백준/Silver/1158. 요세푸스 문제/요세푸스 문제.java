import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
       BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
         int k = Integer.parseInt(st.nextToken());

        Queue<Integer>q = new LinkedList<>();

        for(int i=1; i<=n; i++){
            q.add(i) ;
        }

        StringBuilder sb = new StringBuilder();
        sb.append('<');

        while(q.size() > 1){
            for(int i=0; i<k-1; i++){
                int value = q.poll();
                q.offer(value);
            }
            sb.append(q.poll()).append(", ");
        }
        sb.append(q.poll()).append('>');
        System.out.println(sb);
        
    }
}