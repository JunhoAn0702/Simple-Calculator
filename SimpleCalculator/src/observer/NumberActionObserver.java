package observer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.SimpleCalculationModel;
import state.Context;
import state.ResetState;
import state.UpdateState;
import view.SimpleCalculatorWindow;
import visitor.Calculation;
import visitor.CalculationDisplayVisitor;

/**
 * An asynchronous update interface for receiving notifications
 * about NumberAction information as the NumberAction is constructed.
 */
public class NumberActionObserver extends Observer{

	/** The input view. */
	private SimpleCalculatorWindow inputView;
	
	/** The context. */
	private Context context;
	
	/**
	 * This method is called when information about an NumberAction
	 * which was previously requested using an asynchronous
	 * interface becomes available.
	 *
	 * @param context the context
	 */
	public NumberActionObserver(Context context) {
//		this.model = model;
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
	 * This method is called when information about an NumberAction
	 * which was previously requested using an asynchronous
	 * interface becomes available.
	 */
	public void registerLisners() {

		// Register listeners
		context.getInputWindow().getButtonDisplayZero().addActionListener(new AddNumberZeroListener());
		context.getInputWindow().getButtonDisplayOne().addActionListener(new AddNumberOneListener());
		context.getInputWindow().getButtonDisplayTwo().addActionListener(new AddNumberTwoListener());
		context.getInputWindow().getButtonDisplayThree().addActionListener(new AddNumberThreeListener());
		context.getInputWindow().getButtonDisplayFour().addActionListener(new AddNumberFourListener());
		context.getInputWindow().getButtonDisplayFive().addActionListener(new AddNumberFiveListener());
		context.getInputWindow().getButtonDisplaySix().addActionListener(new AddNumberSixListener());
		context.getInputWindow().getButtonDisplaySeven().addActionListener(new AddNumberSevenListener());
		context.getInputWindow().getButtonDisplayEight().addActionListener(new AddNumberEightListener());
		context.getInputWindow().getButtonDisplayNine().addActionListener(new AddNumberNineListener());
		
		System.out.println("Number listeners registered in controller for input window");
	}
	
	/**
	 * The listener interface for receiving addNumberZero events.
	 * The class that is interested in processing a addNumberZero
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addAddNumberZeroListener<code> method. When
	 * the addNumberZero event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see AddNumberZeroEvent
	 */
	private class AddNumberZeroListener implements ActionListener {
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			if(context.getState() != null){
				UpdateState updateState = new UpdateState();
				context.setCurrentInput(context.getInputWindow().getButtonDisplayZero().getText());
				updateState.doAction(context);
			}
		}
	}
	
	/**
	 * The listener interface for receiving addNumberOne events.
	 * The class that is interested in processing a addNumberOne
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addAddNumberOneListener<code> method. When
	 * the addNumberOne event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see AddNumberOneEvent
	 */
	private class AddNumberOneListener implements ActionListener {
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			if(context.getState() != null){
				UpdateState updateState = new UpdateState();
				context.setCurrentInput(context.getInputWindow().getButtonDisplayOne().getText());
				updateState.doAction(context);
			}
		}
	}
	
	/**
	 * The listener interface for receiving addNumberTwo events.
	 * The class that is interested in processing a addNumberTwo
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addAddNumberTwoListener<code> method. When
	 * the addNumberTwo event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see AddNumberTwoEvent
	 */
	private class AddNumberTwoListener implements ActionListener {
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			if(context.getState() != null){
				UpdateState updateState = new UpdateState();
				context.setCurrentInput(context.getInputWindow().getButtonDisplayTwo().getText());
				updateState.doAction(context);
			}
		}
	}
	
	/**
	 * The listener interface for receiving addNumberThree events.
	 * The class that is interested in processing a addNumberThree
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addAddNumberThreeListener<code> method. When
	 * the addNumberThree event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see AddNumberThreeEvent
	 */
	private class AddNumberThreeListener implements ActionListener {
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			if(context.getState() != null){
				UpdateState updateState = new UpdateState();
				context.setCurrentInput(context.getInputWindow().getButtonDisplayThree().getText());
				updateState.doAction(context);
			}
		}
	}
	
	/**
	 * The listener interface for receiving addNumberFour events.
	 * The class that is interested in processing a addNumberFour
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addAddNumberFourListener<code> method. When
	 * the addNumberFour event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see AddNumberFourEvent
	 */
	private class AddNumberFourListener implements ActionListener {
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			if(context.getState() != null){
				UpdateState updateState = new UpdateState();
				context.setCurrentInput(context.getInputWindow().getButtonDisplayFour().getText());
				updateState.doAction(context);
			}
		}
	}
	
	/**
	 * The listener interface for receiving addNumberFive events.
	 * The class that is interested in processing a addNumberFive
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addAddNumberFiveListener<code> method. When
	 * the addNumberFive event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see AddNumberFiveEvent
	 */
	private class AddNumberFiveListener implements ActionListener {
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			if(context.getState() != null){
				UpdateState updateState = new UpdateState();
				context.setCurrentInput(context.getInputWindow().getButtonDisplayFive().getText());
				updateState.doAction(context);
			}
		}
	}
	
	/**
	 * The listener interface for receiving addNumberSix events.
	 * The class that is interested in processing a addNumberSix
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addAddNumberSixListener<code> method. When
	 * the addNumberSix event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see AddNumberSixEvent
	 */
	private class AddNumberSixListener implements ActionListener {
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			if(context.getState() != null){
				UpdateState updateState = new UpdateState();
				context.setCurrentInput(context.getInputWindow().getButtonDisplaySix().getText());
				updateState.doAction(context);
			}
		}
	}
	
	/**
	 * The listener interface for receiving addNumberSeven events.
	 * The class that is interested in processing a addNumberSeven
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addAddNumberSevenListener<code> method. When
	 * the addNumberSeven event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see AddNumberSevenEvent
	 */
	private class AddNumberSevenListener implements ActionListener {
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			if(context.getState() != null){
				UpdateState updateState = new UpdateState();
				context.setCurrentInput(context.getInputWindow().getButtonDisplaySeven().getText());
				updateState.doAction(context);
			}
		}
	}
	
	/**
	 * The listener interface for receiving addNumberEight events.
	 * The class that is interested in processing a addNumberEight
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addAddNumberEightListener<code> method. When
	 * the addNumberEight event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see AddNumberEightEvent
	 */
	private class AddNumberEightListener implements ActionListener {
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			if(context.getState() != null){
				UpdateState updateState = new UpdateState();
				context.setCurrentInput(context.getInputWindow().getButtonDisplayEight().getText());
				updateState.doAction(context);
			}
		}
	}
	
	/**
	 * The listener interface for receiving addNumberNine events.
	 * The class that is interested in processing a addNumberNine
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addAddNumberNineListener<code> method. When
	 * the addNumberNine event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see AddNumberNineEvent
	 */
	private class AddNumberNineListener implements ActionListener {
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			if(context.getState() != null){
				UpdateState updateState = new UpdateState();
				context.setCurrentInput(context.getInputWindow().getButtonDisplayNine().getText());
				updateState.doAction(context);
			}
		}
	}

}


