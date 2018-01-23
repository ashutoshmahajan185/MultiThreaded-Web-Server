import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer {
	
	ServerSocket server_socket;
	public int PORT = 6969;
	
	public static void main(String[] args) throws Exception {

		WebServer web_server = new WebServer();
		web_server.runServer();
		
	}

	public void runServer() throws Exception {
		
		System.out.println("Multi-Threaded Web Server has now Started");
		System.out.println("Enter \"localhost:" + PORT + "/abm523.html\" in your web browser.");
		server_socket = new ServerSocket(PORT);
		processHTTPRequest();
		
	}

	public void processHTTPRequest() {
		
		while(true) {	
			System.out.println("\nConnection established on port: " + PORT);
			Socket socket = null;
			try {
				socket = server_socket.accept();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			Connection connection = null;
			try {
				connection = new Connection(socket);
			} catch (Exception e) {
				e.printStackTrace();
			}
			connection.start();			
		}
		
	}
	
}
