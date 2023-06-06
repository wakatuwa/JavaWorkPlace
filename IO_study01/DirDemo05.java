package com.sxt.io;

import java.io.File;
/**
 * 
 * @author wanghan
 * 统计文件夹的大小
 *
 */
public class DirDemo05 {
	public static void main(String[] args) {
		File src = new File("D:\\JavaWorkplace\\IO_study01");
		count(src);
		System.out.println(len);
	}
	
	
	private static long len = 0;
	public static void count(File src) {
	
		//获取大小
		System.out.println(src.getName());
		if(null!=src&&src.exists()) {
			if(src.isFile()) {	//大小
				len += src.length();
			} else {	//子孙级
				for(File s:src.listFiles()) {
					count(s);
				}
				
			}
		}
	}
}
