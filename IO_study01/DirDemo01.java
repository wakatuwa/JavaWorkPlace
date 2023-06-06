package com.sxt.io;

import java.io.File;

/**
 * 创建目录
 * 1.mkdir():确保上级目录存在，不存在创建失败
 * 2.mkidirs():上级目录可以不存在，不存在一同创建
 * @author wanghan
 *
 */
public class DirDemo01 {
	public static void main(String[] args) {
		File dir = new File("F:/java300/IO_study01/dir/test");
		//创建目录 mkdirs()
		boolean flag = dir.mkdirs();
		System.out.println(flag);
		//创建目录 mkdir()
		dir = new File("F:/java300/IO_study01/dir/test2");
		flag = dir.mkdirs();
		System.out.println(flag);
	}
}
