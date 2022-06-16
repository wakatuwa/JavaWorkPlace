/**
 * 测试逻辑运算符
 * @author wanghan
 *
 */
public class TestOperate03 {
	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1&b2);
		System.out.println(b1|b2);
		System.out.println(b1^b2);
		System.out.println(!b2);
		
		//测试短路
	//	int c = 3/0;
		boolean b3 = 1>2 && 2<(3/0);//短路与前面的式子错误，立刻给出结果，不会再运行后面的式子
		System.out.println(b3);
	}
}
