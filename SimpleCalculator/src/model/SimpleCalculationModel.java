package model;
import java.awt.event.*;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.*;

import state.Context;

/**
 * The Class SimpleCalculationModel.
 */
public class SimpleCalculationModel {
	
	/** The current number. */
	private Double currentNumber;
	
	/** The previous number. */
	private Double previousNumber;
	
	/** The previous previous number. */
	private Double previousPreviousNumber;
	
	/** The current calculation. */
	private String currentCalculation;
	
	/** The previous calculation. */
	private String previousCalculation;
	
	/** The previous previous calculation. */
	private String previousPreviousCalculation;
	
	/** The calculated value. */
	private Double calculatedValue;
	
	/** The math equations. */
	private ArrayList<String> mathEquations;
	
	/**
	 * Instantiates a new simple calculation model.
	 */
	public SimpleCalculationModel() {
		this.currentNumber = 0.0;
		this.previousNumber = 0.0;
		this.previousPreviousNumber = 0.0;
		this.currentCalculation = "";
		this.previousCalculation = "";
		this.previousPreviousCalculation = "";
		this.calculatedValue = 0.0;
		this.mathEquations = new ArrayList<String>();
	}
	
	/**
	 * Gets the current number.
	 *
	 * @return the current number
	 */
	public Double getCurrentNumber() {
		return currentNumber;
	}

	/**
	 * Gets the previous number.
	 *
	 * @return the previous number
	 */
	public Double getPreviousNumber() {
		return previousNumber;
	}

	/**
	 * Gets the previous previous number.
	 *
	 * @return the previous previous number
	 */
	public Double getPreviousPreviousNumber() {
		return previousPreviousNumber;
	}

	/**
	 * Gets the current calculation.
	 *
	 * @return the current calculation
	 */
	public String getCurrentCalculation() {
		return currentCalculation;
	}

	/**
	 * Gets the previous calculation.
	 *
	 * @return the previous calculation
	 */
	public String getPreviousCalculation() {
		return previousCalculation;
	}

	/**
	 * Gets the previous previous calculation.
	 *
	 * @return the previous previous calculation
	 */
	public String getPreviousPreviousCalculation() {
		return previousPreviousCalculation;
	}
	
	/**
	 * Gets the math equations.
	 *
	 * @return the math equations
	 */
	public ArrayList<String> getMathEquations() {
		return mathEquations;
	}

	/**
	 * Sets the math equations.
	 *
	 * @param mathEquations the new math equations
	 */
	public void setMathEquations(ArrayList<String> mathEquations) {
		this.mathEquations = mathEquations;
	}
	
	/**
	 * Gets the calculated value.
	 *
	 * @return the calculated value
	 */
	public Double getCalculatedValue() {
		return calculatedValue;
	}

	/**
	 * Sets the calculated value.
	 *
	 * @param calculatedValue the new calculated value
	 */
	public void setcalculatedValue(Double calculatedValue) {
		this.calculatedValue = calculatedValue;
	}

	/**
	 * Gets the action listener list.
	 *
	 * @return the action listener list
	 */
	public ArrayList<ActionListener> getActionListenerList() {
		return actionListenerList;
	}

	/**
	 * List to keep track of who is registered to listen for events from the SimpleCalculationModel.
	 */
	private ArrayList<ActionListener> actionListenerList;

	/**
	 * Sets the current number.
	 *
	 * @param currentNumber the new current number
	 */
	public void setCurrentNumber(Double currentNumber) {
		this.previousPreviousNumber = this.previousNumber;
		this.previousNumber = this.currentNumber;
		this.currentNumber = currentNumber;
		this.previousPreviousCalculation = this.previousCalculation;
		this.previousCalculation = this.currentCalculation;
		this.currentCalculation = "";
		this.mathEquations.add(this.currentNumber.toString());
		System.out.println();
		System.out.println("Previous Previous Number: " + this.previousPreviousNumber);
		System.out.println("Previous Number: " + this.previousNumber);
		System.out.println("Current Number: " + this.currentNumber);
		System.out.println("Previous Previous Calculation: " + this.previousPreviousCalculation);
		System.out.println("Previous Calculation: " + this.previousCalculation);
		System.out.println("Current Calculation: " + this.currentCalculation);
		System.out.println("Math Equation: " + this.mathEquations);
		processEvent(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "set current/previous number"));
	}
	
	/**
	 * Sets the current calculation.
	 *
	 * @param currentCalculation the current calculation
	 * @param socket the socket
	 */
	public void setCurrentCalculation(String currentCalculation, Socket socket) {
		this.currentCalculation = currentCalculation;
		if(!this.currentCalculation.equals("")){
			this.mathEquations.add(this.currentCalculation);
		}
		if(this.currentCalculation.equals("=")) {
			this.mathEquations.add(this.calculatedValue.toString());
			ObjectOutputStream out;
			try {
				out = new ObjectOutputStream(
						socket.getOutputStream());
				out.writeObject(this.mathEquations);
			} catch (IOException e) {
				System.out.println("Failed to send the equation to the server");
			}
			
		}
		System.out.println();
		System.out.println("Previous Previous Number: " + this.previousPreviousNumber);
		System.out.println("Previous Number: " + this.previousNumber);
		System.out.println("Current Number: " + this.currentNumber);
		System.out.println("Previous Previous Calculation: " + this.previousPreviousCalculation);
		System.out.println("Previous Calculation: " + this.previousCalculation);
		System.out.println("Current Calculation: " + this.currentCalculation);
		System.out.println("Math Equation: " + this.mathEquations);
		processEvent(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "set current/previous calculation"));
	}
	
	/**
	 * Update current number.
	 *
	 * @param currentNumber the current number
	 */
	public void updateCurrentNumber(Double currentNumber) {
		this.currentNumber = this.currentNumber*10 + currentNumber;
		if(this.mathEquations.size() != 0) {
			this.mathEquations.set(this.mathEquations.size()-1, Double.toString(this.currentNumber));
		}
		else{
			this.mathEquations.add(this.currentNumber.toString());
		}
		System.out.println();
		System.out.println("Previous Previous Number: " + this.previousPreviousNumber);
		System.out.println("Previous Number: " + this.previousNumber);
		System.out.println("Current Number: " + this.currentNumber);
		System.out.println("Previous Previous Calculation: " + this.previousPreviousCalculation);
		System.out.println("Previous Calculation: " + this.previousCalculation);
		System.out.println("Current Calculation: " + this.currentCalculation);
		System.out.println("Math Equation: " + this.mathEquations);
	}
	
	/**
	 * Sets the only current number.
	 *
	 * @param currentNumber the new only current number
	 */
	public void setOnlyCurrentNumber(Double currentNumber) {
		this.previousPreviousNumber = this.previousNumber;
		this.previousNumber = this.currentNumber;
		this.currentNumber = currentNumber;
//		this.mathEquations.add(this.currentCalculation);
	}
	
	/**
	 * Return to previous state.
	 */
	public void returnToPreviousState() {
//		this.currentCalculation = this.previousCalculation;
//		this.previousCalculation = this.previousPreviousCalculation;
//		this.previousPreviousCalculation = "";
		this.mathEquations.remove(this.mathEquations.size()-1);
	}
	
	/**
	 * Register an action event listener.
	 *
	 * @param l the l
	 */
	public synchronized void addActionListener(ActionListener l) {
		if (actionListenerList == null)
			actionListenerList = new ArrayList<ActionListener>();
		actionListenerList.add(l);
	}
	
	/**
	 * Remove an action event listener.
	 *
	 * @param l the l
	 */
	public synchronized void removeActionListener(ActionListener l) {
		if (actionListenerList != null && actionListenerList.contains(l))
			actionListenerList.remove(l);
	}
	
	/**
	 * Fire event.
	 *
	 * @param e the e
	 */
	private void processEvent(ActionEvent e) {
		ArrayList<ActionListener> list;
		
		synchronized (this) {
			if (actionListenerList == null) return;
			list = (ArrayList<ActionListener>)actionListenerList.clone();
		}
		
		for (int i = 0; i < list.size(); i++) {
			ActionListener listener = list.get(i);
			listener.actionPerformed(e);
		}
	}
}