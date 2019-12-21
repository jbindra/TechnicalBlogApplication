package upgard;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//Servlet is essentially a Java class that responds to HTTP requests.

@WebServlet("/helloworld")    //component registers in springboot framework(HelloWorldApplication)
public class HelloWorldServlet extends HttpServlet {
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter writer = response.getWriter();
        writer.print("<!Doctype html>" );
        writer.print("<html>");
        writer.print("<head>");
        writer.print("<title>Hello World!</title>" );
        writer.print("</head>");
        writer.print("<body>");
        writer.print("<p>Welcome to HTML HelloWorld!</p>");
        writer.print("</body>");
        writer.print("</html>");
        //writer.write("Hello World!");
        writer.close();


    }
}
