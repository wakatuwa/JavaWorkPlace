package processcontrol;
/**
 * 测试dowhile，先执行后判断
 * @author wanghan
 *
 */
public class TestDoWhile {
	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		do {
			sum += i;
			i++;
		} while(i <= 100);//
		System.out.println(sum);
	}
}
