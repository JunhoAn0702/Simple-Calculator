package state;

import javax.swing.JOptionPane;

import model.SimpleCalculationModel;
import visitor.Addition;
import visitor.Calculation;
import visitor.CalculationDisplayVisitor;
import visitor.CalculationVisitor;
import visitor.Division;
import visitor.Multiplication;
import visitor.Subtraction;

/**
 * The Class UpdateState.
 */
public class UpdateState implements State{
	
	/** The calculation. */
	private Calculation calculation;
	
	/* (non-Javadoc)
	 * @see state.State#doAction(state.Context)
	 */
	@Override
	public void doAction(Context context) {
		try{
			Double num = Double.parseDouble(context.getCurrrentInput());
			if(context.getModel().getCurrentCalculation().equals("=")) {
				context.setState(new SimpleCalculationModel());
				context.getInputWindow().getOutputDisplay().setText("");
			}
			
			if(context.getState().getCurrentCalculation().equals("")) {
				context.getState().updateCurrentNumber(num);
			}
			else {
				context.getState().setCurrentNumber(num);
			}
		} catch (NumberFormatException nfe) {
			if(context.getModel().getCurrentCalculation().equals("=") && 
					(context.getCurrrentInput().equals("=") || 
							context.getCurrrentInput().equals("+") || 
							context.getCurrrentInput().equals("-") || 
							context.getCurrrentInput().equals("*") || 
							context.getCurrrentInput().equals("/"))) {
				context.setState(new SimpleCalculationModel());
				context.getInputWindow().getOutputDisplay().setText("");
				context.setCurrentInput("");
			}
			else if(context.getModel().getCurrentCalculation() != "") {
				String[] buttons = { "Reset", "Discard" };

			    int rc = JOptionPane.showOptionDialog(null, "The current state is expecting a number input.", "Error Occured",
			        JOptionPane.WARNING_MESSAGE, 0, null, buttons, buttons[1]);
			    if(rc == 0) {
			    	context.setState(new SimpleCalculationModel());
					context.getInputWindow().getOutputDisplay().setText("");
					context.setCurrentInput("");
			    }
			    else if(rc == 1) {
			    	context.getModel().returnToPreviousState();
			    	context.setCurrentInput(context.getModel().getCurrentCalculation());
			    }
			}
			else if(!context.getState().getPreviousCalculation().equals("")) {
				System.out.println();
				if(context.getState().getPreviousCalculation().equals("+")) {
					System.out.println("Add");
					this.calculation = new Addition(context.getState());
					this.calculation.accept(new CalculationDisplayVisitor());
					displayResult(context);
				}
				else if(context.getState().getPreviousCalculation().equals("-")) {
					System.out.println("Sub");
					this.calculation = new Subtraction(context.getState());
					this.calculation.accept(new CalculationDisplayVisitor());
					displayResult(context);
				}
				else if(context.getState().getPreviousCalculation().equals("*")) {
					System.out.println("Mul");
					this.calculation = new Multiplication(context.getState());
					this.calculation.accept(new CalculationDisplayVisitor());
					displayResult(context);
				}
				else if(context.getState().getPreviousCalculation().equals("/")) {
					System.out.println("Div");
					this.calculation = new Division(context.getState());
					this.calculation.accept(new CalculationDisplayVisitor());
					displayResult(context);
				}
			}
			
			else if(context.getCurrrentInput().equals("=")) {
				if(!context.getModel().getCurrentCalculation().equals("")) {
					System.out.println("=");
					System.out.println("Current Number: " + context.getModel().getCurrentNumber());
					displayResult(context);
				}
				else {
					String[] buttons = { "Reset", "Discard" };

				    int rc = JOptionPane.showOptionDialog(null, "The current state is expecting a number input.", "Error Occured",
				        JOptionPane.WARNING_MESSAGE, 0, null, buttons, buttons[1]);
				    if(rc == 0) {
				    	context.setState(new SimpleCalculationModel());
						context.getInputWindow().getOutputDisplay().setText("");
						context.setCurrentInput("");
				    }
				    else if(rc == 1) {
//				    	context.getModel().returnToPreviousState();
				    	context.setCurrentInput(context.getModel().getCurrentCalculation());
				    }
				}
			}
			context.getState().setCurrentCalculation(context.getCurrrentInput(), context.getSocket());
		}
	}
	
	/**
	 * Display result.
	 *
	 * @param context the context
	 */
	public void displayResult(Context context) {
		if(context.getModel().getCurrentNumber() % 1 == 0){
			context.getInputWindow().getOutputDisplay().setText(Integer.toString(context.getModel().getCalculatedValue().intValue()));
		}
		else {
			context.getInputWindow().getOutputDisplay().setText(context.getModel().getCalculatedValue().toString());
		}
	}

}
