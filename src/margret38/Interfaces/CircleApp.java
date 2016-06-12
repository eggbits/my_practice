package margret38.Interfaces;

import java.util.Arrays;

public class CircleApp {

	public static void main(String[] args) {
		Circle[] c = {new Circle(2.3),new Circle(2.4),new Circle(3.5),new Circle(5.3),new Circle(6.5)};
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));
	}
}
