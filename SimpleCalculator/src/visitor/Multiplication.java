package visitor;

import model.SimpleCalculationModel;

/**
 * The Class Multiplication.
 */
public class Multiplication implements Calculation{
	
	/** The model. */
	private SimpleCalculationModel model;
	
	/**
	 * Instantiates a new multiplication.
	 *
	 * @param model the model
	 */
	public Multiplication(SimpleCalculationModel model) {
		this.model = model;
	}
	
	/**
	 * Gets the model.
	 *
	 * @return the model
	 */
	public SimpleCalculationModel getModel() {
		return this.model;
	}

	/* (non-Javadoc)
	 * @see visitor.Calculation#accept(visitor.CalculationVisitor)
	 */
	@Override
	public void accept(CalculationVisitor calculationVisitor) {
		// TODO Auto-generated method stub
		calculationVisitor.visit(this);
	}

}
