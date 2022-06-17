package IoTechnology;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 利用文件字符字节流实现文件的复制
 * @author wanghan
 *
 */
public class TestFileCopy2 {
	public static void main(String[] args) {
		//写法和使用stream基本一样。只不过，读取时是读取的字符。
		FileReader fr = null;
		FileWriter fw = null;
		int len = 0;
		try {
			fr = new FileReader("F:/a.txt");
			fw = new FileWriter("F:/d.txt");
			//缓冲字符数组，提高效率
			char[] buffer = new char[1024];
			//边读边写
			while ((len = fr.read(buffer)) != -1) {
				fw.write(buffer, 0, len);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fw != null) {
					fw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if(fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
