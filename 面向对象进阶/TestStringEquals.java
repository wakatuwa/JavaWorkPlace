package ObjectOrientedAdvanced;
/**
 * test of String Equals
 * @author wanghan
 *
 */
public class TestStringEquals {
	public static void main(String[] args) {
		String s1 = "Umbrella";
		String s2 = "Umbrella";
		String s3 = new String("Umbrella");
		System.out.println(s1 == s2);//true 指向同样的字符串常量对象
		System.out.println(s1 == s3);//false g3是新创建的对象
		System.out.println(s1.equals(s3));//true g1和g3里面的字符串内容是一样的
	}
}
