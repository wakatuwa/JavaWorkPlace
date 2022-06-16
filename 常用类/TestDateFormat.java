package cn.sxt.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 测试时间对象和字符串之间的互相转换
 * 
 * @author wanghan
 *
 */
public class TestDateFormat {
	public static void main(String[] args) throws ParseException {
		
		//把时间对象按照“格式字符串指定的格式’转成相应的字符串
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String str = df.format(new Date(40000000));
		System.out.println(str);
		
		//反过来
		DateFormat df2 = new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒");
		Date date = df2.parse("1983年5月10日 10时34分23秒");
		System.out.println(date);
		
		//测试其他的格式字符。比如：利用D，获得本事件对象是所处年份的第几天。
		DateFormat df3 = new SimpleDateFormat("D");
		String str3 = df3.format(new Date());
		System.out.println(str3);
	}
}
