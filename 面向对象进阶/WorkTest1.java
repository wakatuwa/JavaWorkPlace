package ObjectOrientedAdvanced;
/**
 * work01
 * @author wanghan
 *
 */
import static java.lang.Math.PI;
 class Circle {
	double radius;
	public Circle() {
		this.radius = radius;
	}
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	double getArea() {
		return PI*radius*radius;
	}

	double getPerimeter() {
		return 2*PI*radius;
	}

	void show() {
		System.out.println(radius);
		System.out.println(PI*radius*radius);
		System.out.println(2*PI*radius);
	}

}
class Cylinder extends Circle {
	private double hight;
	public Cylinder(double radius, double hight) {
		super(radius);
		this.hight = hight;
	}
	double getVolume() {
		return getArea()*hight;
	}

	void showVolume() {
		System.out.println(getArea()*hight);
	}
}

public class WorkTest1 {
	public static void main(String[] args) {
	Circle yuan = new Circle(2);
	yuan.show();
	
	Cylinder yuanzhu = new Cylinder(1, 1);
	yuanzhu.show();
	}
}





