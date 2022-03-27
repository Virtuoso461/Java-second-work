package Work2;

public class Circle {
	private double r;
	private Point o;
	public void get(double x,double y){
		o = new Point(x,y);
		
	}
	public Circle(double r) {
		this.r = r;
	}
	public void getCircleArea(){
		System.out.println("圆的大小为："+(Math.PI*r*r));
	}
}