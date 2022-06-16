package processcontrol;
/**
 * 编写递归算法程序：一列数的规则如下: 1、1、2、3、5、8、13、21、34...... 求数列的第40位数是多少。
 * @author wanghan
 *
 */
public class TestWork02 {
	public static void main(String[] args) {
		System.out.println(function(40));
	}
	
	static int function(int number) {
		int x1 = 1;
		int x2 = 1;
		int result = 0;
		for(int i = 3; i <= number; i++) {
			result = x1 + x2;
			x1 = x2;
			x2 = result;
		}
		return result;
	}
}
