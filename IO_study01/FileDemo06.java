package com.sxt.io;

import java.io.File;
import java.io.IOException;

/**
 * 其他信息:
 * createNewFile() : 不成功存在才撞见，存在则创建失败
 * delete() : 删除已经存在的文件
 * @author wanghan
 *
 */
public class FileDemo06 {
	public static void main(String[] args) {
		File src = new File("D:/JavaWorkplace/IO_study01/IO.txt");
		boolean flag = false;
		try {
			flag = src.createNewFile();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		System.out.println(flag);
		
		flag = src.delete();
		System.out.println(flag);
		
		System.out.println("------------");
		
		//不是文件夹
		src = new File("D:/JavaWorkplace/IO_study02");
		flag  = false;
		try {
			flag = src.createNewFile();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		System.out.println(flag);
		
		flag = src.delete();
		System.out.println(flag);
		
		//补充：
		//如下con com3...操作系统的设备名，文件名非法，无法创建
		src = new File("D:/JavaWorkplace/IO_study01/con");
		try {
			src.createNewFile();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}
