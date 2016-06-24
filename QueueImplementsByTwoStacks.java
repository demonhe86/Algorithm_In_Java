//由两个栈组成的队列
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class QueueImplementsByTwoStacks {
	private Stack<Integer> stack1;	//用来存数据
	private Stack<Integer> stack2;

	QueueImplementsByTwoStacks(){
		stack1 = new Stack<Integer>();
		stack2 = new Stack<Integer>();
	}

	public Integer pop(){
		if (stack1.isEmpty()) {
			return  null;
		}

		while (!stack1.isEmpty()) {
			Integer i = stack1.pop();
			stack2.push(i);
		}

		Integer re = stack2.pop();
		while(!stack2.isEmpty()) {
			Integer i = stack2.pop();
			stack1.push(i);
		}
		return re;
	}

	public void push(int o){
		stack1.push(o);
	}


	public static void main(String args[]) {
		QueueImplementsByTwoStacks qu = new QueueImplementsByTwoStacks();
		qu.push(1);
		qu.push(100);
		qu.push(2);
		qu.push(3);
		System.out.println(qu.pop());
		System.out.println(qu.pop());
		System.out.println(qu.pop());
		System.out.println(qu.pop());
	}


}