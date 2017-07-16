import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * The Class RequestHandler.
 */
public class RequestHandler extends Thread{
	
	/** The client socket. */
	private Socket clientSocket = null;
	private ArrayList<ArrayList<String>> results = new ArrayList<ArrayList<String>>();
	/**
	 * Instantiates a new request handler.
	 *
	 * @param _clientSocket the client socket
	 */
	public RequestHandler(Socket _clientSocket, ArrayList<ArrayList<String>> results){
		this.clientSocket = _clientSocket;
		this.results = results;
	}
	
	// run
	public void run(){
		while(true) {
		try{
			
			// Get an inputstream from the client
			ObjectInputStream objectInput = new ObjectInputStream(clientSocket.getInputStream());
			
			// Put the object to an arraylist.
			ArrayList<String> result = (ArrayList<String>) objectInput.readObject(); 
			results.add(result);
			
		} catch(IOException ioex) {
			ioex.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
