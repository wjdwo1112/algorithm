import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//테스트 케이스의 수가 없으니 무한루프
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			StringBuilder sb = new StringBuilder(st.nextToken());
			String N = sb.reverse().toString();
			sb = new StringBuilder(st.nextToken());
			String M = sb.reverse().toString();
			
			//각 반전시킨 문자열들의 길이 저장
			int Nsize = N.length();
			int Msize = M.length();
			
			//0 0입력 시 무한루프 종료
			if(N.equals("0") && M.equals("0")) {
				break;
			}
			
			//num : 해당 자릿수들의 합이 10이상이 나오면 다음 수에 더하기 위한 변수
			//count : 받아올림 횟수를 체크하기 위한 변수
			int num = 0;
			int count = 0;
			
			//두 문자열의 길이중 긴 길이만큼 반복, 짧은 길이의 +1만큼만 해도 된다.
			for(int i = 0; i < Math.max(Nsize, Msize); i++) {
				//문자열의 자릿수에 오는 값을 int형으로 변환시켜서 연산하기 위한 변수
				int n = 0;
				int m = 0;
				//현재 연산할 자릿수가 아직 길이가 짧은 문자열의 길이를 넘지 않았으면 둘다 연산
				if(i < Math.min(Nsize, Msize)) {
					n = N.charAt(i) - '0';
					m = M.charAt(i) - '0';
					//현재 연산할 자릿수가 아직 길이가 짧은 문자열의 길이를 넘었으면 길이가 긴 값만 연산
				}else {
					//삼항연산자로 길이가 긴 값의 자릿값을 구함. if문으로 해도됨.
					n = (Math.max(Nsize, Msize) == Nsize) ? N.charAt(i) - '0' : M.charAt(i) - '0';
				}
				//두 자릿수와 이전 자릿수의 10이상 여부에 따른 num값을 더했을때 10이상이면
				//num에 1저장하고, count에 1을 더한다.
				if((n + m  + num) >= 10) {
					num = 1;
					count++;
					//두 자릿수와 num값을 더했을때 10미만이면 num에 0 저장
				}else {
					num = 0;
				}
			}
			System.out.println(count);
		}
	}

}