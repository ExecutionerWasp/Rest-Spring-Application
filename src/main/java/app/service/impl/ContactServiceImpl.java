package app.service.impl;

import app.domain.Contact;
import app.repos.ContactRepos;
import app.service.ContactService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {

    private final ContactRepos contactRepos;

    public ContactServiceImpl(ContactRepos contactRepos) {
        this.contactRepos = contactRepos;
    }

    @Override
    public Contact save(Contact contact) {
        return contactRepos.save(contact);
    }

    @Override
    public void remove(Contact contact) {
        contactRepos.delete(contact);
    }

    @Override
    public List<Contact> findAll() {
        return contactRepos.findAll();
    }

    @Override
    public List<Contact> findAllByName(String name) {
        return contactRepos.findAllByName(name);
    }

    @Override
    public Contact findById(Integer id) {
        return contactRepos.findById(id).get();
    }
}
