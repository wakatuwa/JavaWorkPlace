package processcontrol;
/**
 * 测试while循环
 * @author wanghan
 *
 */
public class TestWhile {
	public static void main(String[] args) {
		//计算1+2+3+。。。+100=？
		//暴力!
		int i = 1;
		int sum = 0;
		while(i <= 100) {
			sum = sum + i;
			i++;//如果没有改变条件，循环会一直执行
		}
		
		System.out.println(sum);
	}
}
