package ObjectOrientedAdvanced;
/**
 * 测试callback，回调机制
 * @author wanghan
 *
 */
/**
 * 回调接口
 */
interface CallBack {
	/**
	 * 回调的方法
	 * @param result 是问题的答案
	 */
	public void answer(String result);
}

/**
 *小刘类：实现了回调接口CallBack（背景一）
 */
class Liu implements CallBack {
	/**
	 * 包含小高对象的引用（背景二）
	 */
	private Gao gao;

	public Liu (Gao gao) {
		this.gao = gao;
	}
	/**
	 * 小刘通过这个方法问小高
	 * @param question 小刘问"how to learn java?"
	 */
	public void askQuestion(String question) {
		gao.execute(Liu.this, question);
	}

	/**
	 * 小高知道答案后调用此方法告诉小刘
	 */
	public void answer(String result) {
		System.out.println("小高告诉小刘的答案是： " + result);
	}
}

/**
 *小高类
 */
class Gao {
	/**
	 * 相当于class B有一个参数为CallBack的方法C（背景三）
	 */
	public void execute(CallBack callBack, String question) {
		System.out.println("小刘问的问题是：" + question);
		//模拟小高挂电话后办自己的事
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//小高办完事后想到了答案
		String result = "Learning by yourself!";
		//小高打电话把答案告诉小刘，相当于classB反过来调用classA的D方法
		callBack.answer(result);
	}
}

public class TestCallBack {
	public static void main(String[] args) {
		Gao gao = new Gao();
		Liu liu = new Liu(gao);
		//小刘问问题
		liu.askQuestion("How to learn java?");
	}
}
