package ObjectOrientedAdvanced;
/**
 * 实现乐手可以弹奏不同的乐器从而发出不同的声音
 * @author wanghan
 *
 */
class Instrument extends Musician {
	void makeSound() {

	}
}
class Erhu extends Instrument {
	void makeSound() {
		System.out.println("ErhuMusic");
	}
}
class Piano extends Instrument {
	void makeSound() {
		System.out.println("PianoMusic");
	}
}
class Violin extends Instrument {
	void makeSound() {
		System.out.println("ViolinMusic");
	}
}

class Musician {
	void Play(Instrument i) {
		i.makeSound();
	}
}
class TestInstrument{
	void test(String musicianName, Instrument i) {
		System.out.println(musicianName);
		Musician musician = new Musician();
		musician.Play(i);

	}
}
public class WorkTest2 {
	public static void main(String[] args) {
	TestInstrument testpiano = new TestInstrument();
	Instrument piano = new Piano();
	testpiano.test("xiaoming", piano);
	}
}
