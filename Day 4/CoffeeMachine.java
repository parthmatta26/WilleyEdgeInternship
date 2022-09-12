
public class CoffeeMachine {

	public static void main(String[] args) {
		Coffee coffee = Coffee.LATTE;
		System.out.println("You Ordered: " + coffee);
		System.out.println("Your Bill: " + coffee.coffeeCost());
	}
}
