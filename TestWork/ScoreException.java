package testWork;
/**
 * 1. 编写程序接收用户输入分数信息，如果分数在0—100之间，输出成绩。如果成绩不在该范围内，抛出异常信息，提示分数必须在0—100之间。

要求：使用自定义异常实现。
 * @author wanghan
 *
 */
public class ScoreException {
	public static void main(String[] args) throws ScoreOut {
		Score s = new Score();
		s.setScore(111);
		System.out.println(s);
	}
}

class ScoreOut extends Exception {
	public ScoreOut() {

	}
	public ScoreOut(String message) {
		super(message);
	}
}

class Score {
	private int score;

	public int getScore() {
		return score;
	}

	public void setScore(int score) throws ScoreOut {
		if(score<0||score>100) {
			throw new ScoreOut("成绩不合法！");
		}
		this.score = score;
	}

	public String toString() {
		return "成绩是：" + score;
	}

}