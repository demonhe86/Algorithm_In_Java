import java.util.LinkedList;
/**
* arr = {4, 3, 5, 4, 3, 3, 6, 7}
* w = 3
* res = [5, 5, 5, 4, 6, 7]
*/
public class MaxWindowArr {

	public static int[] getMaxWindow(int[] arr, int w) {
		if (arr == null || w < 1 || arr.length < w) {	//取数组长度为arr.length
			return null;
		}
		LinkedList<Integer> qmax = new LinkedList<Integer>();	// 双端队列
		int[] res = new int[arr.length - w + 1];				// 长度为arr.length - w + 1的数组，用来存放最后的返回结果
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			while (!qmax.isEmpty() && arr[qmax.peekLast()] <= arr[i]) { //qmax不空 且 qmax的最后一个元素小于arr[i], 则移除qmax队列的最后一个元素
				qmax.pollLast();
			}
			qmax.addLast(i);
			if (qmax.peekFirst() == i - w) {					// 清除过期元素
				qmax.pollFirst();
			}
			if(i >= w - 1) {
				res[index++] = arr[qmax.peekFirst()];			// 队首元素加入返回数组
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int[] arr = {4, 3, 5, 4, 3, 3, 6, 7};
		int[] res = getMaxWindow(arr, 3);
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}
	
}