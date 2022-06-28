package core.four;

import java.time.*;

/**
 * 打印当月的日历，当天的日期带*号
 * @author wanghan
 *
 */

public class CalendarTest {
	public static void main(String[] args) {
		//初始化当前日期
		LocalDate date = LocalDate.now();
		//得到当前的月份和日期
		int month = date.getMonthValue();
		int today = date.getDayOfMonth();

		date = date.minusDays(today - 1);	//将date设置为这个月的第一天
		DayOfWeek weekday = date.getDayOfWeek();	//得到这一天是星期几
		int value = weekday.getValue();	//1 = Monday, 2 = Tuesday,..

		//打印头两行
		System.out.println("Mon Tue Wed Thu Fri Sat Sun");
		for(int i = 1; i<value; i++) {
			System.out.print("    ");
		}

		//date遍历，打印日历
		while(date.getMonthValue()==month) {
			System.out.printf("%3d", date.getDayOfMonth());
			if(date.getDayOfMonth() == today)
				System.out.print("*");
			else
				System.out.print(" ");
			date = date.plusDays(1);
			if(date.getDayOfWeek().getValue()==1)
				System.out.println();
		}
	}
}
