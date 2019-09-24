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

    @GetMapping("/{name}")
    public List<Contact> findByName(@PathVariable(name = "name") String name) {
        log.info("GET REQUEST 'Find by name' SUCCESSFUL");
        log.info("NAME: " + name);
        var contact = contactService.findAllByName(name);
        return Objects.requireNonNull(contact);
    }

    @GetMapping("/{id}")
    public Contact findById(@PathVariable(name = "id") Integer id) {
        log.info("GET REQUEST 'Find by id' SUCCESSFUL");
        log.info("ID : " + id);
        var contact = contactService.findById(id);
        return Objects.requireNonNull(contact);
    }

    @GetMapping("/list")
    public List<Contact> findAll() {
        log.info("GET REQUEST 'Find all' SUCCESSFUL");
        var contacts = contactService.findAll();
        return Objects.requireNonNull(contacts);
    }

    @PostMapping("/save")
    public Contact saveContact(@RequestBody Contact contact) {
        log.info("POST REQUEST 'Save contact' SUCCESSFUL");
        Contact local = null;
        if (Objects.nonNull(contact)) {
            local = contactService.save(contact);
        }
        log.info("CONTACT : " + local);
        return local;
    }

    @PutMapping("/{id}")
    public Contact setContact(@PathVariable(name = "id") Integer id, @RequestBody Contact contact) {
        log.info("POST REQUEST 'Set contact' SUCCESSFUL");
        log.info("ID : " + id);
        log.info("Resetting contact : " + contact);
        var contactFromDB = contactService.findById(id);
        contact.setId(contactFromDB.getId());
        var local = contactService.save(contact);
        return Objects.requireNonNull(local);
    }

    @DeleteMapping("/{id}")
    public void deleteContact(@PathVariable(name = "id") Integer id) {
        log.info("POST REQUEST 'Save contact' SUCCESSFUL");
        contactService.removeById(id);
    }
}
