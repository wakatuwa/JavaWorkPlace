package testWork;

import java.util.Scanner;

/**
 * 编写递归算法程序：一列数的规则如下: 1、1、2、3、5、8、13、21、34...... 求数列的第40位数是多少。
 * @author wanghan
 *
 */
public class Recursion {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个正整数:");
		int number = scanner.nextInt();
		System.out.println("结果为:" + func(number));
		scanner.close();
	}

	static int func(int x) {
		if (x == 2 || x == 1) {
			return 1;
		} else {
			return func(x-1) + func(x-2);
		}
	}
}
