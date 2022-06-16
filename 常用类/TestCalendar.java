package cn.sxt.test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 测试日期类的使用
 * @author wanghan
 *
 */
public class TestCalendar {
	public static void main(String[] args) {
		//获得日期的相关元素
		Calendar calendar = new GregorianCalendar(2999, 10, 9, 22, 10, 50);
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int week = calendar.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(year);
		System.out.println(month);	//0-11表示对应的月份 10是11月
		System.out.println(week);	//1是星期日 7是星期六
		
		//设置日期的相关元素
		Calendar c2 = new GregorianCalendar();
		c2.set(Calendar.YEAR, 8012);
		
		System.out.println(c2);
		
		//日期的计算
		Calendar c3 = new GregorianCalendar();
		c3.add(Calendar.YEAR, -100);
		System.out.println(c3);
		
		//日期对象和时间对象的转化
		Date d4 = c3.getTime();
		Calendar c4 = new GregorianCalendar();
		c4.setTime(new Date());
		printCalendar(c4);
	}
	
	public static void printCalendar(Calendar c) {
		//
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;	//0-11
		int date = c.get(Calendar.DAY_OF_MONTH);
		int dayweek = c.get(Calendar.DAY_OF_WEEK)-1;//1是周日 
		
		String dayweek2 = dayweek == 0?"日":dayweek + "";
		
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		
		System.out.println(year + "年" + month + "月" + date + "日" + hour + "时" + minute + "分" + second + "秒"
				+"周" + dayweek2);
		
	}
}
