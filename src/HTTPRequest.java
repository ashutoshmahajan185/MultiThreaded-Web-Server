public class HTTPRequest {
	
	String filename;

	public HTTPRequest(String request) {
	
		String lines[] = request.split("\n"); 
		System.out.println(lines[0]);
		filename = lines[0].split(" ")[1];
				
	}

}
