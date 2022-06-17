package Container;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 测试Collections工具类
 * @author wanghan
 *
 */
public class TestCollections {
	public static void main(String[] args) {
		List<String> aList = new ArrayList<String>();
		for (int i = 0; i < 5; i++) {
			aList.add("a" + i);
		}
		System.out.println(aList);

		Collections.shuffle(aList);	//随机排列
		System.out.println(aList);

		Collections.reverse(aList);	//逆序
		System.out.println(aList);

		Collections.sort(aList);	//排序
		System.out.println(aList);

		System.out.println(Collections.binarySearch(aList, "a2"));
		Collections.fill(aList, "hello");
		System.out.println(aList);
	}
}
