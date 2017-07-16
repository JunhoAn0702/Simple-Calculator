package state;

import model.SimpleCalculationModel;

/**
 * The Class ResetState.
 */
public class ResetState implements State{

	/* (non-Javadoc)
	 * @see state.State#doAction(state.Context)
	 */
	@Override
	public void doAction(Context context) {
		System.out.println("The value is reset");
		SimpleCalculationModel model = new SimpleCalculationModel();
		context.setState(model);
		context.getInputWindow().getOutputDisplay().setText("");
	}

}
