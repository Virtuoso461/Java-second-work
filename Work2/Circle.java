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
		System.out.println("Բ�Ĵ�СΪ��"+(Math.PI*r*r));
	}
}