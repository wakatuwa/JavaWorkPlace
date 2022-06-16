package Array;
/**
 * 测试数组的遍历
 * @author wanghan
 *
 */
public class Test03 {
	public static void main(String[] args) {
		int[] a = new int[4];
		
		for(int i = 0; i<a.length; i++) {
			a[i] = 100*i;
		}
		
		for(int i = 0; i< a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("#############");
		//foreach循环；用于读取数组或集合中的所有元素，不能修改元素的值
		for(int m:a) {
			System.out.println(m);
		}
		
		String[] ss = { "aa", "bbb", "ccc", "ddd" };
        for (String temp : ss) {
            System.out.println(temp);
        }
	}
}
