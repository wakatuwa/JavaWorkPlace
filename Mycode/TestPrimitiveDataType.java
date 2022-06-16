/**
 * 测试基本数据类型（整形变量）
 * @author wanghan
 *
 */
public class TestPrimitiveDataType {
	public static void main(String[] args) {
		//测试整形变量
		int a = 15;
		int b = 015;	//以0开头是八进制
		int c = 0x15;	//以0X开头是十六进制
		int d = 0b1101;
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		byte age = 30;
		short salary = 30000;
		int population = 2000000000;	//整形常量默认是int类型
		long globalPopulation = 7400000000L;	//后面加L这就是一个long类型常量
	}
}
