package com.sxt.io;

import java.awt.im.InputContext;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 文件拷贝：文件字节输入、输出流
 * 1、创建源
 * 2、选择流
 * 3、操作
 * 4、释放资源
 * @author wanghan
 *
 */
public class Copy {
	public static void main(String[] args) {
		//copy("src/com/sxt/io/Copy.java", "copy.txt");
		copy("p.jpg", "pcopy.jpg");
	}
	public static void copy(String srcPath, String destPath) {
		//1、创建源
		File src = new File(srcPath);//源头
		File dest = new File(destPath);//目的地
		//2、选择流
		InputStream is = null;
		OutputStream os = null;
		try {
			//3、操作(分段读取)
			is = new FileInputStream(src);
			os = new FileOutputStream(dest);
			byte[] flush = new byte[1024]; //缓冲容器
			int len = -1; //接收长度
			while((len=is.read(flush))!=-1) {
				os.write(flush, 0, len);
				
			}
			os.flush();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			//4、释放资源 分别关闭 先打开的后关闭
			try {
				if(null!=os) {
					os.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
			
			try {
				if(null!=is) {
					is.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
