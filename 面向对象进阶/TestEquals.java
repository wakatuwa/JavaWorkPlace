package ObjectOrientedAdvanced;
/**
 * 测试并重写Equals方法
 * @author wanghan
 *
 */
public class TestEquals {
	public static void main(String[] args) {
		
	}
}

class PersonEquals {
	int id;
	String name; 
	public PersonEquals (int id, String name) {
		this.id = id;
		this.name = name;
	}
	public boolean equals(Object obj) {
		if ( obj == null) {
			return false;
		} else {
			if (obj instanceof PersonEquals) {
				PersonEquals c = (PersonEquals)obj;
				if (c.id == this.id) {
					return true;
				}
			}
		}
		return false;
	}
}