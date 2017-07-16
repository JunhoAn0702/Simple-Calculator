package Driver;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import model.SimpleCalculationModel;
import observer.NonNumberActionObserver;
import observer.NumberActionObserver;
import observer.Observer;
import observer.Subject;
import state.Context;
import view.SimpleCalculatorWindow;

/**
 * The Class Driver.
 */
public class Driver {
	
	/** The context. */
	static Context context = new Context();
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Subject subject = new Subject();
		subject.attach(new NumberActionObserver(context));
		subject.attach(new NonNumberActionObserver(context));
		if(context.getInputWindow() != null)
			subject.notifyAllObservers();
	}
}
