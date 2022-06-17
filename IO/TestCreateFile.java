package IoTechnology;

import java.io.File;
import java.io.IOException;

/**
 * 创建多级文件
 * @author wanghan
 *
 */
public class TestCreateFile {
	public static void main(String[] args) {
		test1();
	}

	public static void test1() {
		File file = new File("F:/电影/华语/大陆/java学习.mp4");
		File dir = file.getParentFile();
		if( !dir.exists()) {
			dir.mkdirs();
		}
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
