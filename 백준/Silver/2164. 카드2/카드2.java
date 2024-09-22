import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        // *  한 턴에 1개 씩 삭제되고 뒤에 1개가 추가 되므로
        // *  2 * N - 1 의 공간이 필요하다.
        // *  다만 index는 1부터 시작할 것이기 때문에
        // *  2 * N 공간으로 생성한다.

        int[] q = new int[2*n];
        for(int i=1; i<=n; i++){
            q[i] = i;
        }
        int prev_index = 1;
        int last_index = n;

        while(n-->1){
            prev_index++; //삭제할 필요 없이 prev가 가리키는 첫 번쨰 원소를 다음 원소로 변경
            q[last_index + 1] = q[prev_index]; // 마지막 원소 다음 공간에 현재 첫 번째 원소 데이터 삽입

            //각각 변수가 가리키는 인덱스를 1씩 증가
            last_index++;
            prev_index++;
        }
        System.out.println(q[prev_index]); //마지막으로 남은 원소 출력

    }
}
