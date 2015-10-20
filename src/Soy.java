public class Soy extends CondimentDecrotor {

	// Attributes ///
	private Beverage compositeBeverage;

	public Soy(Beverage compositeBeverage) {
		this.compositeBeverage = compositeBeverage;
	}

	@Override
	public String getDescription() {
		return this.compositeBeverage.getDescription() + ", Soy";
	}

	@Override
	public double coast() {
		return 0.15 + this.compositeBeverage.coast();
	}

}