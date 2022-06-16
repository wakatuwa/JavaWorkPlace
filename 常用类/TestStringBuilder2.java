package cn.sxt.test;

/**
 *  * 测试StringBuilder、StringBuffer可变字符序列
 * @author wanghan
 *
 */
public class TestStringBuilder2 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i<26; i++) {
			sb.append((char)('a' + i));
		}
		System.out.println(sb);
		
		sb.reverse();	//倒序
		System.out.println(sb);
		
		sb.setCharAt(3, '高');
		System.out.println(sb);
		
		sb.insert(0, '我');
		System.out.println(sb);
		
		sb.insert(0, '我').insert(6, '爱').insert(10, '你');//链式调用，该方法调用了return this，把自己返回了
		System.out.println(sb);
		
		sb.delete(20, 23);
		System.out.println(sb);
		
		
	}
}
