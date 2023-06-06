package com.sxt.io;

import java.io.File;

/**
 * 名称或路径
 * getName()
 * getPath(): 
 * getAbsolutePath():始终返回绝对路径
 * getParent()
 * 
 * @author wanghan
 *
 */
public class FileDemo03 {
	public static void main(String[] args) {
		File src = new File("D:\\JavaWorkplace\\IO_study01\\IO.jpg");
		
		System.out.println("名称：" + src.getName());
		System.out.println("路径：" + src.getPath());
		System.out.println("绝对路径:" + src.getAbsolutePath());
		System.out.println("父路径：" + src.getParent()); //将名称分隔符的前面路径取出来
		System.out.println("父对象：" + src.getParentFile().getName());
	}
}
