package Container;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 测试迭代器遍历List
 * @author wanghan
 *
 */
public class TestIterator01 {
	public static void main(String[] args) {
		List<String> aList = new ArrayList<String>();
		for (int i = 0; i < 5; i++) {
			aList.add("a" + i);
		}
		System.out.println(aList);

		for (Iterator<String> iter = aList.iterator(); iter.hasNext();) {
			String temp = iter.next();
			System.out.print(temp + "\t");
			if(temp.endsWith("3")) {
				iter.remove();
			}
		}
		System.out.println();
		System.out.println(aList);
	}
}
