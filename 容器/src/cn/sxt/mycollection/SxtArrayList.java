package cn.sxt.mycollection;
/**
 * 自定义实现一个ArrayList，体会底层原理
 * @author wanghan
 *
 */
public class SxtArrayList {
	private Object[] elementData;
	private int size;
	
	private static final int DEFALT_CAPACITY = 10;
	
	public SxtArrayList() {
		elementData = new Object[DEFALT_CAPACITY];
	}
	
	public SxtArrayList(int capacity) {
		elementData = new Object[capacity];
	}

	public void add(Object obj) {
		elementData[size++] = obj;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		//[a,b,c]
		sb.append("[");
		for(Object obj:elementData) {
			sb.append(obj);
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		SxtArrayList s1 = new SxtArrayList(20);
		
		s1.add("aa");
		s1.add("bb");
		
		System.out.println(s1.toString());
	}
}
