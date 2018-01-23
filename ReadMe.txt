Simple Multi-Threaded Web Server
Ashutosh Mahajan N15565485 abm523

This implementation uses simple Java Sockets and predefined HTML pages.
The implementation is capable of opening multiples web-pages on a single server/port with the help of Threads.
Proper location of HTML pages and assignment of the port is necessary for running the Web Server.

Classes
	--> WebServer: Includes the methods runServer and processHTTPRequest. Defines the server port and the HTTP connection.
	--> Connection: Defines a constructor used for creation of a connection. Implements the run methods which introduces multi-threading and thus enables to handle multiples web pages.
				Defines, processes and displays the HTTP request and reply frames as well as the contents of the HTML file that is requested.
	--> HTTPRequest: Defines and processes the HTTP Request Frame.
	--> HTTPResponse: Defines and processes the HTTP Response Frame. Processes the contents of HTML file requested for its display.
	
Steps for Execution
	--> Change the location of source in HTTPResponse to the directory where the web pages are stored
	--> Adjust the port in WebServer if desired (the port should not have anything running on it)
	--> Run the WebServer file
	--> Copy the address displayed in the console window to a web browser
	--> Multiple pages can be opened using the hyper-links on the default page
	--> Contents of HTTP Request and Response as well as that of the web page will be displayed in the console
	