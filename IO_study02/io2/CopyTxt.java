package com.sxt.io2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 文件拷贝：文件字节输入、输出流  加入缓冲流
 * 1、创建源
 * 2、选择流
 * 3、操作
 * 4、释放资源
 * @author wanghan
 *
 */
public class CopyTxt {
	public static void main(String[] args) {
		//copy("src/com/sxt/io/Copy.java", "copy.txt");
		copy("abc.txt", "pcopy.txt");
	}
	
	/**
	 * 文件的拷贝
	 * 思考：利用递归拷贝文件夹
	 * @param srcPath
	 * @param destPath
	 */
//	public static void copy(String srcPath, String destPath) {
//		//1、创建源
//		File src = new File(srcPath);//源头
//		File dest = new File(destPath);//目的地
//		//2、选择流
//		InputStream is = null;
//		OutputStream os = null;
//		try {
//			//3、操作(分段读取)
//			is = new FileInputStream(src);
//			os = new FileOutputStream(dest);
//			byte[] flush = new byte[1024]; //缓冲容器
//			int len = -1; //接收长度
//			while((len=is.read(flush))!=-1) {
//				os.write(flush, 0, len);//分段写出
//				
//			}
//			os.flush();
//		} catch(FileNotFoundException e) {
//			e.printStackTrace();
//		} catch(IOException e) {
//			e.printStackTrace();
//		} finally {
//			//4、释放资源 分别关闭 先打开的后关闭
//			try {
//				if(null!=os) {
//					os.close();
//				}
//			} catch(IOException e) {
//				e.printStackTrace();
//			}
//			
//			try {
//				if(null!=is) {
//					is.close();
//				}
//			} catch(IOException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//	
	public static void copy(String srcPath, String destPath) {
		//1、创建源
		File src = new File(srcPath);//源头
		File dest = new File(destPath);//目的地
		//2、选择流
		try(BufferedReader br = new BufferedReader( new FileReader(src));
			BufferedWriter bw = new BufferedWriter( new FileWriter(dest));) {
			//3、操作(逐行读取)
			String line = null;
			while((line=br.readLine())!=null) {
				bw.write(line);//逐行写出
				bw.newLine();
			}
			bw.flush();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
