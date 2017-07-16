package observer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.SimpleCalculationModel;
import state.Context;
import state.ResetState;
import state.UpdateState;
import view.SimpleCalculatorWindow;

/**
 * An asynchronous update interface for receiving notifications
 * about NonNumberAction information as the NonNumberAction is constructed.
 */
public class NonNumberActionObserver extends Observer{

	/** The input view. */
	private SimpleCalculatorWindow inputView;
	
	/** The context. */
	private Context context;
	
	/**
	 * This method is called when information about an NonNumberAction
	 * which was previously requested using an asynchronous
	 * interface becomes available.
	 *
	 * @param context the context
	 */
	public NonNumberActionObserver(Context context) {
//		this.model = model;
//		this.inputView = inputView;
		this.context = context;
	}
	
	/* (non-Javadoc)
	 * @see observer.Observer#update()
	 */
	@Override
	public void update() {
		// TODO Auto-generated method stub
		this.registerLisners();
	}
	
	/**
	 * This method is called when information about an NonNumberAction
	 * which was previously requested using an asynchronous
	 * interface becomes available.
	 */
	public void registerLisners() {

		// Register listeners
		context.getInputWindow().getButtonDisplayPlus().addActionListener(new AddPlusListener());
		context.getInputWindow().getButtonDisplayMinus().addActionListener(new AddMinusListener());
		context.getInputWindow().getButtonDisplayMul().addActionListener(new AddMulListener());
		context.getInputWindow().getButtonDisplayEqual().addActionListener(new AddEqualListener());
		context.getInputWindow().getButtonDisplayC().addActionListener(new AddCListener());
		context.getInputWindow().getButtonDisplayDiv().addActionListener(new AddDivListener());
		
		System.out.println("Non-number listeners registered in controller for input window");
	}
	
	/**
	 * The listener interface for receiving addPlus events.
	 * The class that is interested in processing a addPlus
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addAddPlusListener<code> method. When
	 * the addPlus event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see AddPlusEvent
	 */
	private class AddPlusListener implements ActionListener {
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			if(context.getState() != null && !isInitialState()){
				UpdateState updateState = new UpdateState();
				context.setCurrentInput(context.getInputWindow().getButtonDisplayPlus().getText());
				updateState.doAction(context);
			}
		}
	}
	
	/**
	 * The listener interface for receiving addMinus events.
	 * The class that is interested in processing a addMinus
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addAddMinusListener<code> method. When
	 * the addMinus event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see AddMinusEvent
	 */
	private class AddMinusListener implements ActionListener {
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			if(context.getState() != null && !isInitialState()){
				UpdateState updateState = new UpdateState();
				context.setCurrentInput(context.getInputWindow().getButtonDisplayMinus().getText());
				updateState.doAction(context);
			}
		}
	}
	
	/**
	 * The listener interface for receiving addMul events.
	 * The class that is interested in processing a addMul
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addAddMulListener<code> method. When
	 * the addMul event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see AddMulEvent
	 */
	private class AddMulListener implements ActionListener {
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			if(context.getState() != null && !isInitialState()){
				UpdateState updateState = new UpdateState();
				context.setCurrentInput(context.getInputWindow().getButtonDisplayMul().getText());
				updateState.doAction(context);
			}
		}
	}
	
	/**
	 * The listener interface for receiving addEqual events.
	 * The class that is interested in processing a addEqual
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addAddEqualListener<code> method. When
	 * the addEqual event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see AddEqualEvent
	 */
	private class AddEqualListener implements ActionListener {
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			if(context.getState() != null && !isInitialState()){
				UpdateState updateState = new UpdateState();
				context.setCurrentInput(context.getInputWindow().getButtonDisplayEqual().getText());
				updateState.doAction(context);
			}
		}
	}
	
	/**
	 * The listener interface for receiving addC events.
	 * The class that is interested in processing a addC
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addAddCListener<code> method. When
	 * the addC event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see AddCEvent
	 */
	private class AddCListener implements ActionListener {
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			if(context.getState() != null && !isInitialState()){
				ResetState resetState = new ResetState();
				resetState.doAction(context);
				context.getState().setCurrentCalculation("", context.getSocket());
			}
		}
	}
	
	/**
	 * The listener interface for receiving addDiv events.
	 * The class that is interested in processing a addDiv
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addAddDivListener<code> method. When
	 * the addDiv event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see AddDivEvent
	 */
	private class AddDivListener implements ActionListener {
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			if(context.getState() != null && !isInitialState()){
				UpdateState updateState = new UpdateState();
				context.setCurrentInput(context.getInputWindow().getButtonDisplayDiv().getText());
				updateState.doAction(context);
			}
		}
	}
	
	/**
	 * This method is called when information about an NonNumberAction
	 * which was previously requested using an asynchronous
	 * interface becomes available.
	 *
	 * @return true, if checks if is initial state
	 */
	public boolean isInitialState(){
		if(context.getModel().getCurrentNumber() == 0.0 && 
				context.getModel().getPreviousNumber() == 0.0 && 
				context.getModel().getPreviousPreviousNumber() == 0.0 &&
				context.getModel().getCurrentCalculation() == "" &&
				context.getModel().getPreviousCalculation() == "" &&
				context.getModel().getPreviousPreviousCalculation() == "") {
			return true;
		}
		return false;
	}

}
