package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import Model.Student ;
import java.util.List;

@Controller
public class ComplexFromController {

    @RequestMapping("/complex")
    public String complex () {
        return "complex-form" ;
    }

    @RequestMapping(path = "/handleform", method = RequestMethod.POST)
    public String formHandler(@ModelAttribute Student s  ){
        System.out.println(s) ;
        return "success" ;
    }

//    @RequestMapping(path = "/handleform", method = RequestMethod.POST)
//    public String formHandler(
//            @RequestParam("name") String name,
//            @RequestParam("id") Long id,
//            @RequestParam("dob") String dob,
//            @RequestParam("courses") List<String> courses,
//            @RequestParam("gender") String gender,
//            @RequestParam("type") String type,
//            Model model
//    ) {
//        // You can add all form data to the model if you want to use them in the success.jsp
//        model.addAttribute("name", name);
//        model.addAttribute("id", id);
//        model.addAttribute("dob", dob);
//        model.addAttribute("courses", courses);
//        model.addAttribute("gender", gender);
//        model.addAttribute("type", type);
//
//        return "success";
//    }



}
