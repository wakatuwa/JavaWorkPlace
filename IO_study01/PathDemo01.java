package com.sxt.io;

import java.io.File;

/**
 * 
 * @author wanghan
 *
 */
public class PathDemo01 {
	/**
	 * \ /名称分隔符 separator
	 */
	public static void main(String[] args) {
		String path = "D:\\JavaWorkplace\\IO_study01\\IO.jpg";
		System.out.println(File.separatorChar);
		
		//建议
		//1、 /
		path = "D:/JavaWorkplace/IO_study01/IO.jpg";
		//2.常量拼接
		path = "D:" + File.separator + "JavaWorkplace" + File.pathSeparator + "IO_study01" + "File.separator";
		System.out.println(path);
	}
}
