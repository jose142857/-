package 二次方程式;

import java.util.Scanner;

public class kaiketsu {

	public static void main(String[] args) {
		// ax2+bx+c=0 (a≠0)
		// a,b,c enter
		float a, b, c, x1, x2;
		double delta;
		double sqrtdelta ;
		Scanner sc = new Scanner(System.in);
		System.out.print("a =: ");
		a = sc.nextFloat();
		System.out.print("b =: ");
		b = sc.nextFloat();
		System.out.print("c =: ");
		c = sc.nextFloat();

		delta = b * b - 4 * a * c;
		sqrtdelta = Math.sqrt(delta);

//		System.out.println(delta);
		if (delta<0){
			System.out.println("解がゼロ");

		}else if (delta==0){
			System.out.println("x1 = x2 = "+ -b/2*a);
		}else {
			System.out.println("x1 = "+ (-b +sqrtdelta)/2*a);
			System.out.println("x2 = "+ (-b -sqrtdelta)/2*a);
		}
	}

}
