package ObjectOrientedAdvanced;
/**
 * 测试转型
 * @author wanghan
 *
 */
public class TestCasting {
	public static void main(String[] args) {
		Object obj = new String("microsoft");

		String str = (String)obj;
		System.out.println(str.charAt(0));// 位于0索引位置的字符
		System.out.println(obj == str);
	}
}
