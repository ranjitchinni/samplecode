import java.awt.Point;

public final class ImmutableCircle {
	private final Point center;
	private final int radius;

	public ImmutableCircle(int x, int y, int r) {
		center = new Point(x, y);
		radius = r;
	}

	public String toString() {
		return "center: " + center + " and radius = " + radius;
	}

	public int getRadius() {
		return radius;
	}
	public int getx()
	{
		return 10;
	}
	public int gety()
	{
		return 20;
	}

	public Point getCenter() {
		// return a copy of the object to avoid
		// the value of center changed from code outside the class
		return new Point(center.getx(), center.gety());
	}

	public static void main(String[] s) {
		System.out.println(new ImmutableCircle(10, 10, 20));
	}
	// other members are elided ...
}