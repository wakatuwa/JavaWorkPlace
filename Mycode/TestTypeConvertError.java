/**
 * 测试类型转换常见问题
 * @author wanghan
 *
 */
public class TestTypeConvertError {
	public static void main(String[] args) {
		int money = 1000000000;//10亿
		int years = 20;
		//返回的total是负数，超过了int的范围
		int total = money*years;
		System.out.println("toatal=" +total);
		//返回的total值仍是负数，数据已经丢失
		System.out.println("total=" +total);
		//返回的total2正确，现将一个因子变成long，整个表达式发生提升，全部用long计算
		long total2 = money*((long)years);
		System.out.println("total=" +total2);
		
		long total3 = 34L*3223*years*223423;
		System.out.println(total3);
		//命名问题
		int I = 2;//分不清是L还是1
		long a = 2345L;//建议使用大写的L		
		System.out.println(I+1);
	}
}
