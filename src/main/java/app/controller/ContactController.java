package app.controller;

import app.domain.Contact;
import app.repos.ContactRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactController {

    private final ContactRepos contactRepos;

    @Autowired
    public ContactController(ContactRepos contactRepos) {
        this.contactRepos = contactRepos;
    }

    @GetMapping("/{id}")
    public Contact findById(@PathVariable Integer id){
        System.out.println(contactRepos.findById(id).get());
        return contactRepos.findById(id).get();
    }

    @GetMapping("/list")
    public List<Contact> findAll(){
        return contactRepos.findAll();
    }
}
