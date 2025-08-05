package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestParam;
import Model.User ;

@Controller
public class LoginController {

    @RequestMapping(path = "/login" , method = RequestMethod.GET )
    public String login() {
        return "login" ;
    }
    //  OLD WAY -> Request object
//    @RequestMapping(path = "/process-login" , method = RequestMethod.POST )
//    public String processLogin ( HttpServletRequest request ) {
//        String email = request.getParameter ("email") ;
//        String password = request.getParameter ( "password" ) ;
//        System.out.println("data : " + email + " " + password);
//        return "" ;
//    }


//    NEW WAY -> 1) RequestParam
//    @RequestMapping(path = "/process-login" , method = RequestMethod.POST )
//    public String processLogin (@RequestParam("email") String email ,
//                                @RequestParam("password") String pwd ,
//                                Model model ) {
//
//        System.out.println("data : " + email + " " + pwd);
//
//        model.addAttribute("email" , email) ;
//        return "success" ;
//    }


//    NEW WAY -> 2) ModelAttribute
    @RequestMapping(path = "/process-login" , method = RequestMethod.POST )
    public String processLogin (@ModelAttribute User user ) {
//        model.addAttribute("user" , user) ; -> no need for this if we are using the model attribute
        return "success" ;
    }
}
