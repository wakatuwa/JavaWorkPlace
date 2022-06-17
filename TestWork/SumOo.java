package testWork;
/**
 * 编程求：∑1+∑2+……+∑100。
 * @author wanghan
 *
 */
public class SumOo {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 0; i < 101; i++) {
			sum += i;
		}
		System.out.println("结果为：" + sum);
	}
}
