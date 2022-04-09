package Module7;

class Outer2 {

	static Integer x = 0;
	static Integer y = 0;

	static class Inner2 {

		void printXY() {
			x = y = 100;
			System.out.println("Outer x is " + x);
			System.out.println("Outer x is " + y);
		}

		void printXY2() {
			System.out.println("Outer x is " + x);
			System.out.println("Outer x is " + y);
		}
	}

}

public class static_class2 {
	public static void main(String[] args) {

		// Outer out = new Outer();
		// Outer.Inner in = out.new Inner();

		// Outer.Inner in2 = new Outer().new Inner();

		Outer2.Inner2 in = new Outer2.Inner2();

		in.printXY();
		in.printXY2();

	}

}
