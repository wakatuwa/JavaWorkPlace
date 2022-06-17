package IoTechnology;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Date;

/**
 * 测试对象流
 * @author wanghan
 *
 */
public class TestObjectStream {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		write();
		read();
	}
	/**使用对象输出流将数据写入文件*/
	public static void write() {
		//创建object输出流，并包装缓冲流，增加缓冲功能
		OutputStream os = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		try {
			os = new FileOutputStream(new File("F:/data.txt"));
			bos = new BufferedOutputStream(os);
			oos = new ObjectOutputStream(bos);
			// 使用object输出流
			// 对象流也可以对基本数据类型进行读写操作
			oos.writeInt(12);
			oos.writeDouble(3.14);
			oos.writeChar('A');
			oos.writeBoolean(true);
			oos.writeUTF("learning java");
			//对象流能够对对象数据类型进行读写操作
			//Date是系统提供的类，已经实现序列化接口
			//如果是自定义类，则需要自己实现序列化接口
			oos.writeObject(new Date());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//关闭输出流
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (bos != null) {
				try {
					bos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (os != null) {
				try {
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	/**使用对象输入流读取文件*/
	public static void read() {
		//创建object输入流，并包装缓冲流，增加缓冲功能
		InputStream is = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
		try {
			is = new FileInputStream(new File("F:/data.txt"));
			bis = new BufferedInputStream(is);
			ois = new ObjectInputStream(bis);
			System.out.println("int: " + ois.readInt());
			System.out.println("double: " + ois.readDouble());
			System.out.println("char: " + ois.readChar());
			System.out.println("boolean: " + ois.readBoolean());
			System.out.println("uft :" + ois.readUTF());
			System.out.println("date: " + ois.readObject().toString());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//关闭输入流
			if (ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (bis != null) {
				try {
					bis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (is != null) {
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
