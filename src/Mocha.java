public class Mocha extends CondimentDecrotor {

	// Attributes ///
	private Beverage compositeBeverage;

	public Mocha(Beverage compositeBeverage) {
		this.compositeBeverage = compositeBeverage;
	}

	@Override
	public String getDescription() {
		return this.compositeBeverage.getDescription() + ", Mocha";
	}

	@Override
	public double coast() {
		return 0.20 + this.compositeBeverage.coast();
	}

}