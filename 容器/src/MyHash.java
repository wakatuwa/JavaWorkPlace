package Container;
/**
 * 测试hash算法
 * @author wanghan
 *
 */
public class MyHash {
	public static void main(String[] args) {
		int h = 25860399;
		int length = 16; 	//length为2的整数次幂，则h&(length - 1)相当于对length取模
		myHash(h, length);
	}

	public static int myHash(int h, int length) {
		System.out.println(h&(length-1));
		//length为2的整数幂情况下，和取余的值一样
		System.out.println(h%length);//取余数
		//length
		return h&(length-1);
	}
}
