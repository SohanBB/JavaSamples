import java.io.*;
import java.net.*;

public class ServerSideSocket {

	public static void main(String[] args) {
		try {
			// Create a ServerSocket to listen on port 12345
			ServerSocket serverSocket = new ServerSocket(12345);
			System.out.println("Server is waiting for client to connect...");

			// Accept client connections (this blocks until a client connects)
			Socket clientSocket = serverSocket.accept();
			System.out.println("Client connected!");

			// Create input stream to receive messages from the client
			BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

			// Continuously read messages from the client
			String clientMessage;
			while ((clientMessage = input.readLine()) != null) {
				System.out.println("Received from client: " + clientMessage);
			}

			// Close the input stream and the socket
			input.close();
			clientSocket.close();
			serverSocket.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
