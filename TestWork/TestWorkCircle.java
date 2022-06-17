package testWork;
/**
 * 　2. 定义一个圆类——Circle，在类的内部提供一个属性：半径(r)，同时 提供 两个 方 法 ： 计算 面积 ( getArea() ) 和 计算 周长(getPerimeter()) 。
 * 通过两个方法计算圆的周长和面积并且对计算结果进行输出。
 * 最后定义一个测试类对 Circle 类进行使用。
 * @author wanghan
 *
 */
public class TestWorkCircle {
	public static void main(String[] args) {
		Circle circle = new Circle(3.14);
		circle.getArea();
		circle.getPerimeter();
	}
}

class Circle {
	private double r;

	public Circle(double r) {
		this.r = r;
	}

	public void getArea() {
		double result = Math.PI*r*r;
		System.out.println("面积是："+result);

	}

	public void getPerimeter() {
		double result = 2*Math.PI*r;
		System.out.println("周长是：" + result);
	}
}

final class test {
	Circle yuan = new Circle(3.14);

}
