package IoTechnology;
/**
 * 测试装饰器模式
 * @author wanghan
 *
 */
class Iphone {
	private String name;
	public Iphone(String name) {
		this.name = name;
	}
	public void show() {
		System.out.println("我是" + name + ",可以看电影");
	}
}
class TouyingPhone {
	public Iphone phone;
	public TouyingPhone(Iphone p) {
		this.phone = p;
	}
	//功能更强的方法
	public void show() {
		phone.show();
		System.out.println("还可以投影到墙壁上。");
	}
}
public class TestDecoration {
	public static void main(String[] args) {
		Iphone phone = new Iphone("iphone33");
		phone.show();
		System.out.println("######装饰后#######");
		TouyingPhone typhone = new TouyingPhone(phone);
		typhone.show();
	}
}
