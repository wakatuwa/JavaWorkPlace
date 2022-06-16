package ObjectOrientedAdvanced;

/**
 * 测试object类
 * @author wanghan
 *
 */
public class TestObject {
	public static void main(String[] args) {
//		Object obj;
		
		TestObject to = new TestObject();
		System.out.println(to.toString());
		
		Person2 p2 = new Person2("xixi", 6);
		System.out.println(p2.toString());
	}
	
	public String toString() {
		return "测试Object对象";
	}
}

class Person2 {
    String name;
    int age;
    
    @Override
    public String toString() {
        return name+",年龄："+age;
    }
    
    public Person2(String name, int age) {
    	this.name = name;
    	this.age = age;
    }
}
