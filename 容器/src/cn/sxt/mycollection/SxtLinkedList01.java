package cn.sxt.mycollection;
/**
 * 自定义一个链表
 * @author wanghan
 *
 */
public class SxtLinkedList01 {
	private Node first;
	private Node last;
	
	private int size;
	
	//[]
	//["a","b","c","d","e","f"] 2
	public Object get(int index) {
		Node temp = first;
		
		for(int i = 0; i<index; i++) {
			temp = temp.next;
		}
		
		return temp.element;
	}
	//[]
	//["a","b","c"]
	public void add(Object obj) {
		Node node = new Node(obj);
		
		if(first == null) {
			first = node;
			last = node;
		} else {
			node.previous = last;
			node.next = null;
			
			last.next = node;
			last = node;
		}
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		Node temp = first;
		while(temp!=null) {
			sb.append(temp.element+",");
			temp = temp.next;
		}
		sb.setCharAt(sb.length()-1, ']');
		return sb.toString();
	}
	
	public static void main(String[] args) {
		SxtLinkedList01 list = new SxtLinkedList01();
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");
		
		
		System.out.println(list);
	}
}
