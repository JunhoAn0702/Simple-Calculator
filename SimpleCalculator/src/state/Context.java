package state;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import view.SimpleCalculatorWindow;
import model.SimpleCalculationModel;

/**
 * The Class Context.
 */
public class Context {
	
	/** The model. */
	private SimpleCalculationModel model;
	
	/** The input window. */
	private SimpleCalculatorWindow theInputWindow;
	
	/** The current input. */
	private String currentInput;
	
	/** The socket. */
	private Socket socket;
	
	/**
	 * Instantiates a new context.
	 */
	public Context(){
		try {
			socket = new Socket("localhost", 9876);
			model = new SimpleCalculationModel();
			theInputWindow = new SimpleCalculatorWindow();
			currentInput = ""; 
		} catch (UnknownHostException e) {
			
		} catch (IOException e) {
			System.out.println("The server local host port 9876 does not exist!");
		}
	}
	
	/**
	 * Gets the model.
	 *
	 * @return the model
	 */
	public SimpleCalculationModel getModel(){
		return this.model;
	}
	
	/**
	 * Gets the input window.
	 *
	 * @return the input window
	 */
	public SimpleCalculatorWindow getInputWindow(){
		return this.theInputWindow;
	}

	/**
	 * Sets the state.
	 *
	 * @param model the new state
	 */
	public void setState(SimpleCalculationModel model){
		this.model = model;		
	}

	/**
	 * Gets the state.
	 *
	 * @return the state
	 */
	public SimpleCalculationModel getState(){
		return model;
	}
	
	/**
	 * Gets the currrent input.
	 *
	 * @return the currrent input
	 */
	public String getCurrrentInput(){
		return this.currentInput;
	}
	
	/**
	 * Sets the current input.
	 *
	 * @param currentInput the new current input
	 */
	public void setCurrentInput(String currentInput){
		this.currentInput = currentInput;
	}
	
	/**
	 * Gets the socket.
	 *
	 * @return the socket
	 */
	public Socket getSocket(){
		return this.socket;
	}
	
}
