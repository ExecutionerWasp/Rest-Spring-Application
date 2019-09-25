package app.service;

import app.domain.Contact;
import lombok.NonNull;

import java.util.List;
import java.util.Optional;

public interface ContactService {

    @NonNull
    Contact save(@NonNull Contact contact);

    Contact removeById(@NonNull Contact contact);

    default Contact removeById(@NonNull Integer id){
        return this.removeById(this.findById(id));
    }

    default Contact removeById(@NonNull String id){
        return this.removeById(this.findById(id));
    }

    List<Contact> findAll();

    List<Contact> findAllByName(String name);

    Contact findById(@NonNull Integer id);

    default Contact findById(@NonNull String id) {
        return this.findById(Integer.valueOf(id));
    }
}
