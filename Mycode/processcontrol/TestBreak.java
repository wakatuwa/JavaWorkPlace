package processcontrol;
/**
 * 测试break
 * @author wanghan
 *
 */
public class TestBreak {
	public static void main(String[] args) {
		int total = 0; 
		System.out.println("Begin");
		while (true) {
			total++;
			int i = (int)Math.round(100 * Math.random());
			if (i == 88) {
				break;
			}
		}
		
		System.out.println("Game over, used" + total + " times ");
	}
}
