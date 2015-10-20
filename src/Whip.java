public class Whip extends CondimentDecrotor {

	// Attributes ///
	private Beverage compositeBeverage;

	public Whip(Beverage compositeBeverage) {
		this.compositeBeverage = compositeBeverage;
	}

	@Override
	public String getDescription() {
		return this.compositeBeverage.getDescription() + ", Whip";
	}

	@Override
	public double coast() {
		return 0.10 + this.compositeBeverage.coast();
	}

}