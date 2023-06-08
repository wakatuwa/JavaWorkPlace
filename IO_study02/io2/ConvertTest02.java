package com.sxt.io2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;


/**
 * 转换流:InputStreamReader OutputStreamWriter
 * 1、以字符流的形式操作字节流（纯文本）
 * 2、指定字符集
 * @author wanghan
 *
 */
public class ConvertTest02 {
	public static void main(String[] args) {
		//操作网络流  下载指定网站的源代码
		try(BufferedReader reader = 
				new BufferedReader(
					new InputStreamReader( 
						new URL("https://bilibili.com/").openStream(),"UTF-8"));
			BufferedWriter writer = 
				new BufferedWriter(
					new OutputStreamWriter(
						new FileOutputStream("bilibili.html"),"UTF-8"))
				){
			//3、操作(读取)
			String msg;
			while((msg = reader.readLine())!=null) {
				//System.out.println(msg);
				writer.write(msg);
				writer.newLine();
			}
		} catch(IOException e) {
			System.out.println("操作异常");
		}
	}
	
	public static void test1() {
		//操作网络流  下载指定网站的源代码
		try(
		InputStream is = new URL("https://bilibili.com/").openStream();){
			//3、操作(读取)
			int temp;
			while((temp = is.read())!=-1) {
				System.out.print((char)temp);
			}
		} catch(IOException e) {
			System.out.println("操作异常");
		}
	}
	
	public static void test2() {
		//操作网络流  下载指定网站的源代码
		try(InputStreamReader is = 
				new InputStreamReader( new URL("https://bilibili.com/").openStream(),"UTF-8");){
			//3、操作(读取)
			int temp;
			while((temp = is.read())!=-1) {
				System.out.print((char)temp);
			}
		} catch(IOException e) {
			System.out.println("操作异常");
		}
	
	}	
}
