package testWork;

import java.util.Scanner;

/**
 * 从键盘输入某个十进制整数，转换成对应的二进制整数并输出。
 * @author wanghan
 *
 */
public class ShiftTt {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入十进制整数");
		int yuan = scanner.nextInt();
		String binary = Integer.toBinaryString(yuan);
		System.out.println("对应的二进制为：" + binary);
		scanner.close();
	}
}
