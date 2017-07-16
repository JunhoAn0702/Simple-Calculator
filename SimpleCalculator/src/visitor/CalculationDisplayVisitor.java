package visitor;

/**
 * The Class CalculationDisplayVisitor.
 */
public class CalculationDisplayVisitor implements CalculationVisitor{

	/* (non-Javadoc)
	 * @see visitor.CalculationVisitor#visit(visitor.Multiplication)
	 */
	@Override
	public void visit(Multiplication multiplication) {
		// TODO Auto-generated method stub
		Double num = multiplication.getModel().getCurrentNumber() * multiplication.getModel().getPreviousNumber();
		multiplication.getModel().setOnlyCurrentNumber(num);
		multiplication.getModel().setcalculatedValue(num);
	}

	/* (non-Javadoc)
	 * @see visitor.CalculationVisitor#visit(visitor.Addition)
	 */
	@Override
	public void visit(Addition addition) {
		// TODO Auto-generated method stub
		Double num = addition.getModel().getCurrentNumber() + addition.getModel().getPreviousNumber();
		addition.getModel().setOnlyCurrentNumber(num);
		addition.getModel().setcalculatedValue(num);
	}

	/* (non-Javadoc)
	 * @see visitor.CalculationVisitor#visit(visitor.Subtraction)
	 */
	@Override
	public void visit(Subtraction subtraction) {
		// TODO Auto-generated method stub
		Double num = subtraction.getModel().getPreviousNumber() - subtraction.getModel().getCurrentNumber();
		subtraction.getModel().setOnlyCurrentNumber(num);
		subtraction.getModel().setcalculatedValue(num);
	}

	/* (non-Javadoc)
	 * @see visitor.CalculationVisitor#visit(visitor.Division)
	 */
	@Override
	public void visit(Division division) {
		// TODO Auto-generated method stub
		Double num = division.getModel().getPreviousNumber() / division.getModel().getCurrentNumber();
		division.getModel().setOnlyCurrentNumber(num);
		division.getModel().setcalculatedValue(num);
	}

}
