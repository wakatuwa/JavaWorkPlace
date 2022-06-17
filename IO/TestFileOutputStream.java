package IoTechnology;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 将字符串/字节数组的内容写入到文件中
 * @author wanghan
 *
 */
public class TestFileOutputStream {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		String string = "海上升明月" ;
		try {
			//true表示内容会追加到文件末尾；false表示重写整个文件内容
			fos = new FileOutputStream("F:/a.txt", true);
			//该方法是直接将一个字节数组写入文件中；而write(int n)是写入一个字节
			fos.write(string.getBytes());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
