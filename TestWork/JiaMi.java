package testWork;

import java.util.Scanner;

/**
 * 加密规则如下：每位数字都加上5,然后用和除以10的余数代替该数字，再将第一位和第四位交换，第二位和第三位交换。
 * @author wanghan
 *
 */
public class JiaMi {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个四位整数：");
		int yuan = scanner.nextInt();
		int demo = 0;
		demo = jiami(yuan);
		System.out.println("加密后的数字为：" + demo);
		scanner.close();

	}

	public static int jiami(int x) {
		int demo = 0;
		int a, b, c, d;
		a = x/1000;
		b = x%1000/100;
		c = x%100/10;
		d = x%10;
		a = (a+5)%10;
		b = (b+5)%10;
		c = (c+5)%10;
		d = (d+5)%10;
		demo = d*1000 + b*10 + c*100 + a;
		return demo;
	}
}
