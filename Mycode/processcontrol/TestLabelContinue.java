package processcontrol;
/**
 * 带标签的Break和Continue
 * @author wanghan
 *
 */
public class TestLabelContinue {
	public static void main(String[] args) {
		outer: for(int i = 101; i < 150; i++) {
			for (int j = 2; j < i/2; j++) {
				if(i % j == 0) {
					continue outer;//直接从内循环跳到外循环
				}				
			}
			System.out.println(i + " ");
		}
	}
}
