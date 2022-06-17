package ObjectOrientedAdvanced;
/**
 * 测试instanceof
 * @author wanghan
 *
 */
public class TestInstanceof {
	public static void main(String[] args) {
		Student s = new Student("zhangsan", 175, "Java");
		System.out.println(s instanceof Person);
		System.out.println(s instanceof Student);
	}
}
