package upgard;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //controller registers the class as a Spring MVC controllrt in the IOC container
public class HelloWorldController {

    @RequestMapping("/hellospring")   //maps a specific URL request with the controller method
  //  @ResponseBody                     //sends a given data as a part of HTTP response object
  public String helloSpring(){
        //Thymeleaf & the dispatcher servlet intercept the return "index" & find the index.html file in the appropriate folder
      return "index";
  }
}
