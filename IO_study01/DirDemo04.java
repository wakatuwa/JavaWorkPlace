package com.sxt.io;

import java.io.File;
/**
 * 
 * @author wanghan
 *递归：方法自己调用自己
 *打印子孙级目录和文件的名称
 *递归头：何时结束递归
 *递归体：重复调用
 *
 */
public class DirDemo04 {
	public static void main(String[] args) {
		File src = new File("D:\\JavaWorkplace\\IO_study01");
		printName(src, 0);
	}
	
	//打印子孙级目录和文件的名称
	public static void printName(File src, int deep) {
		for(int i = 0; i<deep; i++) {
			System.out.print("-");
		}
		System.out.println(src.getName());
		if(null == src || !src.exists()) {
			return;
		}
		else if(src.isDirectory()) {//目录
			for(File s: src.listFiles()) {
				printName(s, deep+1);
			}
		}
	}
}
