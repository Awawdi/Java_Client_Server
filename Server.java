/**
 * This Server class aims to run read emails send from client
 * whenever an email is received, email is read using readUTF method of DatainputStream and printed
 * Server socket instance will be listening on port 4000 of LOCALHOST 127.0.0.1, in order to be aligned with client 
 * Server will exit on Terminate command [ctrl+c]
 */
import java.net.*;
import java.io.*;

public class Server {

    /**constant variables of port number and server name */
    private static final String SERVER_NAME = "LOCALHOST";
    private static final int PORT_NUMBER = 4000;

    public static void main(String[] args) {

        // create new server socket for emails - listening on port 4000
        Socket socket = null;
        ServerSocket server = null;
        InputStream inputStream = null;

        try {
            server = new ServerSocket(PORT_NUMBER);

            while (true) {
                System.out.println("server.accept()...");
                socket = server.accept();

                inputStream = socket.getInputStream();
                DataInputStream DatainputStream = new DataInputStream(inputStream);

                String email = DatainputStream.readUTF();
                System.out.println(email);
            }
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            if (server != null) {
                try {
                    server.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}