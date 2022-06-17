package testWork;
/**
 * 编写应用程序，创建类的对象，分别设置圆的半径、圆柱体的高，计算并分别显示圆半径、圆面积、圆周长，圆柱体的体积。
 * @author wanghan
 *
 */
public class TestWorkYuan {
	public static void main(String[] args) {
		testCircle c1 = new Cylinder();
		c1.setRadius(3.1);
		c1.show();
		Cylinder c2 = (Cylinder)c1;
		c2.setHeight(2.0);
		c2.showVolume();
	}
}

class testCircle{
	private double radius;

	public testCircle(){

	}

	public testCircle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}

	double getArea() {
		return Math.PI*radius*radius;
	}

	double getPerimeter() {
		return 2*Math.PI*radius;
	}

	void show() {
		System.out.println("圆的半径：" + radius);
		System.out.println("圆的周长：" + getPerimeter());
		System.out.println("圆的面积：" + getArea());
	}
}

class Cylinder extends testCircle {
	private double height;

	public Cylinder() {

	}
	public Cylinder(double height) {
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	double getVolume() {
		return getArea()*height;
	}

	void showVolume() {
		System.out.println("圆柱体的体积："+ getVolume());
	}
}

