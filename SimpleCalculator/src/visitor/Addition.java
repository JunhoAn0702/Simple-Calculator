package visitor;

import model.SimpleCalculationModel;

/**
 * The Class Addition.
 */
public class Addition implements Calculation{

	/** The model. */
	private SimpleCalculationModel model;
	
	/**
	 * Instantiates a new addition.
	 *
	 * @param model the model
	 */
	public Addition(SimpleCalculationModel model) {
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
		calculationVisitor.visit(this);
	}

}
