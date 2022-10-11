package 二次方程式;

import java.util.Scanner;

public class kaiketsu {

	public static void main(String[] args) {
		// ax2+bx+c=0 (a≠0)
		// a,b,c enter
		float a, b, c, x1, x2;
		float delta;
		Scanner sc = new Scanner(System.in);
		System.out.println("a =: ");
		a = sc.nextFloat();
		System.out.println("b =: ");
		b = sc.nextFloat();
		System.out.println("c =: ");
		c = sc.nextFloat();

		delta = b * b - 4 * a * c;

		System.out.println(delta);
	}

}
