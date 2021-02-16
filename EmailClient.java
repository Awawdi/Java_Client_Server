import java.io.*;
import java.net.*;

public class EmailClient {
	/** constant variables of port number and server name */
	private static final String SERVER_NAME = "LOCALHOST";
	private static final int PORT_NUMBER = 4000;

	/**
	 * Socket ,OutputStream, DataOutputStream instances to be used in dispatch method
	 */
	private Socket socket = null;
	private OutputStream os = null;
	private DataOutputStream dos = null;

	public void dispach(Email email) {
		try {
			socket = new Socket(SERVER_NAME, PORT_NUMBER);
			System.out.println("--------------------START-----------");
			os = socket.getOutputStream();
			System.out.println("output stream was created...");
			dos = new DataOutputStream(os);
			System.out.println("data output stream was created...");

			dos.writeUTF(email.toString());

			System.out.println("SERVER : " + SERVER_NAME + " port number: " + PORT_NUMBER);
			System.out.println("The following email was sent to the server...\n");
			System.out.println(email.toString() + "\n");
			System.out.println("--------------------END-----------");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			if (os != null) {
				try {
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (dos != null) {
				try {
					dos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (socket != null) {
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}