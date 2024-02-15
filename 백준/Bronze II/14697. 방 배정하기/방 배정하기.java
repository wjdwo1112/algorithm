import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A =  sc.nextInt();
		int B =  sc.nextInt();
		int C =  sc.nextInt();
		int N =  sc.nextInt();
		int cnt = 0;
		int D =0;
		
		for(int i=0; i<300; i++) {
			for(int j=0; j<300; j++) {
				for(int k=0; k<300; k++) {
				
					D = i*A + j*B + k*C;
					if(D==N) {
						cnt ++;
						
					}
				}
			}
		}
		if (cnt>0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
		
	}

}
