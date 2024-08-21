package ShapeMethodReturnType;

public class TestShape {
	public static void main(String[] args) {

		// Shape s = new Shape();

		Shape s1 = Shape.getShape(2);

		System.out.println(s1.area());

	}
}