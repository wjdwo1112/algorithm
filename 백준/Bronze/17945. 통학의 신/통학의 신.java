import java.util.Scanner;

 class Inputdata {
	Scanner sc = new Scanner(System.in);
	int a = 1;
	int b = 0;
	int c = 0;
	int result = 0;
	double root1 = 0;
	double root2 = 0;
	
	void inputData() {
	
	Scanner sc = new Scanner(System.in);
	b = sc.nextInt()*2;
	c = sc.nextInt();
}
	
	void discriminant() {
		result = b*b-4*a*c;
		if (result > 0) {
			 root1 = ((-b+Math.sqrt(result))/2);
			 root2 = ((-b-Math.sqrt(result))/2);
			System.out.printf("%d %d",(int)root2,(int)root1);
		} else if (result == 0) {
			root1 = (-b/2);
			root2 = (-b/2);
			System.out.printf("%d",(int)root1);
		}
		
		
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inputdata tong = new Inputdata();
		tong.inputData();
		tong.discriminant();
	}

}
	
	
