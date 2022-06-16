package Array;
/**
 * 测试数组的拷贝
 * @author wanghan
 *
 */
public class TestArrayCopy {
	public static void main(String[] args) {
		String[] s1 = {"aa", "bb", "cc", "dd", "ee"};
		String[] s2 = new String[10];
		System.arraycopy(s1, 2, s2, 6, 3);
		
		String[] str = {"阿里", "京东", "百度", "亚马逊"};
		removeElement(str, 2);
		
		extendRange(str);
		
//		for (String temp: s2) {
//			System.out.println(temp);
//		}
		
//		String[] s3 = new String[5];
//		System.arraycopy(s1, 3, s1, 3-1, s1.length-3);
//		s1[s1.length-1] = null;
//		for (String temp: s1) {
//			System.out.println("--"+temp);
//		}
	
	}
	//删除数组中指定索引位置的元素, 并将原数组返回
	public static String[] removeElement(String[] s, int index) {
		System.arraycopy(s, index, s, index-1, s.length-index);
		s[s.length - 1] = null;
		for (int i = 0; i<s.length; i++) {
			System.out.println(i + "--" + s[i]);
		}
		return s;
	}
	
	//数组的扩容（本质上是：先定义一个更大的数组，然后将原数组内容原封不动拷贝到新数组中）
	public static String[] extendRange(String[] s1) {
		//String[] s1 = {"aa", "bb", "cc"};
		String[] scopy = new String[s1.length + 10];
		
		System.arraycopy(s1, 0, scopy, 0, s1.length);
		for(String temp: scopy) {
			System.out.println(temp);
		}
		return scopy;
	}
}
