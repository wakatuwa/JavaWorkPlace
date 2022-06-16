package cn.test.wang;

import cn.sxt.oo.User; //表示导入了User类
import cn.sxt.oo.*; //表示导入整个包下的类，会降低编译速度，但不会降低运行速度
import java.util.Date;
import java.sql.*;
import static java.lang.Math.*;

public class Test {
	public static void main(String[] args) {
		//cn.sxt.oo.User user = new cn.sxt.oo.User();
		User user = new User();
		
		String str;
		
		java.util.Date date = new java.util.Date();
		
		System.out.println(Math.PI);
		System.out.println(PI);
	}
}
