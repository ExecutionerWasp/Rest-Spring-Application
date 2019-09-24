package app.service;

import app.domain.Contact;
import lombok.NonNull;

import java.util.List;

public interface ContactService {

    @NonNull
    Contact save(@NonNull Contact contact);

    void remove(@NonNull Contact contact);

    void removeById(@NonNull Integer id);

    default void removeById(@NonNull String id){
        this.findById(Integer.valueOf(id));
    }

    List<Contact> findAll();

    List<Contact> findAllByName(String name);

    Contact findById(@NonNull Integer id);

    default Contact findById(@NonNull String id) {
        return this.findById(Integer.valueOf(id));
    }
}
