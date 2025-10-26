package ra.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeControler {
@RequestMapping("/home")
    public String home() {
    return "home";
}

@RequestMapping (value = "/form",method = RequestMethod.GET)
    public String form(@RequestParam("name") String name, Model model) {
    model.addAttribute("name", name);
    return "result";
}
}
