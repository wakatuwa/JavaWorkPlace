package processcontrol;
/**
 * 测试嵌套循环
 * @author wanghan
 *
 */
public class TestWhileQiantao {
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	
	for (int k = 1; k <= 9; k++ ) {
		for(int s = 1; s <= k; s++) {
			System.out.print(s + "*"+ k + " = " + s*k +"   ");
			if(s==k) {
				System.out.println();
			}
		}
	}
	}
}
