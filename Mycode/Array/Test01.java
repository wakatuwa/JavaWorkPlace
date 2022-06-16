package Array;

public class Test01 {
	public static void main(String[] args) {
		int[] arr01 = new int[10];
		for (int i=0; i< arr01.length; i++) {
			arr01[i] = 2 * i +1; //通过循环初始化数组，读取里面的值
			System.out.println(arr01[i]);
		}
		//arr01[10] = 10;	//java.lang.ArrayIndexOutOfBoundsException
		
		String arr02[];
		arr02 = new String[5];
		
		UserArray[] arr03;
		arr03 = new UserArray[3];
		
		arr03[0] = new UserArray(1001, "高琪");
		arr03[1] = new UserArray(1002, "高二琪");
		arr03[2] = new UserArray(1003 , "高三琪");
		
		for(int i=0; i<arr03.length; i++) {
			System.out.println(arr03[i].getName());
		}
	}
}


