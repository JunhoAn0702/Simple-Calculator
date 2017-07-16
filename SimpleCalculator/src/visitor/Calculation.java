package visitor;

/**
 * The Interface Calculation.
 */
public interface Calculation {
	
	/**
	 * Accept.
	 *
	 * @param calculationVisitor the calculation visitor
	 */
	public void accept(CalculationVisitor calculationVisitor);
}
