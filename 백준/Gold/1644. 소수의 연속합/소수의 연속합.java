import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
		static ArrayList<Integer> list = new ArrayList<>();
		static int n;
		static boolean[] number;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//ArrayList<Integer> list = new ArrayList<>();
		 n = Integer.parseInt(bf.readLine());
		Yaksu(n);
		

		
		int end = 0;
		int start = 0;
		int sum = 0;
		int cnt = 0;
		
		while(true) {
		if (sum >= n) { // 부분합이 n 이상이라면
			sum -= list.get(start); // 합에서 왼쪽 포인터의 값을 뺌
			start++; // 왼쪽 포인터 이동
		} else if (list.size() == end) { // 오른쪽 포인터가 끝까지 탐색했다면
			break; // 반복문 빠져나옴
		} else { // 부분합이 n보다 크다면
			sum += list.get(end); // 오른쪽 포인터의 값을 더함
			end++; // 오른쪽 포인터 이동
		}
		if (sum == n) cnt++; // 부분합이 n과 같다면 방법수 증가
	}
		System.out.println(cnt);
	}
	
	static void Yaksu(int n) {
        number =  new boolean[n+1];
        number[0]=true;
        number[1]=true;
        for(int i=2; i*i<=number.length; i++) {
            if(number[i] == false) {
                for(int j=i*2; j<number.length; j+=i) {
                    number[j] = true;
                }
                
            }
        }
        for(int i=2; i<number.length; i++) {
            if(number[i] == false) {
                list.add(i);
            }
        }
    }
}
