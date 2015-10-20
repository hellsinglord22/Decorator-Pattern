
public class StartBuzzCoffee {

	public static void main(String[] args) {
		Beverage beverage = new Milk(new Whip(new Mocha(new HouseBlend())));
		System.out.printf("%s : %.2f USD\n" , beverage.getDescription() , beverage.coast());

	}

}
