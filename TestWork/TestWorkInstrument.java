package testWork;
/**
 * 编写程序实现乐手弹奏乐器。乐手可以弹奏不同的乐器从而发出不同的声音。可以弹奏的乐器包括二胡、钢琴和琵琶
 * @author wanghan
 *
 */
public class TestWorkInstrument {
	public static void main(String[] args) {
		Instrument e = new Erhu();
		Instrument p = new Piano();
		Instrument v = new Violin();
		Musician xiaoming = new Musician();
		System.out.println("");
		xiaoming.play(e);
		xiaoming.play(p);
		xiaoming.play(v);

	}
}

abstract class Instrument {
	abstract public String makeSound();
}

class Erhu extends Instrument {
	String Erhu;
	public String makeSound() {
		System.out.println("play erhu!");
		return Erhu;
	}
}

class Piano extends Instrument {
	String Piano;
	public String makeSound() {
		return Piano;
	}
}

class Violin extends Instrument {
	String Violin;
	public String makeSound() {
		return Violin;
	}
}

class Musician {
	void play(Instrument i) {
		System.out.println(i.makeSound());
	}
}