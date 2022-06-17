package Container;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 迭代器遍历Map
 * @author wanghan
 *
 */
public class TestIterator03 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("A", "one");
		map.put("B", "two");

		Set<Entry<String, String>> ss = map.entrySet();

		for(Iterator<Entry<String, String>> iterator = ss.iterator(); iterator.hasNext();) {
			Entry<String, String> e = iterator.next();
			System.out.println(e.getKey() + "--" + e.getValue());
		}

		Map<String, String> map02 = new HashMap<String, String>();
		map02.put("C", "three");
		map02.put("D", "four");
		Set<String> ss02 = map02.keySet();
		for (Iterator<String> iterator = ss02.iterator(); iterator.hasNext();)	{
			String key = iterator.next();
			System.out.println(key + "---" + map02.get(key));
		}


	}
}
