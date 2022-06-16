package cn.sxt.test;

/**
 * 测试自动装箱,自动拆箱
 * @author wanghan
 *
 */
public class TestAutoBox {
	public static void main(String[] args) {
//		Integer a = 234;	//自动装箱(Integer a = Integer.valueOf(234);
//		
//		int b = a;	//编译器会修改成：int b = a.intValue();
//		
//		Integer c = null;
//		int d = c;	//自动拆箱
		//[缓存-128到127的数字]。实际就是系统初始的时候，创建的一个数组缓存
		//当我们调用valueOf()的时候，首先检查是否在缓存之间，如果在这个范围则直接从缓存数组中拿出，
		//如果不再，则创建新的Integer对象
//		Integer in1 = -128;
		Integer in1 = Integer.valueOf(-128);
        Integer in2 = -128;
        System.out.println(in1 == in2);//true 因为123在缓存范围内
        System.out.println(in1.equals(in2));//true
        Integer in3 = 1234;
        Integer in4 = 1234;
        System.out.println(in3 == in4);//false 因为1234不在缓存范围内,他们是不同的对象
        System.out.println(in3.equals(in4));//true
	}
}
