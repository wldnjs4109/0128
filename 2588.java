import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m1,m2,p1,p2,p3,r;
		Scanner a = new Scanner (System.in);
		m1 = a.nextInt();
		m2 = a.nextInt();
		
		p1=m1*(m2%10);
		p2=m1*((m2%100)/10);
		p3=m1*(m2/100);
		r=p1+(p2*10)+(p3*100);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(r);

	}

}
