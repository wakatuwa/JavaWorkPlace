package Array;
/**
 * 测试数组的三种初始化
 * @author wanghan
 *
 */
public class Test02 {
	public static void main(String[] args) {
		//静态初始化
		int[] a = {2,4,65};
		UserArray[] b = {new UserArray(1001,"wanghan"), 
					new UserArray(1002,"zhangsan"), 
					new UserArray(1003,"lissi")
					};
		
		//默认初始化
		int[] c = new int[3];	//默认给数组的元素进行赋值。赋值的规则和成员变量默认规则一样。
		
		//动态初始化
		int[] a1 = new int[2];	//动态初始化数组，先分配空间;
		a1[0] = 1;	//给数组元素赋值；
		a1[1] = 2;	//给数组元素赋值
		
	}
}
