package com.sxt.io;

import java.io.File;

/**
 * 
 * @author wanghan
 *
 */
public class FileDemo01 {
	public static void main(String[] args) {
		/**
		 * 构建file对象
		 * 相对路径和绝对路径
		 * 1.存在盘符：绝对路径
		 * 2.不存在盘符：相对路径
		 */
		String path = "D:/JavaWorkplace/IO_study01/IO.jpg";
		
//		//1.构建File对象
//		File src = new File(path);
//		System.out.println(src.length());
//		
//		//2.构建File对象
//		src = new File("D:/JavaWorkplace/IO_study01","IO.jpg");
//		src = new File("D:/JavaWorkplace/","IO_study01/IO.jpg");
//		System.out.println(src.length());
//		
//		//3.构建File对象
//		src = new File(new File("D:/JavaWorkplace/IO_study01"),"IO.jpg");
//		System.out.println(src.length());
		
		//绝对路径
		File src = new File(path);
		System.out.println(src.getAbsolutePath());
		
		
		//相对路径
		System.out.println(System.getProperty("user.dir"));
		src = new File("IO.jpg");
		System.out.println(src.getAbsolutePath());
		
		//构建一个不存在的文件
		src = new File("aaa/IO2.jpg");
		System.out.println(src.getAbsolutePath());
	}
}
