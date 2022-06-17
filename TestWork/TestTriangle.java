package testWork;

import java.util.Scanner;

/**
 * 2. 写一个方法void isTriangle(int a,int b,int c)，
 * 判断三个参数是否能构成一个三角形， 如果不能则抛出异常IllegalArgumentException，
 * 显示异常信息 “a,b,c不能构成三角形”，如果可以构成则显示三角形三个边长，在主方法中得到命令行输入的三个整数，
 * 调用此方法，并捕获异常。
 * @author wanghan
 *
 */
public class TestTriangle {
	public static void main(String[] args) throws IllegalArgumentException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一条边:");
		int a = scanner.nextInt();
		System.out.println("请输入第二条边：");
		int b = scanner.nextInt();
		System.out.println("请输入第三条边：");
		int c = scanner.nextInt();
		Triangle triangle = new Triangle();
		triangle.isTriangle(a, b, c);
	}
}

class IllegalArgumentException extends Exception	{
	public IllegalArgumentException(){

	}
	public IllegalArgumentException (String message) {
		super(message);
	}
}
class Triangle{

	void isTriangle(int a, int b, int c) throws IllegalArgumentException{
		if(a<0 || b<0 || c<0) {
			throw new IllegalArgumentException("边长不能为负数！");
		} else if((a-b-c>=0)||(b-c-a)>=0||(c-a-b)>=0) {
			throw new IllegalArgumentException("三边不能构成三角形！");
		} else {
			System.out.println("三角形三边为:"+ a +","+ b + "," + c);
		}
	}
}