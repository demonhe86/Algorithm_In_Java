import java.util.Queue;
import java.util.LinkedList; 


public class StackImplementByTwoQueues{
	private LinkedList<Integer> queue1;		// 用于存数据
	private LinkedList<Integer> queue2;

	public StackImplementByTwoQueues() {
		queue1 = new LinkedList<Integer>();
		queue2 = new LinkedList<Integer>();
	}

	public void push(Integer o){
		queue1.add(o);
	}

	public Integer pop() {
		int size = queue1.size();
		for(int i = 0; i < size; i++) {
			queue2.add(queue1.remove());
		}

		for (int i = 0; i < size - 1; i++){
			queue1.add(queue2.remove());
		}

		return queue2.remove();
	}




	public static void main(String args[]){
		StackImplementByTwoQueues stack = new StackImplementByTwoQueues();
		stack.push(1);
		stack.push(2);
		stack.push(3);

		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

	}

}