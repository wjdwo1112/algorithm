import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        Queue<Integer> q = new LinkedList<>();
        
        for(int i=1; i<=n; i++){ //카드를 큐에 저장
            q.offer(i);
        }
        while(q.size() > 1){ // 카드가 1장 남을때까지
            q.poll(); // 맨 위 카드 버리기
            int temp = q.poll(); // 맨 위 카드를 버리고 저장
            q.offer(temp); // 맨 위 카드를 가장 아래 카드 밑으로 이동

        }
        System.out.println(q.poll()); // 마지막으로 남은 카드 출력



    }
}
