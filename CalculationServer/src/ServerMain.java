import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 * The Class ServerMain.
 * Multithreading server
 */
public class ServerMain {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public static void main(String[] args) throws IOException{
		
		// bind this server to a port
		ServerSocket server = new ServerSocket(9876);
		ArrayList<ArrayList<String>> results = new ArrayList<ArrayList<String>>();
		System.out.println("Waiting for the client to connect");
		// While loop to run the server
		while(true){
			// Create a socket object which will talk to the client.
			Socket client = server.accept();
			// Blocks until client is connected.
			if(client.isConnected()){
				// For every incoming request, server creates a thread to
				// handle the client request.
				RequestHandler rh = new RequestHandler(client, results);
				rh.start();
				RequestKeyboardInput rki = new RequestKeyboardInput(results);
				rki.start();
			}
		}
	}
}
