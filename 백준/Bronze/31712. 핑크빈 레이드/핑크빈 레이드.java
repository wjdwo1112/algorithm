import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cu = sc.nextInt();
		int du = sc.nextInt();
		int cd = sc.nextInt();
		int dd = sc.nextInt();
		int cp = sc.nextInt();
		int dp = sc.nextInt();
		int h = sc.nextInt();
		
		int count = 0;
		h = h - du - dd - dp;
		
		while(h > 0) {
			count++;
			if(count % cu == 0) {
				h -= du;
			}
			if(count % cd == 0) {
				h -= dd;
			}
			if(count % cp == 0) {
				h -= dp;
			}
		}
		System.out.println(count);
		sc.close();
	}
}