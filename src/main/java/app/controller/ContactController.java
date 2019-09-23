package app.controller;

import app.domain.Contact;
import app.service.ContactService;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Log4j2
@RestController
@RequestMapping("/contact")
public class ContactController {

    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }


    @GetMapping
    public List<Contact> findBy(
            @RequestParam(name = "id", defaultValue = "-1") Integer id,
            @RequestParam(name = "name", defaultValue = "null") String name){
        log.info("REQUEST SUCCESSFUL");
        log.info("ID : " + id + "NAME : " + name);
        if (id!=-1){
            return Collections.singletonList(contactService.findById(id));
        }

        if (Objects.nonNull(name)){
            return contactService.findAllByName(name);
        }
        return Collections.EMPTY_LIST;
    }

    @GetMapping("/list")
    public List<Contact> findAll(){
        return contactService.findAll();
    }
}
