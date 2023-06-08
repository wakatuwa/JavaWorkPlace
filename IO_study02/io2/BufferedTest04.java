package com.sxt.io2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

/**
 * 文件字符输出流
 * 1、创建源
 * 2、选择流
 * 3、操作（写出内容）
 * 4、释放资源
 * @author wanghan
 *
 */
public class BufferedTest04 {
	public static void main(String[] args) {
		//1、创建源
		File dest = new File("outchar.txt");
		//2、选择流
		//Writer writer = null;
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter(dest));
			//3、操作(写出)
			//写法一
//			String msg = "IO is so easy\r\n北京欢迎你";
//			char[] datas = msg.toCharArray();//字符串 --> 字符数组(编码)
//			writer.write(datas,0,datas.length);
			//写法二
//			String msg = "IO is so easy\r\n北京欢迎你";
//			writer.write(msg);
			//写法三
			writer.append("IO is so easy");
			writer.newLine();
			writer.append("北京欢迎你");
			writer.flush();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e){
			e.printStackTrace();
		}
			finally {
			//4、 释放资源
			try {
				if(null!=writer) {
					writer.close();
				}
			} catch(Exception e) {
				
			}
		
	}
}
}
