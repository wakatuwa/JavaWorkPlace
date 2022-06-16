package processcontrol;
/**
 * 测试Switch语句
 * 多值判断的时候，使用Switch美观，当然elseif可以做相同的功能
 * @author wanghan
 *
 */
public class TestSwitch {
	public static void main(String[] args) {
		int month = (int)(1+12*Math.random());
		System.out.println("月份：" +month);
	
	switch(month) {
	case 1:
		System.out.println("一月份！过年了！");
		break;
	case 2:
		System.out.println("二月份！龙抬头！");
		break;
	default:
		System.out.println("其他月份！");
		break;
	}
	
	System.out.println("###################");
	char c = 'a';
	int rand =(int)(26*Math.random());
	char c2 = (char)(c+rand);
	System.out.println(c2+":");
	switch(c2) {
	case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u':
		System.out.println("元音");
		break;
	case 'y':
	case 'w':
		System.out.println("半元音");
		break;
	default:
	System.out.println("辅音");
	
	}
	}
}