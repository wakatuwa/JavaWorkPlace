package IoTechnology;

import java.io.FileInputStream;

/**
 * 测试流读取文件内容
 * @author wanghan
 *
 */
public class TestIO1 {
	public static void main(String[] args) {
		try {
			// 创建输入流
			FileInputStream fis = new FileInputStream("F:/a.txt");	//文件内容是：abc
			//一个字节一个字节的读取数据
			int s1 = fis.read();	//打印输入字符a对应的ASCII码值97
			int s2 = fis.read();	//打印输入字符b对应的ASCII码值98
			int s3 = fis.read();	//打印输入字符c对应的ASCII码值99
			int s4 = fis.read();	//文件读取完毕，返回-1
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);
			System.out.println(s4);
			//流对象使用完，必须关闭！不然，总占用系统资源，最终会造成系统崩溃！
			fis.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
