/**
 * 测试类型转化
 * @author wanghan
 *
 */
public class TestTypeConvert {
	public static void main(String[] args) {
		int a = 324;
		long b = a;
		double d = b;
//		a = b;
//		long e = 3.23F
		float f = 234324L;
		
		//特例
		byte b2 = 123;
		
		double x = 3.14;
		int nx = (int )x;
		char c = 'a';
		int e = c + 1;
		System.out.println(nx);
		System.out.println(e);
		System.out.println((char)e);
		
		
	}
}
