package processcontrol;
/**
 *  从键盘输入某个十进制整数数，转换成对应的二进制整数并输出。
 * @author wanghan
 *
 */
import java.util.Scanner;
public class TestWork01 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	long number = scanner.nextInt();
	String result = Integer.toBinaryString((int) number);
	System.out.println(result);
	
	}
}
