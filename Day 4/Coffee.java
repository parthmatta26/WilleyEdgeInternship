
public enum Coffee {
	LATTE(3), CAPPUCHINO(5), EXPRESSO(10), AMERICANO(12);
	private int coffeebeans;
	private Coffee(int coffeebeans) {
		this.coffeebeans = coffeebeans;
	}
	public int coffeeCost() {
		return coffeebeans*20;
	}
}
