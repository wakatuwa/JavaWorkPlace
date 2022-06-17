package ObjectOrientedAdvanced;
/**
 * 多个接口定义三栖艺人
 * @author wanghan
 *
 */
interface Movie {
	void playmovie();
}
interface Soap {
	public abstract void playsoap();
}
interface Sing {
	public abstract void singsong();
}
class Actress implements Movie, Soap, Sing{
	public Actress(String name) {
		System.out.println("I am " + name +".");
	}


	public void playmovie() {
		System.out.println("I can playmovie.");
	}

	public void playsoap() {
		System.out.println("I can playsoap.");
	}

	public void singsong() {
		System.out.println("I can singsong.");
	}
}

public class WorkTest3 {
	public static void main(String[] args) {
		Actress lulu = new Actress("lulu");
		lulu.playmovie();
		lulu.playsoap();
		lulu.singsong();
	}
}
