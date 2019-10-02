import food.Fruit;

class Run {
	public static void main(String[] args) {
		Apple apple = new Apple();
		apple.identify();
	}
}

class Apple extends Fruit {
	String whoIAm = "apple";
	
	public void identify () {
		System.out.println(whoIAm);
	}
}
