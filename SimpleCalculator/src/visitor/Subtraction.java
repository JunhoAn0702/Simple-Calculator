package visitor;

import model.SimpleCalculationModel;

/**
 * The Class Subtraction.
 */
public class Subtraction implements Calculation{
	
	/** The model. */
	private SimpleCalculationModel model;
	
	/**
	 * Instantiates a new subtraction.
	 *
	 * @param model the model
	 */
	public Subtraction(SimpleCalculationModel model) {
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
