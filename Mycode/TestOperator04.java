/**
 * 位运算符
 * @author wanghan
 *
 */
public class TestOperator04 {
	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);
		System.out.println(~a);
		
		//移位
		int c = 3<<2;
		System.out.println(c);
		System.out.println(12>>2);//左移两位
		System.out.println(12>>1);//左移一位
	}
}
