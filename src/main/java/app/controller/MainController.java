package app.controller;

import app.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Alvin
 **/
@Controller
@RequestMapping("/")
public class MainController {

    @Value("${spring.profiles.active}")
    private String profile;

    private final ContactService contactService;

    @Autowired
    public MainController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping
    public String main(Model model){
        model.addAttribute("contacts", contactService.findAll());
        model.addAttribute("isDevMode", "dev".equals(profile));
        return "index";
    }
}
