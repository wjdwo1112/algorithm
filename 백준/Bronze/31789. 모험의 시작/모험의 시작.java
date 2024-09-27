import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		int s = sc.nextInt();
		int flag = 0;
		
		for(int i = 0; i < n; i++) {
			int c = sc.nextInt();
			int p = sc.nextInt();
			if(x >= c && p > s) {
				flag = 1;
			}
		}
		
		if(flag == 1) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		sc.close();
	}
}