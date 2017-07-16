package visitor;

/**
 * The Interface CalculationVisitor.
 */
public interface CalculationVisitor {
	
	/**
	 * Visit.
	 *
	 * @param multiplication the multiplication
	 */
	public void visit(Multiplication multiplication);
	
	/**
	 * Visit.
	 *
	 * @param addition the addition
	 */
	public void visit(Addition addition);
	
	/**
	 * Visit.
	 *
	 * @param subtraction the subtraction
	 */
	public void visit(Subtraction subtraction);
	
	/**
	 * Visit.
	 *
	 * @param division the division
	 */
	public void visit(Division division);
}
