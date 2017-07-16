package observer;

/**
 * The Class Observer.
 */
public abstract class Observer {
   
   /** The subject. */
   protected Subject subject;
   
   /**
    * Update.
    */
   public abstract void update();
}