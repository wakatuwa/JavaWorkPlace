package Container;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 测试List容器和有关方法
 * @author wanghan
 *
 */
public class TestList {
	public static void test01() {
		List<String> list = new ArrayList<String>();
		System.out.println(list.isEmpty()); 	//true,容器里面没有元素
		list.add("wanghan");
		System.out.println(list.isEmpty()); 	//false,容器里面有元素
		list.add("wangyi");
		list.add("wanger");
		System.out.println(list);
		System.out.println("list的大小： " + list.size());
		System.out.println("是否包含指定元素： " + list.contains("wangyi"));
		list.remove("wanghan");
		System.out.println(list);
		Object[] objs = list.toArray();
		System.out.println("转化成object数组：" + Arrays.toString(objs));
		list.clear();
		System.out.println("清空所有元素： " + list);

	}

	public static void main(String[] args) {
		test01();
	}
}
