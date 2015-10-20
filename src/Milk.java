
public class Milk extends CondimentDecrotor {

	// Attributes //
	private Beverage composteBeverage;

	/** Constructor **/
	public Milk(Beverage composteBeverage) {
		this.composteBeverage = composteBeverage;
	}

	@Override
	public String getDescription() {
		return composteBeverage.getDescription() + " ,Milk";
	}

	@Override
	public double coast() {
		return 0.10 + composteBeverage.coast();
	}

}
