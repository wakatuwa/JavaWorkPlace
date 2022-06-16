package ObjectOrientedFoundation;
/**
 * 测试构造方法
 * @author wanghan
 *
 */
class Point {	
	double x, y;
	//构造方法名称和类名必须保持一致
	public Point(double _x, double _y) {
		x = _x;
		y = _y;
		return;//return无返回值，仅代表方法结束，可加return也可不加
	}
	public double getDistance(Point p) {
		return Math.sqrt((x - p.x)*(x - p.x)+(y - p.y)*(y - p.y));
	}
	
}

public class TestConstructor {
	public static void main(String[] args) {
		Point p = new Point(3.0, 4.0);
		Point origin = new Point(0.0, 0.0);
		
		System.out.println(p.getDistance(origin));
	}
}
