package app.repos;

import app.domain.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactRepos extends JpaRepository<Contact, Integer> {
    List<Contact> findAllByName(String name);

}
