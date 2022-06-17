package ObjectOrientedAdvanced;
/**
 * 测试接口的使用
 * @author wanghan
 *
 */
public class TestInterface {
	public static void main(String[] args) {
		Volant volant = new Angel();
		volant.fly();
		System.out.println(Volant.FLY_HIGHT);

		Honest honest = new GoodMan();
		honest.helpOther();

		BirdMan jack = new BirdMan();
		jack.fly();
	}
}

interface Volant {
	int FLY_HIGHT = 100;	//总是 public static final类型
	void fly();	//总是public abstract类型
}

interface Honest {
	void helpOther();
}

class Angel implements Volant, Honest {
	public void fly() {
		System.out.println("天使飞起来了。");
	}
	public void helpOther() {
		System.out.println("天使帮助他人。");
	}
}

class GoodMan implements Honest {
	public void helpOther() {
		System.out.println("Help others.");
	}
}

class BirdMan implements Volant {
	public void fly() {
		System.out.println("I can fly.");
	}
}

/*接口支持多继承，子接口扩展某个父接口，将会获得父接口中所定义的一切*/
interface A{
	void testa();
}

interface B{
	void testb();
}

interface C extends A, B {
	void testc();
}

class Testabc implements C {
	public void testa() {

	}
	public void testb() {

	}
	public void testc() {

	}
}