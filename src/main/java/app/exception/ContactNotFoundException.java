package app.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.annotation.SessionScope;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ContactNotFoundException extends RuntimeException {
}
