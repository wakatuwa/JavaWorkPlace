package cn.sxt.test;

/**
 * 测试包装类
 * @author wanghan
 *
 */
public class TestWrappedClass {
	public static void main(String[] args) {
		//基本数据类型转成包装类对象
		Integer a = new Integer(3);
		Integer b = new Integer(50);
		Integer c = Integer.valueOf(30);
		
		//把包装类对象转成基本数据类型
		int d = c.intValue();
		double e = c.doubleValue();
		
		//把字符串转成包装类对象
		Integer f = new Integer("9999");
		
		//包装类对象转成字符串
		String str = f.toString();
		
		//常见的常量
		System.out.println("int类型最大的整数：" + Integer.MAX_VALUE);
	}
}
