package Work2;
import java.util.Scanner;
public class CircleTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input the x,y:");
		Point p = new Point (sc.nextDouble(),sc.nextDouble());
		System.out.println("Please input the radius:");
		Point origin = new Point(0.0,0.0);
		Circle c = new Circle(sc.nextDouble());
		c.get(p.chuanzhi1(), p.chuanzhi2());
		c.getCircleArea();
	}
}
