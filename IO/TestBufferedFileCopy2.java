package IoTechnology;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 测试缓冲字符流
 * @author wanghan
 *
 */
public class TestBufferedFileCopy2 {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		String tempString = "";
		try {
			fr = new FileReader("F:/a.txt");
			fw = new FileWriter("F:/d.txt");
			//使用缓冲字符流进行包装
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			//BufferedReader提供了更方便的readline()方法，直接按行读取文本
			//br.readLine()方法的返回值是一个字符串对象，即文本的一行内容
			while ((tempString = br.readLine()) != null) {
				//将读取的一行字符串写入文件中
				bw.write(tempString);
				//下次写入之前先换行，否则会在上一行后边继续追加，而不是另起一行
				bw.newLine();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();

		} finally {
			try {
				if (bw != null)
					bw.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			try {
				if (br != null)
					br.close();
			} catch (IOException e1) {
				e1.printStackTrace();

			}
			try {
				if (fw != null)
					fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if (fr != null)
					fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
}
