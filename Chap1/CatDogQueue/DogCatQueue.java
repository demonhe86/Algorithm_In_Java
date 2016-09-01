import java.util.LinkedList;
import java.util.Queue;

//TODO 
// 1 package
// 2 RuntimeException
// 3 多态
public class DogCatQueue {
	private Queue<PetEnterQueue> catQueue;
	private Queue<PetEnterQueue> dogQueue;
	private long count;

	public DogCatQueue() {
		this.catQueue = new LinkedList<PetEnterQueue>();
		this.dogQueue = new LinkedList<PetEnterQueue>();
		this.count = 0; 
	}

	public void add(Pet pet){
		if (pet.getPetType().equals("cat")) {
			this.catQueue.add(new PetEnterQueue(pet, this.count++));
		} else if (pet.getPetType().equals("dog")) {
			this.dogQueue.add(new PetEnterQueue(pet, this.count++));
		} else {
			throw new RuntimeException("err, not dog or cat");	// 需要考虑既不是猫也不是狗的情况
		}
	}

	public Pet pollAll() {
		if (!this.catQueue.isEmpty() && !this.dogQueue.isEmpty()) {	//都不空
			if (this.dogQueue.peek().getCount() < this.catQueue.peek().getCount()) {
				return this.dogQueue.poll().getPet();
			} else {
				return this.catQueue.poll().getPet();
			}
		} else if (!this.catQueue.isEmpty()) {	// 一个空
			return this.catQueue.poll().getPet();
		} else if (!this.dogQueue.isEmpty()) {
			return this.dogQueue.poll().getPet();
		} else {	// 都空
			throw new RuntimeException("err, Queue is empty!");
		}
	}

	public Dog pollDog() {
		if (!this.isDogEmpty()) {	// 需要考虑空的情况
			return (Dog) this.dogQueue.poll().getPet();
		} else {
			throw new RuntimeException("Dog queue is empty!");
		}
		
	}

	public Cat pollCat() {
		if (!this.isCatEmpty()) {	// 需要考虑空的情况
			return (Cat) this.catQueue.poll().getPet();
		} else {
			throw new RuntimeException("Cat queue is empty");
		}
		
	}

	public boolean isEmpty() {
		// if (this.catQueue.isEmpty() && this.dogQueue.isEmpty()) {
		// 	return true;
		// } else {
		// 	return false;
		// }

		return this.catQueue.isEmpty() && this.dogQueue.isEmpty(); //简化的写法
	}

	public boolean isDogEmpty() {
		return this.dogQueue.isEmpty();
	}

	public boolean isCatEmpty() {
		return this.catQueue.isEmpty();

	}



}