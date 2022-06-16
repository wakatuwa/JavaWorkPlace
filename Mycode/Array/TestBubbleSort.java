package Array;

import java.util.Arrays;

/**
 * 测试冒泡排序
 * @author wanghan
 *
 */
public class TestBubbleSort {
	public static void main(String[] args) {
		
		int[] values = {3, 1, 6, 2, 9, 0, 7, 4, 5, 8};
		int temp = 0;
		for(int j = 0; j<values.length-1-j; j++) {
			boolean flag = true;
			for(int i = 0; i<values.length-1; i++) {
				if(values[i] > values[i+1]) {
					temp = values[i];
					values[i] = values[i+1];
					values[i+1] = temp;
					flag = false;
				}
				System.out.println(Arrays.toString(values));
			}
			if (flag) {
				System.out.println("结束！");
				break;
			}
			System.out.println("##########");
		}
		
	}
}
