package testWork;
/**
 * 3. 数组逆序操作：定义长度为10的数组，将数组元素对调，并输出对调前后的结果。

   思路：把0索引和arr.length-1的元素交换，把1索引和arr.length-2的元素交换…..

   只要交换到arr.length/2的时候即可。
 * @author wanghan
 *
 */
public class TestReverse {
	public static void main(String[] args) {
		reverse();
	}

	public static void reverse() {
		int[] array = new int[10];
		int temp;
		for(int i = 0; i<10; i++) {
			array[i] = i;
		}
		for(int kk: array ) {
			System.out.println(kk);
		}
		for(int i=0; i<5; i++) {
			temp = array[i];
			array[i] = array[array.length-i-1];
			array[array.length-i-1] = temp;
		}
		for(int kk: array) {
			System.out.println(kk);
		}
	}
}
