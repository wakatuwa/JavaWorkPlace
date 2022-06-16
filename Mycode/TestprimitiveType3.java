/**
 * 测试字符类型和布尔类型
 * @author wanghan
 *
 */
public class TestprimitiveType3 {
	public static void main(String[] args) {
		char a = 'T';
		char b = '尚';
		char c = '\u0061';
		System.out.println(c);
		
		//转义字符
		System.out.println(""+'a'+'\n'+'b');
		System.out.println(""+'a'+'\t'+'b');
		System.out.println(""+'a'+'\''+'b');	//a'b
		
		//String就是字符序列
		String d = "abc";
		System.out.println(d);
		
		//测试布尔类型
		boolean man = true;
		
		if(man) {	//极其不推荐 man == true这样的写法
			System.out.println("男性");
		}
	}
}
