package CatDogQueue;
public class Test {
	public static void main(String[] args) {
		DogCatQueue dogCatqueue = new DogCatQueue();
		System.out.println(dogCatqueue.isEmpty());
		System.out.println(dogCatqueue.isDogEmpty());
		System.out.println(dogCatqueue.isCatEmpty());

		System.out.println("==============================");

		dogCatqueue.add(new Dog());
		dogCatqueue.add(new Cat());
		dogCatqueue.add(new Cat());
		dogCatqueue.add(new Dog());
		dogCatqueue.add(new Dog());

		System.out.println(dogCatqueue.isEmpty());
		System.out.println(dogCatqueue.isDogEmpty());
		System.out.println(dogCatqueue.isCatEmpty());
		System.out.println("==============================");

		System.out.println(dogCatqueue.pollCat());
		System.out.println(dogCatqueue.pollAll());
		System.out.println(dogCatqueue.pollDog());

		System.out.println(dogCatqueue.isEmpty());
		System.out.println(dogCatqueue.isDogEmpty());
		System.out.println(dogCatqueue.isCatEmpty());
		System.out.println("==============================");


		System.out.println(dogCatqueue.pollAll());
		System.out.println(dogCatqueue.pollAll());

		System.out.println(dogCatqueue.isEmpty());
		System.out.println(dogCatqueue.isDogEmpty());
		System.out.println(dogCatqueue.isCatEmpty());




	}
}