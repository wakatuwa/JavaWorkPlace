package processcontrol;
/**
 * 测试嵌套循环02
 * @author wanghan
 *
 */
public class TestWhileQiantao02 {
	public static void main(String[] args) {
		System.out.println("###############");
		//用while分别计算100以内的奇数以及偶数的和
		int sum01 = 0;
		int sum02 = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 2==0) {
				sum01 += i;
			} else {
				sum02 += i;
			}
		}
		System.out.println("奇数和：" + sum01);
		System.out.println("偶数和：" + sum02);
		
		System.out.println("##############");
		//用while计算1-1000之间能被5整除的数，且每行输出5个
		int count = 0;
		for(int j = 1; j <= 1000; j++) {
			if(j % 5 == 0) {
				count++;
				System.out.print(j+" ");
				if(count == 5) {
					System.out.println();
					count = 0;
				}
			}
		}
	}
}
