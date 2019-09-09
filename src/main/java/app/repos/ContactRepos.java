package app.repos;

import app.domain.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepos extends JpaRepository<Contact, Integer> {


}
