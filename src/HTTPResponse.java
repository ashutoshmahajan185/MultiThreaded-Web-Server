import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class HTTPResponse {

	HTTPRequest request;
	String response = null;
	String source = "D:\\Eclipse Java\\workspace\\MultiThreaded Web Server\\src";
		
	public HTTPResponse(HTTPRequest request) {

		this.request = request;
		String CRLF = " \r\n";
		File file = new File(source + request.filename);
		
		try {
			
			FileInputStream file_input_stream = new FileInputStream(file);
			System.out.println("\n----Start of Response Frame----");
			response = "HTTP/1.1 200" + CRLF;
			response = response + "Server: Multi-Threaded Web Server/1.0" + CRLF;
			response = response + "Content-Type: text/html" + CRLF;
			response = response + "Connection: keep-alive" + CRLF;
			response = response + "Content-Length: " + file.length() + CRLF;
			response = response + CRLF; 
			System.out.print(response);
			System.out.println("----End of Response Frame----");
			
			int stream_char;
			try { //Print contents of file to console
				while ((stream_char = file_input_stream.read()) != -1){
					response = response + (char)stream_char;
				}
				System.out.println("----Contents of the requested file----");
				System.out.print(response);
				System.out.println("\n----Contents of the requested file----");
			} catch (IOException e) {
				System.out.println(e);
			}	
		} catch(FileNotFoundException e) { 
			response = response.replace("200", "404"); //File not found			
		}		
	}
}
