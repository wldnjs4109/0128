import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A,B,C;
		Scanner a = new Scanner (System.in);
		A = a.nextInt();
		B = a.nextInt();
		C = a.nextInt();
		
		System.out.println((A+B)%C);
		System.out.println(((A%C)+(B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C)*(B%C))%C);

	}

}
