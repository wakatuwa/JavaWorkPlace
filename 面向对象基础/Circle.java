package ObjectOrientedBasics;
/**
 * 定义一个圆类
 * @author wanghan
 *
 */
import static java.lang.Math.PI;
public class Circle {
	double r;
	public Circle(double r) {
		this.r = r;
	}
	public void getArea() {
		System.out.println(r*r*PI); 
	}

	public void getPerimeter() {
		System.out.println(2*PI*r);
	}

	public static void main(String[] args) {
		Circle yuan = new Circle(0.1);
		yuan.getArea();
		yuan.getPerimeter();
	}
}
