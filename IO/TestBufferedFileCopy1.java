package IoTechnology;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用缓冲流实现文件的高效复制
 * @author wanghan
 *
 */
public class TestBufferedFileCopy1 {
	public static void main(String[] args) {
		// 使用缓冲字节流实现复制
		long time1 = System.currentTimeMillis();
		copyFile1("F:/电影/华语/大陆/java学习.mp4", "F:/电影/华语/大陆/java学习技术 "+"越来越好.mp4");
		long time2 = System.currentTimeMillis();
		System.out.println("缓冲字节流花费的时间为: " + (time2 - time1));

		// 使用普通字节流实现复制
		long time3 = System.currentTimeMillis();
		copyFile2("F:/电影/华语/大陆/java学习.mp4", "F:/电影/华语/大陆/java学习技术 "+"越来越好2.mp4");
		long time4 = System.currentTimeMillis();
		System.out.println("普通字节流花费的时间为： " + (time4 - time3));
	}

	/**缓冲字节流实现的文件复制方法*/
	static void copyFile1(String src, String dec) {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		int temp = 0;
		try {
			fis = new FileInputStream(src);
			fos = new FileOutputStream(dec);
			//使用缓冲字节流包装文件字节流，增加缓冲功能，提高效率
			//缓存区的大小(缓存数组的长度)默认是8192, 也可以自己指定大小
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			while ((temp = bis.read()) != -1) {
				bos.write(temp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//注意:增加处理流后，注意流的关闭顺序！后开的先关闭
			try {
				if (bos != null) {
					bos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if (bis != null) {
					bis.close();
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if (fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**普通字节流实现的文件复制的方法*/
	static void copyFile2(String src, String dec) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		int temp = 0;
		try {
			fis = new FileInputStream(src);
			fos = new FileOutputStream(dec);
			while ((temp = fis.read()) != -1) {
				fos.write(temp);
			}
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
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
