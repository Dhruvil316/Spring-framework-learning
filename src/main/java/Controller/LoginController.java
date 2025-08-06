package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import jakarta.servlet.http.HttpServletRequest;
import Model.User ;

@Controller
public class LoginController {

    @RequestMapping(path = "/login" , method = RequestMethod.GET )
    public String login() {
        int a = 10 / 0 ;
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

//    By default badha exception par run thasey
//The @ExceptionHandler method must declare the type of exception it handles.

    @ExceptionHandler(Exception.class)
    public String exceptionHandlerNull (Model m ) {
        m.addAttribute("msg" , "some exceptino") ;
        return "exception" ;
    }
}
