import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.ArrayList;

/**
 * The Class RequestKeyboardInput.
 */
public class RequestKeyboardInput extends Thread{

	/** The results. */
	private ArrayList<ArrayList<String>> results;
	
	/**
	 * Instantiates a new request keyboard input.
	 *
	 * @param results the results
	 */
	public RequestKeyboardInput(ArrayList<ArrayList<String>> results){
		this.results = results;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	// Receive keyboard inputs from the user and print the result out in a format
	public void run(){
		while(true) {
			String userInput = "";
			System.out.println("Please type \"Yes\" to display the total number of all the successful calculated math equations and the list all the equations");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
			try {
				userInput = br.readLine();
				if(userInput.equalsIgnoreCase("yes")) {
					System.out.println("1) The total number of all the successful calcualted math equations: " + results.size());
					System.out.println("2) The list of calcualted math equations: ");
					// Formatting
					for(int i = 0; i < results.size(); i++) {
						String convertListString = "";
						for(int j = 0; j < results.get(i).size(); j++) {
							try
							{
								Double d = Double.parseDouble(results.get(i).get(j));
								if(d % 1 == 0){
									convertListString += d.intValue() + "\t";
								}
								else {
									convertListString += d + "\t";
								}
							}
							catch(NumberFormatException e)
							{
								convertListString += results.get(i).get(j) + "\t";
							}
						}
						System.out.println(convertListString);
					}
					System.out.println();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
