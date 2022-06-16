/**
 * 测试算术运算符
 * @author wanghan
 *
 */
public class TestOperate01 {
	public static void main(String[] args) {
//		byte a = 1;
//		int  b = 2;
//		//byte c = a + b; (a+b)结果是int类型
		
		long b2 = 3;
		//int c2 = b2+a; (a+b2)结果是long类型
		
		float f1 = 3.14f;
//		double d = b + b2; //表述范围较大
		
//		float d2 = f1 + 6.2; //只要有一个数为double类型，结果就是double类型
		
		System.out.println(-9%5);//取模符号与左边的数相同
		
		//测试自增和自减
//		int a = 3;
//		int b = a++;   //执行完后,b=3。先给b赋值，再自增。
//		System.out.println("a="+a+"\nb="+b);
//		a = 3;
//		b = ++a;   //执行完后,c=5。a先自增，再给c赋值
//		System.out.println("a="+a+"\nb="+b);

		int a=3;
		int b=4;
		a+=b;//相当于a=a+b;
		System.out.println("a="+a+"\nb="+b);
		a=3;
		a*=b+3;//相当于a=a*(b+3)
		System.out.println("a="+a+"\nb="+b);
		
		
	}
}
