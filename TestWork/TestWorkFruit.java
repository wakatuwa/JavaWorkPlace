package testWork;

import java.util.Scanner;

/**
 * 1. 数组查找操作：定义一个长度为10 的一维字符串数组，在每一个元素存放一个单词;
 * 然后运行时从命令行输入一个单词，程序判断数组是否包含有这个单词，包含这个单词就打印出“Yes”，
 * 不包含就打印出“No”
 * @author wanghan
 *
 */
public class TestWorkFruit {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入你要查找的水果:");
		String input = scanner.next();
		search(input);
	}

	public static void search(String fruit) {
		String[] ss = {"apple","banana","orange","pineapple","strawberry","blackberry","peach","pear","lemon","cherry"};
		boolean flag = false;
		for(int i = 0; i<10; i++) {
			if(ss[i].equals(fruit)) {
				System.out.println("Yes");
				flag = true;
				break;
			}
		}
		if(flag == false) {
			System.out.println("No");
		}
	}
}
