package view;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * The Class SimpleCalculatorWindow.
 */
public class SimpleCalculatorWindow extends JFrame {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 21305503976948004L;

	/** The output display. */
	JTextField outputDisplay = new JTextField(30);
	
	/** The button display zero. */
	JButton buttonDisplayZero = new JButton("0");
	
	/** The button display one. */
	JButton buttonDisplayOne = new JButton("1");
	
	/** The button display two. */
	JButton buttonDisplayTwo = new JButton("2");
	
	/** The button display three. */
	JButton buttonDisplayThree = new JButton("3");
	
	/** The button display four. */
	JButton buttonDisplayFour = new JButton("4");
	
	/** The button display five. */
	JButton buttonDisplayFive = new JButton("5");
	
	/** The button display six. */
	JButton buttonDisplaySix = new JButton("6");
	
	/** The button display seven. */
	JButton buttonDisplaySeven = new JButton("7");
	
	/** The button display eight. */
	JButton buttonDisplayEight = new JButton("8");
	
	/** The button display nine. */
	JButton buttonDisplayNine = new JButton("9");
	
	/** The button display plus. */
	JButton buttonDisplayPlus = new JButton("+");
	
	/** The button display minus. */
	JButton buttonDisplayMinus = new JButton("-");
	
	/** The button display mul. */
	JButton buttonDisplayMul = new JButton("*");
	
	/** The button display equal. */
	JButton buttonDisplayEqual= new JButton("=");
	
	/** The button display C. */
	JButton buttonDisplayC= new JButton("C");
	
	/** The button display div. */
	JButton buttonDisplayDiv = new JButton("/");
	
	/**
	 * Instantiates a new simple calculator window.
	 */
	public SimpleCalculatorWindow() {
		setTitle("Simple Calculator");
		// Create panels
		GridBagConstraints c = new GridBagConstraints();
		
		JPanel outputDisplayPanel = new JPanel(new GridBagLayout());
		outputDisplay.disable();
		c.gridx = 0;
		c.gridy = 0;
		c.insets = new Insets(0,0,0,30);
		outputDisplayPanel.add(outputDisplay, c);
		
		JPanel buttonDisplayPanel = new JPanel(new GridBagLayout());	
		c.gridx = 0;
		c.gridy = 1;
		c.insets = new Insets(10,10,0,10);
		buttonDisplayPanel.add(buttonDisplayOne, c);
		c.gridx = 1;
		c.gridy = 1;
		c.insets = new Insets(10,0,0,10);
		buttonDisplayPanel.add(buttonDisplayTwo, c);
		c.gridx = 2;
		c.gridy = 1;
		c.insets = new Insets(10,0,0,10);
		buttonDisplayPanel.add(buttonDisplayThree, c);
		c.gridx = 3;
		c.gridy = 1;
		c.insets = new Insets(10,40,0,10);
		buttonDisplayPanel.add(buttonDisplayPlus, c);
		c.gridx = 0;
		c.gridy = 2;
		c.insets = new Insets(10,10,0,10);
		buttonDisplayPanel.add(buttonDisplayFour, c);
		c.gridx = 1;
		c.gridy = 2;
		c.insets = new Insets(10,0,0,10);
		buttonDisplayPanel.add(buttonDisplayFive, c);
		c.gridx = 2;
		c.gridy = 2;
		c.insets = new Insets(10,0,0,10);
		buttonDisplayPanel.add(buttonDisplaySix, c);
		c.gridx = 3;
		c.gridy = 2;
		c.insets = new Insets(10,40,0,10);
		buttonDisplayPanel.add(buttonDisplayMinus, c);
		c.gridx = 0;
		c.gridy = 3;
		c.insets = new Insets(10,10,0,10);
		buttonDisplayPanel.add(buttonDisplaySeven, c);
		c.gridx = 1;
		c.gridy = 3;
		c.insets = new Insets(10,0,0,10);
		buttonDisplayPanel.add(buttonDisplayEight, c);
		c.gridx = 2;
		c.gridy = 3;
		c.insets = new Insets(10,0,0,10);
		buttonDisplayPanel.add(buttonDisplayNine, c);
		c.gridx = 3;
		c.gridy = 3;
		c.insets = new Insets(10,40,0,10);
		buttonDisplayPanel.add(buttonDisplayMul, c);
		c.gridx = 0;
		c.gridy = 4;
		c.insets = new Insets(10,10,10,10);
		buttonDisplayPanel.add(buttonDisplayZero, c);
		c.gridx = 1;
		c.gridy = 4;
		c.insets = new Insets(10,0,10,10);
		buttonDisplayPanel.add(buttonDisplayEqual, c);
		c.gridx = 2;
		c.gridy = 4;
		c.insets = new Insets(10,0,10,10);
		buttonDisplayPanel.add(buttonDisplayC, c);
		c.gridx = 3;
		c.gridy = 4;
		c.insets = new Insets(10,40,10,10);
		buttonDisplayPanel.add(buttonDisplayDiv, c);
		
		// Set up the content pane and add all the panels to it.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridBagLayout());
		c.gridx = 0;
		c.gridy = 0;
		add(outputDisplayPanel, c);
		c.gridx = 0;
		c.gridy = 1;
		c.insets = new Insets(10,0,0,0);
		add(buttonDisplayPanel, c);
		pack();
		setVisible(true);
	}

	/**
	 * Gets the output display.
	 *
	 * @return the output display
	 */
	public JTextField getOutputDisplay() {
		return outputDisplay;
	}

	/**
	 * Gets the button display zero.
	 *
	 * @return the button display zero
	 */
	public JButton getButtonDisplayZero() {
		return buttonDisplayZero;
	}
	
	/**
	 * Gets the button display one.
	 *
	 * @return the button display one
	 */
	public JButton getButtonDisplayOne() {
		return buttonDisplayOne;
	}
	
	/**
	 * Gets the button display two.
	 *
	 * @return the button display two
	 */
	public JButton getButtonDisplayTwo() {
		return buttonDisplayTwo;
	}
	
	/**
	 * Gets the button display three.
	 *
	 * @return the button display three
	 */
	public JButton getButtonDisplayThree() {
		return buttonDisplayThree;
	}
	
	/**
	 * Gets the button display four.
	 *
	 * @return the button display four
	 */
	public JButton getButtonDisplayFour() {
		return buttonDisplayFour;
	}
	
	/**
	 * Gets the button display five.
	 *
	 * @return the button display five
	 */
	public JButton getButtonDisplayFive() {
		return buttonDisplayFive;
	}
	
	/**
	 * Gets the button display six.
	 *
	 * @return the button display six
	 */
	public JButton getButtonDisplaySix() {
		return buttonDisplaySix;
	}
	
	/**
	 * Gets the button display seven.
	 *
	 * @return the button display seven
	 */
	public JButton getButtonDisplaySeven() {
		return buttonDisplaySeven;
	}
	
	/**
	 * Gets the button display eight.
	 *
	 * @return the button display eight
	 */
	public JButton getButtonDisplayEight() {
		return buttonDisplayEight;
	}
	
	/**
	 * Gets the button display nine.
	 *
	 * @return the button display nine
	 */
	public JButton getButtonDisplayNine() {
		return buttonDisplayNine;
	}
	
	/**
	 * Gets the button display plus.
	 *
	 * @return the button display plus
	 */
	public JButton getButtonDisplayPlus() {
		return buttonDisplayPlus;
	}
	
	/**
	 * Gets the button display minus.
	 *
	 * @return the button display minus
	 */
	public JButton getButtonDisplayMinus() {
		return buttonDisplayMinus;
	}
	
	/**
	 * Gets the button display mul.
	 *
	 * @return the button display mul
	 */
	public JButton getButtonDisplayMul() {
		return buttonDisplayMul;
	}
	
	/**
	 * Gets the button display equal.
	 *
	 * @return the button display equal
	 */
	public JButton getButtonDisplayEqual() {
		return buttonDisplayEqual;
	}
	
	/**
	 * Gets the button display C.
	 *
	 * @return the button display C
	 */
	public JButton getButtonDisplayC() {
		return buttonDisplayC;
	}
	
	/**
	 * Gets the button display div.
	 *
	 * @return the button display div
	 */
	public JButton getButtonDisplayDiv() {
		return buttonDisplayDiv;
	}

//
//	public void clearInputFields() {
//		jtfName.setText("");
//		jtfState.setText("");
//		jtfPopulation.setText("");
//		jcbYear.setSelectedIndex(0);
//	}
}
