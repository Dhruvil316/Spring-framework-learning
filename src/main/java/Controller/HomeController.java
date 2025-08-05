package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String root(Model model) {
        model.addAttribute("name" , "Prisha rana");
        List<String> arr = new ArrayList<>() ;
        arr.add("Dhruvil");
        arr.add("Chetan");
        arr.add("Pu");

        model.addAttribute("list" , arr) ;
        return "index";
    }
//    this is page/view name
    @RequestMapping("/home")
    public String home () {
        System.out.println("This is home URL ");
        return "home";
    }

    @RequestMapping("/help")
    public ModelAndView help () {
        System.out.println("Help controller");

//        create the model and view object
        ModelAndView m = new ModelAndView( ) ;

//        setting data
        m.addObject("name" , "Dhruvil") ;
        m.addObject("father" , "Chetan") ;

//        setting the view name
        m.setViewName("help");
        return m ;
    }

}

//we need to config : Annotation  for the @Controller bcoz it is annotation base
