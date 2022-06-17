package Container;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 迭代器遍历Set
 * @author wanghan
 *
 */
public class TestIterator02 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		for (int i = 0; i < 5; i++) {
			set.add("a" + i);
		}
		System.out.println(set);
		for (Iterator<String> iter = set.iterator(); iter.hasNext();) {
			String temp = iter.next();
			System.out.print(temp + "\t");
		}
		System.out.println();
		System.out.println(set);
	}
}
