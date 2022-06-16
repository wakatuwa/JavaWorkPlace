package processcontrol;
/**
 * 测试递归
 * @author wanghan
 *
 */
public class TestRecursion {
	public static void main(String[] args) {
		long d1 = System.currentTimeMillis();//返回当前的时刻
		System.out.printf("%d阶乘的结果为：%s%n", 10, factorial(10));
		long d2 = System.currentTimeMillis();
		System.out.printf("递归费时： %s%n", d2 - d1);
		
		long d3 = System.currentTimeMillis();
        int a = 10;
        int result = 1;
        while (a > 1) {
            result *= a * (a - 1);
            a -= 2;
        }
        long d4 = System.currentTimeMillis();
        System.out.println(result);
        System.out.printf("普通循环费时：%s%n", d4 - d3);    
	}
	
	static long factorial(int n) {
		if(n==1) {
			return 1;
		} else {
			return n*factorial(n-1);
			
		}
	}
	
}
