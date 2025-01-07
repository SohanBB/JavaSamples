import java.io.*;
import java.net.*;

public class ClientSideSocket {

    public static void main(String[] args) {
        try {
            // Connect to the server running on localhost and port 12345
            Socket socket = new Socket("localhost", 12345);
            System.out.println("Connected to the server...");

            // Create input stream to read messages from the user
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            // Continuously take input from the user and send it to the server
            String message;
            while (true) {
                System.out.print("Enter message: ");
                message = userInput.readLine();
                if (message.equalsIgnoreCase("exit")) {
                    break;
                }
                output.println(message);
            }

            // Close the streams and socket
            userInput.close();
            output.close();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
