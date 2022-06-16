package processcontrol;
/**
 * 测试方法的基本使用
 * @author wanghan
 *
 */
public class TestMethod {
	public static void main(String[] args) {
		//通过对象调用普通方法
		TestMethod tm = new TestMethod();
		tm.printSxt();
		int c = tm.add(1, 2, 3) + 1000;
		System.out.println(c);
	}
	
	void printSxt() {
		System.out.println("123");
		System.out.println("456");
		System.out.println("789");
	}
	
	int add(int a, int b, int c) {
		int sum = a + b + c;
		System.out.println(sum);
		return sum; //return两个作用：1.结束方法的运行 2.返回值
	}
}
