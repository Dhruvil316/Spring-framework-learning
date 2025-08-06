package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {

//    prefix approach
//    @RequestMapping("/one")
//    public String One (){
//        System.out.println("Handler one");
//        return "redirect:/two" ;
//    }

    @RequestMapping("/one")
    public RedirectView One (){
        System.out.println("Handler one");
        RedirectView r = new RedirectView( ) ;
        r.setUrl("two"); // relative
        return r ;
    }

    @RequestMapping("/two/{id}")
    public String Two (@PathVariable("id") int user_id ) {
        System.out.printf("Handler two and the id : %d" , user_id );
        return "index" ;
    }
}
