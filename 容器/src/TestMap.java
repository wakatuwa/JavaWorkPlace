package Container;

import java.util.HashMap;
import java.util.Map;

/**
 * 测试哈希表
 * @author wanghan
 *
 */
public class TestMap {
	public static void main(String[] args) {
		Map<Integer, String> m1 = new HashMap<Integer, String>();
		Map<Integer, String> m2 = new HashMap<Integer, String>();
		m1.put(1, "one");
		m1.put(2, "two");
		m1.put(3, "three");
		m2.put(1, "一");
		m2.put(2, "二");
		System.out.println(m1.size());
		System.out.println(m1.containsKey(1));
		System.out.println(m2.containsValue("two"));
		m1.put(3, "third");	//键重复了，则会替换旧的键值对
		Map<Integer, String> m3 = new HashMap<Integer, String>();
		m3.putAll(m1);
		m3.putAll(m2);
		System.out.println("m1:" + m1);
		System.out.println("m2:" + m2);
		System.out.println("m3:" + m3);
	}
}
