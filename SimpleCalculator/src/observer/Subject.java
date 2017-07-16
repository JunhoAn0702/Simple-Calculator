package observer;
import java.util.ArrayList;
import java.util.List;

/**
 * The Class Subject.
 */
public class Subject {
	
   /** The observers. */
   private List<Observer> observers = new ArrayList<Observer>();
   
   /** The state. */
   private int state;

   /**
    * Gets the state.
    *
    * @return the state
    */
   public int getState() {
      return state;
   }

   /**
    * Sets the state.
    *
    * @param state the new state
    */
   public void setState(int state) {
      this.state = state;
      notifyAllObservers();
   }

   /**
    * Attach.
    *
    * @param observer the observer
    */
   public void attach(Observer observer){
      observers.add(observer);		
   }

   /**
    * Notify all observers.
    */
   public void notifyAllObservers(){
      for (Observer observer : observers) {
         observer.update();
      }
   } 	
}